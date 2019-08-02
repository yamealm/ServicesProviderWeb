package com.alodiga.services.provider.commons.utils;

public class EjbConstants {

    public static String SERVER = "localhost";
//    public static String SERVER = "app2.vpn.alodiga.com";
    public static String PORT = "3700";
    public static final String ACCESS_CONTROL_EJB = "ejb/services/provider/AccessControlEJB";
    public static final String AUDITORY_EJB = "ejb/services/provider/AuditoryEJB";
    public static final String CUSTOMER_EJB = "ejb/services/provider/CustomerEJB";
    public static final String COMMISSION_TIMER_EJB = "ejb/services/provider/CommissionTimerEJB";
    public static final String CLOSURE_PROCESS_TIMER_EJB = "ejb/services/provider/ClosureProcessTimerEJB";
    public static final String PROMOTION_TIMER_EJB = "ejb/services/provider/PromotionTimerEJB";
    public static boolean DEVELOPMENT_BILLING = false;
    public static final String NOTIFICATION_EJB = "ejb/services/provider/NotificationEJB";
    public static final String BANNER_EJB = "ejb/services/provider/BannerEJB";
    public static final String PREFERENCES_EJB = "ejb/services/provider/PreferencesEJB";
    public static final String PRODUCT_EJB = "ejb/services/provider/ProductEJB";
    public static final String PROMOTION_EJB = "ejb/services/provider/PromotionEJB";
    public static final String REPORT_EJB = "ejb/services/provider/ReportEJB";
    public static final String SMS_INTEGRATION_EJB = "ejb/services/provider/SMSIntegrationEJB";
    public static final String SOLICITUDE_EJB = "ejb/services/provider/SolicitudeEJB";
    public static final String TRANSACTION_EJB = "ejb/services/provider/TransactionEJB";
    public static final String TROUBLE_TICKET_EJB = "ejb/services/provider/TroubleTicketEJB";
    public static final String USER_EJB = "ejb/services/provider/UserEJB";
    public static final String UTILS_EJB = "ejb/services/provider/UtilsEJB";
    public static final String CALL_CENTER_EJB = "ejb/services/provider/UtilsEJB";
    public static final String SERVICES_UTILS_EJB = "ejb/services/provider/ServicesUtilsEJB";
    public static final String TOP_UP_EJB = "ejb/services/provider/TopUpProductEJB";
    public static final String WS_EJB = "ejb/services/provider/WSEJB";
    public static final String SERVICES_EJB = "ejb/services/provider/ServicesEJB";
    public static final String EXTERNAL_SERVICES_EJB = "ejb/services/provider/ExternalServicesEJB";
    public static final String BILL_PAYMENT_UPDATE_TIMER_EJB = "ejb/services/provider/BillPaymentUpdateTimerEJB";
    public static final String TOP_UP_TIMER_EJB = "ejb/services/provider/TopUpTimerEJB";
    public static final String TRANSFER_TO_TIMER_EJB = "ejb/services/provider/TransferToTimerEJB";
    public static final String BILLING_TIMER_EJB = "ejb/services/provider/BillingTimerEJB";
    public static final String BILLINGS_EJB = "ejb/services/provider/BillingsEJB";
    public static final String BILLING_UPDATE_TIMER_EJB = "ejb/services/provider/BillingUpdateTimerEJB";
    public static final String PREPAY_NATION_TOP_UP_UPDATE_TIMER_EJB = "ejb/services/provider/PrepayNationTopUpUpdateTimerEJB";
    public static final String SISAC_INTEGRATION_EJB = "ejb/services/provider/SisacIntegrationEJB";
    public static final String BILLPAYMENT_EJB = "ejb/services/provider/BillPaymentEJB";
    public static final String MLAT_TOP_UP_EJB = "ejb/MLATIntegration/TopUpEJB";
    public static final String MLAT_PREFERENCE_EJB= "ejb/MLATIntegration/PreferenceEJB";
    public static final String MPI_TOP_UP_EJB = "ejb/MobilePinInventoryIntegration/TopUpEJB";
    public static final String MPI_PREFERENCE_EJB= "ejb/MobilePinInventoryIntegration/DenominationEJB";
    public static final String MPI_CARD_EJB= "ejb/MobilePinInventoryIntegration/CardEJB";
    public static final String MPI_ACCESS_CONTROL_EJB= "ejb/MobilePinInventoryIntegration/AccessControlEJB";
    public static final String AUTOMATIC_PROCESS_TIMER_EJB = "ejb/services/provider/AutomaticProcessTimerEJB";

