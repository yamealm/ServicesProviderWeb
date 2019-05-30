package com.alodiga.services.provider.commons.test;

import com.alodiga.services.provider.commons.ejbs.TopUpProductEJB;
import com.alodiga.services.provider.commons.exceptions.GeneralException;
import com.alodiga.services.provider.commons.exceptions.NullParameterException;
import com.alodiga.services.provider.commons.exceptions.RegisterNotFoundException;
import com.alodiga.services.provider.commons.genericEJB.EJBRequest;
import com.alodiga.services.provider.commons.models.Country;
import com.alodiga.services.provider.commons.models.CountryHasProvider;
import com.alodiga.services.provider.commons.models.Enterprise;
import com.alodiga.services.provider.commons.models.MobileOperatorHasProvider;
import com.alodiga.services.provider.commons.models.UpdateTransferToProduct;
import com.alodiga.services.provider.commons.utils.EjbConstants;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.naming.InitialContext;
import junit.framework.TestCase;
import java.util.Iterator;

import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
//import org.apache.poi.xssf.usermodel.XSSFCell;
//import org.apache.poi.xssf.usermodel.XSSFRow;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.text.ParseException;

public class TopUpProductTest extends TestCase {

    TopUpProductEJB topUpProductEJB;

    @Override
    protected void setUp() throws Exception {

        Properties props = new Properties();
        props.setProperty("java.naming.factory.initial", 
                "com.sun.enterprise.naming.SerialInitContextFactory");
        props.setProperty("java.naming.factory.url.pkgs", 
                "com.sun.enterprise.naming");
        props.setProperty("java.naming.factory.state", 
                "com.sun.corba.ee.impl.presentation.rmi.JNDIStateFactoryImpl");
        props.setProperty("org.omg.CORBA.ORBInitialHost", 
                EjbConstants.SERVER);
        props.setProperty("org.omg.CORBA.ORBInitialPort", 
                EjbConstants.PORT);
        InitialContext initialContext = new InitialContext(props);
        topUpProductEJB = (TopUpProductEJB) initialContext
                .lookup(EjbConstants.TOP_UP_EJB);
    }
    
