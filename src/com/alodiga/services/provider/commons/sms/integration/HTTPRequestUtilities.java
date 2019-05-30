package com.alodiga.services.provider.commons.sms.integration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;


public class HTTPRequestUtilities {

   /**
    * Envía una solicitud HTTP GET a una URL
    *
    * @param endpoint - La URL del servidor. (Ejemplo: " http://www.alodiga.us/services")
    * @param requestParameters - todos los parámetros de la solicitud (Ejemplo: "param1=val1&param2=val2"). Nota: Este método agregará el signo de interrogación (?) a la solicitud - NO AGREGAR a la cadena de parámteros
    * @return - La respuesta del end point
    */
    public static String sendGetRequest(String endpoint, String requestParameters) throws Exception {

        String result = null;
        if (endpoint.startsWith("http://")) {
            //Enviar una solicitud GET al servlet
            try {
                // Send data
                String urlStr = endpoint;
                if (requestParameters != null && requestParameters.length () > 0) {
                    urlStr += "?" + requestParameters;
                }
                URL url = new URL(urlStr);
                URLConnection conn = url.openConnection ();
                //Obtener la respuesta
                BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                StringBuilder sb = new StringBuilder();
                String line;
                while ((line = rd.readLine()) != null) {
                    sb.append(line);
                }
                rd.close();
                result = sb.toString();
            } catch (Exception e) {
                throw e;
            }
        }

        return result;

    }

  /**
    * Lee los datos del Reader de datos y lo publica en un servidor a través de una solicitud POST
    * data - los datos que se desea enviar
    * endpoint - la URL del servidor
    * output - referencia al objeto donde se escribe la respuesta recibida
    * @throws Exception
    */
    public static void postData(Reader data, URL endpoint, Writer output) throws Exception {
        HttpURLConnection urlc = null;
        try {
            urlc = (HttpURLConnection) endpoint.openConnection();
            try {
                urlc.setRequestMethod("POST");
            } catch (ProtocolException e) {
                throw new Exception("Shouldn't happen: HttpURLConnection doesn't support POST??", e);
            }
            urlc.setDoOutput(true);
            urlc.setDoInput(true);
            urlc.setUseCaches(false);
            urlc.setAllowUserInteraction(false);
            urlc.setRequestProperty("Content-Type","application/x-www-form-urlencoded");
            OutputStream out = urlc.getOutputStream();
            try {
                Writer writer = new OutputStreamWriter(out, "UTF-8");
                pipe(data, writer);
                writer.close();
            } catch (IOException e) {
                throw new Exception("IOException while posting data", e);
            } finally {
                if (out != null)
                out.close();
            }
            InputStream in = urlc.getInputStream();
            try {
                Reader reader = new InputStreamReader(in);
                pipe(reader, output);
                reader.close();
            } catch (IOException e) {
                throw new Exception("IOException while reading response", e);
            } finally {
                if (in != null)
                in.close();
            }
        } catch (IOException e) {
            throw new Exception("Connection error (is server running at " + endpoint + " ?): " + e);
        } finally {
            if (urlc != null)
            urlc.disconnect();
        }
    }

    public static String formatToUTF8(String message) {
        return message == null ? null : message.replaceAll(" ", "%20");
    }

   /**
    * Obtiene todo desde el Reader al Writer vía buffer
    */
    private static void pipe(Reader reader, Writer writer) throws IOException {
        char[] buf = new char[1024];
        int read = 0;
        while ((read = reader.read(buf)) >= 0) {
            writer.write(buf, 0, read);
        }
        writer.flush();
    }

}