    //mensajes
     public static final String PIN_FACEBOOK_REFERENCE= "Compra Pin Electronico refenciado por facebook";
     public static final String ACTIVE_PIN_FACEBOOK_REFERENCE= "Activacion de  Pin Electronico refenciado por facebook";

    //nuevo

      public static String INVOICE_EJB = "ejb/InvoiceEJB";
      public static String CONTRACT_EJB = "ejb/ContractEJB";
      public static final String ENERGUATE_SERVICES_EJB = "ejb/services/provider/EnerguateServicesEJB";

    //CAMBIAR
    public static final String PROPERTIES_PACKAGE = "com.alodiga.services.provider.commons.utils.";
    public static final String ERROR_FILE_NAME = PROPERTIES_PACKAGE + "system_error";
    public static final String MESSAGE_FILE_NAME = PROPERTIES_PACKAGE + "system_message";
    //ERROR
    public static final String ERR_GENERAL_EXCEPTION = "E000";
    public static final String ERR_NULL_PARAMETER = "E001";
    public static final String ERR_INCORRECT_PARAMETER = "E002";
    public static final String ERR_EMPTY_LIST_EXCEPTION = "E003";
    public static final String ERR_REGISTER_NOT_FOUND_EXCEPTION = "E004";
    public static final String ERR_INVALID_FORTMAT_EXCEPTION = "E005";
    public static final String ERR_INVALID_REFERENCE_EXCEPTION = "E006";
    public static final String ERR_PERSISTENCE_LAYER = "E020";
    public static final String ERR_CRUD_ENTITY = "E021";
    public static final String MSG_INIT_INVOCATION_METHOD = "M001";
    public static final String ERR_MAX_AMOUNT_BALANCE = "E007";
    public static final String ERR_MIN_AMOUNT_BALANCE = "E008";
    public static final String ERR_NOT_PIN_PROVISION = "E030";
    public static final String ERR_NOT_PIN_PROVISION_ANI = "E031";
    public static final String ERR_ERROR_RECHARGE = "E032";
    public static final String ERR_NOT_PROCESS_RECHARGE = "E033";
    public static final String ERR_PURCHASE_DENIED = "E034";
    public static final String ERR_TRANSACTION_NOT_AVAILABLE = "E035";
    public static final String ERR_MAX_AMOUNT_PER_TRANSACTION = "E036";
    public static final String ERR_MAX_AMOUNT_DAILY = "E037";
    public static final String ERR_MAX_PROMOTION_TRANSACTION_DAILY = "E038";
    public static final String ERR_CANNOT_UNPROVISION_PIN_RECHARGE = "E039";
    public static final String ERR_CANNOT_REVERSE_BALANCE_ALOPOINTS = "E040";
    public static final String ERR_NORESULTEXCEPTION = "E041";
    public static final String ERR_PIN_DISABLED_EXCEPTION = "E042";
    public static final String ERR_PIN_FREE_NOT_FOUND_EXCEPTION = "E043";
    public static final String ERR_MAX_NUMBER_TRANSACTION_DAILY_PER_DESINATION = "E044";
    public static final String ERR_MAX_NUMBER_TRANSACTION_DAILY_PER_SENDER = "E045";
    public static final String ERR_MAX_AMOUNT_PURCHASE = "E046";
    public static final String ERR_MAX_AMOUNT_RECHARGE = "E047";
    public static final String ERR_MAX_CREDIT_CARD = "E048";
    public static final String ERR_PAYMENTINFO_NOT_FOUND = "E049";
    public static final int ENTERPRISE_ID_USA = 1;

    //  Host
    //public static final String PRODUCTION_HOST = "http://64.211.208.218/";//APP1
    public static final String TEST_PHONE_NUMBER_ = "584245398150";
    public static final String PHONE_NUMBER_DESTINATION = "584243671390";

}
