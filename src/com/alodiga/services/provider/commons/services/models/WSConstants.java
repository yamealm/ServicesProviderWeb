package com.alodiga.services.provider.commons.services.models;

public class WSConstants {

    /*Host donde esta el el web service de distribucion APP1*/

    //public static final String HOST = "http://64.211.208.218/";//PRODUCCION
    public static final String HOST = "http://qa.alodiga.com/";//QA

    /*Custom service de pin electronico*/
    public static final Long CUSTOM_SERVICE_ID = 173L; // QA - DESARROLLO
    //public static final Long CUSTOM_SERVICE_ID = 208L; // PRODUCCION
    
    public static final Long WEB_USER_ID_SISAC = 1018L; //QA - DESARROLLO
    //public static final String WEB_USER_ID_SISAC = 27247L;//PRODUCCIÓN
    public static final String WEB_USER_SISAC = "distributionMaster";
    public static final String PASSWORD_SISAC = "1trul3s0v3rth3n3t";// TODO DEBE IR ENCRIPTADO
//    public static final String URL_VALIDATE_USER_SERVICE = HOST + "AlodigaRSMobile/authorize";
//    public static final String URL_CALL_HISTORY_SERVICE = HOST + "AlodigaRSMobile/services/private/calls/list";
//    public static final String URL_PURCHASE_BALANCE_DISTRIBUTOR = HOST + "AlodigaRSMobile/services/private/balance/contract/rechargeDistribution";
//    public static final String URL_CANCEL_PIN_RECHARGE = HOST + "DistributionRS/resources/Pin/cancel/recharge";
//    public static final String URL_PROCESS_VOID = HOST + "DistributionRS/resources/Pin/process/void";
//    public static final String URL_PROVISION_PINFREE = HOST + "DistributionRS/resources/Pin/provision/pinfree";
//    public static final String URL_PROVISION_PINFREE2 = HOST + "DistributionRS/resources/Pin/provision/pinfree2";
//    public static final String URL_PROVISION_PIN = HOST + "DistributionRS/resources/Pin/provision/pin";
//    public static final String URL_PROVISION_PIN_WEB_USER = HOST + "DistributionRS/resources/Pin/provisionWebUser/pin";
//    public static final String URL_RECHARGE_PIN = HOST + "DistributionRS/resources/Pin/preprocess/recharge";
//    public static final String URL_PROCESS_RECHARGE_PIN = HOST + "DistributionRS/resources/Pin/process/recharge";
//    public static final String URL_PROCESS_OPERATION = HOST + "DistributionRS/resources/Pin/process/search/operations";
//    public static final String URL_UPDATE_PINFREE = HOST + "DistributionRS/resources/Pin/update/pinfree";
//    public static final String URL_DELETE_PIN = HOST + "DistributionRS/resources/Pin/deletePin";
//    public static final String URL_GET_PINFREE = HOST + "DistributionRS/resources/Pin/get/pinfree";
//    public static final String URL_GET_EXTENDEDPINDATA = HOST + "DistributionRS/resources/Pin/get/extendedPinData";
//    public static final String URL_GET_ACCESS_NUMBER = HOST + "DistributionRS/resources/Pin/get/AccessNumberByAni";
//    public static final String URL_RECHARGE_PIN_DISTRIBUTOR = HOST + "DistributionRS/resources/Pin/process/rechargeDistributor";
    public static final Long ENTERPRISE_ID = 1L; // FIXME actualizar segun base de datos
    public static final String PARAM_LOGIN = "login";
    public static final String PARAM_PASSWORD = "password";
    public static final String PARAM_TOKEN = "token";
    public static final String PARAM_SERIAL = "serial";
    public static final String PARAM_LANGUAGE_ID = "languageId";
    public static final String PARAM_ENTERPRISE_ID = "enterpriseId";
    public static final String PARAM_BEGGINING_DATE = "beginning";
    public static final String PARAM_ENDING_DATE = "ending";
    public static final String PARAM_WEB_USER_ID = "webUserId";
    public static final String PARAM_PIN_BALANCE = "pinBalance";
    public static final String PARAM_TRANSACTION_DATA = "transactionData";
    public static final String PARAM_PHONE_NUMBER = "phoneNumber";
    public static final String PARAM_PIN_SERIAL = "pinSerial";
    public static final String PARAM_ANI_LIST = "anisList";
    public static final String PARAM_DISTRIBUTOR = "distributor";
    public static final String PARAM_ACCOUNT = "account";
    public static final String PARAM_ORDER_ID = "orderId";
    public static final String PARAM_ANI = "ani";
    public static final String PARAM_AMOUNT = "amount";
    public static final String PARAM_HAS_PAYMENT = "hasPayment";
    public static final String PARAM_PAYMENT_INFO = "paymentInfo";
    public static final String PARAM_CREDIT_CARD_NAME = "creditCardName";
    public static final String PARAM_CREDIT_CARD_NUMBER = "creditCardNumber";
    public static final String PARAM_CREDIT_CARD_CVV = "creditCardCVV";
    public static final String PARAM_CREDIT_CARD_TYPE = "creditCardType";
    public static final String PARAM_CREDIT_CARD_DATE = "creditCardDate";
    public static final String PARAM_CUSTOMER_LOGIN = "login";
    public static final String PARAM_CUSTOMER_EMAIL = "email";
    public static final String PARAM_CUSTOMER_FIRSTNAME = "firstName";
    public static final String PARAM_CUSTOMER_LASTNAME = "lastName";
    public static final String PARAM_COUNTRY_ID = "countryId";
    public static final String PARAM_STATE_ID = "stateId";
    public static final String PARAM_COUNTY_ID = "countyId";
    public static final String PARAM_CITY_ID = "cityId";
    public static final String PARAM_DISTRIBUTOR_CLOSURE_PROCESS_STATUS = "closureProcessStatus";
    public static final String PARAM_CLOSURE_PROCESS_STATUS = "closureProcessStatus";
    public static final String PARAM_ADDRESS = "address";
    public static final String PARAM_ZIPCODE = "zipCode";
    public static final String PARAM_CITY_NAME = "cityName";
    public static final String PARAM_STATE_NAME = "stateName";
    public static final String PARAM_COUNTY_NAME = "countyName";
    public static final String PARAM_CUSTOM_SERVICE_ID = "customServiceId";
    public static final String PARAM_COUNT_ACCESS_NUMBER = "accessNumber";
    public static final String PARAM_USER_SESSION_ID = "sessionId";
    public static final String PARAM_MONTH = "month";
    public static final String PARAM_YEAR = "year";
    public static final String PARAM_DNI = "dni";
    public static final String PARAM_SENDER_NUMBER = "senderNumber";
    public static final String PARAM_SENDER_SMS = "senderSMS";
    public static final String PARAM_DESTINATION_SMS = "destinationSMS";
    public static final String PARAM_QUANTITY = "quantity";
    public static final String PARAM_LANGUAGE = "language";
}