    public void _testInsertCountryCSV(){
        BufferedReader br = null;
        try {
            String fileCSV = "/home/jose/Descargas/List_code_Country.csv";
            String line = "";
            String cvsSplitBy = ",";
            List<UpdateTransferToProduct> uttps = new ArrayList<UpdateTransferToProduct>();
            br = new BufferedReader(new FileReader(fileCSV));
            while ((line = br.readLine()) != null) {
                String[] row = line.split(cvsSplitBy);
                Country country = new Country();
                country.setName(row[1]);
                country.setCode(row[0]);
                topUpProductEJB.saveCountry(country);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TopUpProductTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TopUpProductTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (GeneralException ex) {
            Logger.getLogger(TopUpProductTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NullParameterException ex) {
            Logger.getLogger(TopUpProductTest.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                br.close();
            } catch (IOException ex) {
                Logger.getLogger(TopUpProductTest.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void processTransferTopUps()throws GeneralException, 
            NullParameterException, IOException {
        try {
            String fileCSV = "/tmp/pricelist_open_range_alodigaor.csv";
            String line = "";
            String cvsSplitBy = ",";
            List<UpdateTransferToProduct> uttps = new ArrayList<UpdateTransferToProduct>();
            BufferedReader br = new BufferedReader(new FileReader(fileCSV));
            while ((line = br.readLine()) != null) {
                String[] row = line.split(cvsSplitBy);
                String countryName = row[1];
                String operatorName = row[2];
                Long operatorId = Long.valueOf(row[3]);
                String openRange = row[4];
                Float commissionPercent = Float.valueOf(row[5].replace("%", ""));
                String localCurrencyAmount = row[6];
                Float minimumAmount = Float.valueOf(row[6]);
                Float maximumAmount = Float.valueOf(row[7]);
                String countryCurrency = row[9];
                System.out.println(countryName + "," +
                        operatorName + "," +
                        operatorId + "," +
                        openRange + "," +
                        commissionPercent + "," +
                        localCurrencyAmount + "," +
                        minimumAmount + "," +
                        maximumAmount + "," +
                        countryCurrency + ",");
                if (openRange.equals("Open Range")) {
                    System.out.println("el operdor:" + operatorId + " es open range");
                    Float init = 5f;
                    int j = 0;
                    while (init <= maximumAmount) {
                        System.out.println("guardar la denominacion" + init 
                                + " para el operador:" + operatorId);
                        uttps.add(new UpdateTransferToProduct(null, countryName, 
                                null, operatorName, operatorId, countryCurrency, 
                                String.valueOf(init), null, null, commissionPercent, 
                                null, null));
                        j++;
                        if (init==5f)
                            init=0f;
                        init = init + 10;
                    }
                }else {
                    uttps.add(new UpdateTransferToProduct(null, countryName, null, 
                            operatorName, operatorId, countryCurrency, 
                            localCurrencyAmount, Float.parseFloat(localCurrencyAmount), 
                            null, commissionPercent, null, null));
                }
                System.out.println();
            }
            for (UpdateTransferToProduct uttp : uttps) {
                topUpProductEJB.saveUpdateTransferToProduct(uttp);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (GeneralException ex) {
            ex.printStackTrace();
            throw new GeneralException(ex.getMessage());
        } catch (NullParameterException ex) {
            throw new NullParameterException(ex.getMessage());
        }
    }
    
    public void testexecuteTransferToTopUpUpdate() throws GeneralException{
        Enterprise enterprise = null;
        try {
            //1- Elimina el contenido de la tabla update_transfer_to_product.
            topUpProductEJB.deleteUpdateTransferToProducts();
            //2- Consulta los topUps disponibles de TransferTo en el archivo CSV y los guarda en la tabla update_transfer_to_product
            this.processTransferTopUps();
            //3 - Consulta las denominaciones de los nuevos topUp de TransferTo que no existen en la base de datos de distribución y los guarda.
            topUpProductEJB.processTransferToDenominations();
            //4 - Deshabilita los topUps que no estan disponibles en distribución en relación a los disponibles en TransferTo.
            topUpProductEJB.disableUnAvailableTransferToTopUps();
            //5 - Verifica las Operadoras que no esten disponibles y las agrega automaticamente.
            topUpProductEJB.processTransferToMobileOperators2();
            //6 - Actualiza la información necesaria como porcentaje de comisión denominación y operadoras.
            topUpProductEJB.processTransferToTopUpInformation();
            //7 - Se agregan los nuevos top-Ups y se desactivan los que tengan cambios en comisiones.
            topUpProductEJB.includeTransferToTopUps2();
            //8 - Elimina los top-Ups que estan deshabilitados y que nunca han sido utilizados en una transacción.
            topUpProductEJB.deleteDisabledTransferToProducts();
            //9 -Se envia la notificación de la actualización de las comisiones por realizar.
//            topUpProductEJB.sendTopUpNotificationMail(enterprise, recipients, "Transfer To");
            
            
            
        } catch (GeneralException ex) {
            ex.printStackTrace();
            throw new GeneralException(ex.getMessage());
//        } catch (NullParameterException ex) {
//            Logger.getLogger(TopUpProductTest.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IOException ex) {
//            Logger.getLogger(TopUpProductTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NullParameterException ex) {
            Logger.getLogger(TopUpProductTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TopUpProductTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

//     public void _testUnloapTrnsferTo() {
//         File f = new File("/home/jose/Descargas/pricelist_open_range-neevo.xlsx");
//         if (f.exists()) {
//             try {
//                 ReadCVS(f);
//                 assertTrue(true);
//             } catch (ParseException ex) {
//                 ex.printStackTrace();
//                 fail("" + ex);
//             } catch (GeneralException ex) {
//                 ex.printStackTrace();
//                 fail("" + ex);
//             } catch (NullParameterException ex) {
//                ex.printStackTrace();
//                fail("" + ex);
//             }
//         }
//
//     }

//     public void ReadCVS(File fileName) throws ParseException, GeneralException,NullParameterException{
//        List cellDataList = new ArrayList();
//        try {
////            FileInputStream fileInputStream = new FileInputStream(fileName);
//            XSSFWorkbook workBook = new XSSFWorkbook(fileName.getPath());
//            XSSFSheet hssfSheet = workBook.getSheetAt(0);
//            Iterator rowIterator = hssfSheet.rowIterator();
//            topUpProductEJB.deleteUpdateTransferToProducts();
//            while(rowIterator.hasNext())
//            {
//                XSSFRow hssfRow = (XSSFRow) rowIterator.next();
//                Iterator iterator = hssfRow.cellIterator();
//                List cellTempList = new ArrayList();
//                while (iterator.hasNext()) {
//                    XSSFCell hssfCell = (XSSFCell) iterator.next();
//                    cellTempList.add(hssfCell);
//                }
//                cellDataList.add(cellTempList);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        Leer(cellDataList);
//    }

//    private void Leer(List cellDataList) throws GeneralException, NullParameterException {
//     List<UpdateTransferToProduct> uttps = new ArrayList<UpdateTransferToProduct>();
//      try {
//        for (int i = 0; i < cellDataList.size(); i++) {
//            List cellTempList = (List) cellDataList.get(i);
////            for (int j = 0; j < cellTempList.size(); j++) {
//            XSSFCell hssfCell = (XSSFCell) cellTempList.get(1);
//            String countryName = hssfCell.toString();
//            System.out.print(countryName + " ");
//            hssfCell = (XSSFCell) cellTempList.get(3);
//            Long transferToOperatorId = Long.parseLong(hssfCell.toString().trim());
//            System.out.print(transferToOperatorId + " ");
//            hssfCell = (XSSFCell) cellTempList.get(2);
//            String operatorName = hssfCell.toString();
//            System.out.print(operatorName + " ");
//            hssfCell = (XSSFCell) cellTempList.get(4);
//            String countryCurrency = hssfCell.toString();
//            System.out.print(countryCurrency + " ");
//            hssfCell = (XSSFCell) cellTempList.get(7);
//            String localCurrencyAmount = hssfCell.toString();
//            Float minimumAmount = Float.parseFloat(hssfCell.toString());
//            System.out.print(localCurrencyAmount + " ");
//            hssfCell = (XSSFCell) cellTempList.get(8);
//            Float maximumAmount = Float.parseFloat(hssfCell.toString());
//            System.out.print(maximumAmount + " ");
//            hssfCell = (XSSFCell) cellTempList.get(6);
//            Float commissionPercent = Float.parseFloat(hssfCell.toString());
//            System.out.print(commissionPercent + " ");
//            hssfCell = (XSSFCell) cellTempList.get(5);
//            String openRange = hssfCell.toString().trim();
//            System.out.print(openRange + " ");
//            if (openRange.equals("Open Range")) {
//                System.out.println("el operdor:" + transferToOperatorId + " es open range");
//                Float init = 5f;
//                int j = 0;
//                while (init <= maximumAmount) {
//                    System.out.println("guardar la denominacion" + init + " para el operador:" + transferToOperatorId);
//                    uttps.add(new UpdateTransferToProduct(null, countryName, null, operatorName, transferToOperatorId, countryCurrency, String.valueOf(init), null, null, commissionPercent, null, null));
//                    j++;
//                    if (init==5f)
//                        init=0f;
//                    init = init + 10;
//                }
//            }else {
//                uttps.add(new UpdateTransferToProduct(null, countryName, null, operatorName, transferToOperatorId, countryCurrency, localCurrencyAmount, Float.parseFloat(localCurrencyAmount), null, commissionPercent, null, null));
//            }
//            System.out.println();
//        }
//            for (UpdateTransferToProduct uttp : uttps) {
//                topUpProductEJB.saveUpdateTransferToProduct(uttp);
//
//            }
//        } catch (GeneralException ex) {
//            ex.printStackTrace();
//            throw new GeneralException(ex.getMessage());
//        } catch (NullParameterException ex) {
//            throw new NullParameterException(ex.getMessage());
//        }
//
//        System.out.println("Fin");
//    }



}
