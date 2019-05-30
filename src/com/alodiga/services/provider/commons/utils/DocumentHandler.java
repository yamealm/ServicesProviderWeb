package com.alodiga.services.provider.commons.utils;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class DocumentHandler {

    public Document dom;
    private static String MODEL_PACKAGE_NAME = "com.interax.telephony.dialer.commons";

    public Document getDom() {
        return dom;
    }

    public void setDom(Document dom) {
        this.dom = dom;
    }

    public static Document getDocumentInstance(InputStream is) {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        Document doc = null;
        try {
            DocumentBuilder db = dbf.newDocumentBuilder();
            doc = db.parse(is);
        } catch (ParserConfigurationException pce) {
            pce.printStackTrace();
        } catch (SAXException se) {
            se.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return doc;
    }

    public Document loadDocument(InputStream is) {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        Document doc = null;
        DocumentBuilderFactory doc_build_fact = null;
        DocumentBuilder doc_builder = null;

        try {
            DocumentBuilder db = dbf.newDocumentBuilder();
            doc = db.parse(is);
            dom = doc; //
        } catch (ParserConfigurationException pce) {
            pce.printStackTrace();
        } catch (SAXException se) {
            se.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return doc;
    }

    public Document loadDocument(String s) {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder;
        Document doc = null;
        DocumentBuilderFactory doc_build_fact = null;
        DocumentBuilder doc_builder = null;

        try {
            builder = dbf.newDocumentBuilder();
            StringReader reader = new StringReader(s);
            InputSource inputSource = new InputSource(reader);
            doc = builder.parse(inputSource);
            reader.close();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return doc;
    }

    public List documentParser(String tagName) {
        NodeList nl = dom.getElementsByTagName(tagName);
        List objectList = new ArrayList();
        int totalNodes = nl.getLength();
        if (nl != null && totalNodes > 0) {
            for (int i = 0; i < totalNodes; i++) {

                try {

                    Element elemento = (Element) nl.item(i);
                    String name = elemento.getNodeName();
                    name = name.replaceFirst(name.substring(0, 1), name.substring(0, 1).toUpperCase());
                    name = MODEL_PACKAGE_NAME + "." + name;

                    // b. Obtener el objeto empleado
                    Object myObject = getObject(elemento, name);

                    // c. Anidarlo a la lista
                    objectList.add(myObject);

                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
        return objectList;
    }

    private static Object getObject(Element elemento, String cName) {
        Class obj;
        String methodName;
        Object myInstance = null;
        try {
            obj = Class.forName(cName);

            myInstance = obj.newInstance();

            Method[] metList = obj.getDeclaredMethods();

            for (int i = 0; i < metList.length; i++) {
                methodName = (metList[i].getName().startsWith("set")) ? metList[i].getName() : "";
                if (methodName.equals("setId")) {
                    metList[i].invoke(myInstance, elemento.getAttribute("id"));
                } else if (!methodName.equals("")) {
                    String tempAtribute = methodName.substring(3);

                    metList[i].invoke(myInstance, getText(elemento, tempAtribute.replace(tempAtribute.substring(0, 1), tempAtribute.substring(0, 1).toLowerCase()), false));
                }
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        return myInstance;
    }

    private static String getText(Element elemento, String tagName, boolean isElement) {
        String text = null;

        if (isElement) {
            NodeList nl = elemento.getElementsByTagName(tagName);
            if (nl != null && nl.getLength() > 0) {
                Element el = (Element) nl.item(0);
                text = el.getFirstChild().getNodeValue();
            }
        } else {
            text = elemento.getAttribute(tagName);
        }
        return text;
    }

    //Ojo: Implementar
    public static void addRegistrer(Document doc, Object o, String nodeParent) {
        NodeList nodes = doc.getElementsByTagName(nodeParent);
        Element element = createElementByObject(o, doc);
        if (nodes.getLength() > 0) {
            Node node = nodes.item(0);
            node.appendChild(element);
        }
    }

    public static void removeRegistrer(Document doc, String id) {
        Element element = doc.getElementById(id);
        if (element != null) {
            element.getParentNode().removeChild(element);
        }

    }

    public static void updateRegistrer(Document doc, String id, Object o, String nodeParent) {
        removeRegistrer(doc, id);
        addRegistrer(doc, o, nodeParent);
    }

    public static Element createElementByObject(Object o, Document doc) {
        Class clazz = o.getClass();
        String methodName;
        Object myInstance = o;
        Element element = doc.createElement(clazz.getSimpleName());

        try {

            Method[] metList = clazz.getDeclaredMethods();

            for (int i = 0; i < metList.length; i++) {
                methodName = (metList[i].getName().startsWith("get")) ? metList[i].getName() : "";
                if (!methodName.equals("")) {
                    String aName = methodName.substring(3).toLowerCase();
                    String aValue = "" + metList[i].invoke(myInstance, null);
                    element.setAttribute(aName, aValue);
                }
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        return element;


    }

    public static Object objectFromXml(String xml, Class returnClass) {
        if (xml.contains("Token expired")) {
        }

        InputStream os = new ByteArrayInputStream(xml.getBytes());
        Serializer serializer = new Persister();
        try {
            return serializer.read(returnClass, os);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Object objectFromXml(File file, Class returnClass) {
        Serializer serializer = new Persister();
        try {
            return serializer.read(returnClass, file);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void objectToXml(Object o, File file) {
        Serializer serializer = new Persister();
        try {
            serializer.write(o, file);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String objectToXml(Object o) {
        StringWriter writer = new StringWriter();
        Serializer serializer = new Persister();
        try {
            serializer.write(o, writer);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return writer.toString();
    }
}
