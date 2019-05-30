package com.alodiga.services.provider.commons.utils;

public class Constants {

    public static final String APP_URL = "";
    public static final int MAX_LOGIN_DIGITS = 8;
    public static final int MAX_PASSWORD_DIGITS = 4;
    public static final int MAX_PINFREE = 10;
    public static final int USA_CODE = 1;
    public static final int CUBA_CODE = 53;
    public static final Integer NOTIFICATION_LOGIN = 1;
    public static final Integer NOTIFICATION_PASSDWORD = 2;
    public static final Integer NOTIFICATION_SERIAL = 3;
    public static final Integer NOTIFICATION_ACCESS_NUMBER = 4;
    public static final Integer NOTIFICATION_TOTAL_AMOUNT = 5;
    public static final Integer NOTIFICATION_MAIL_ADDRESS = 6;
    public static final Integer NOTIFICATION_NAME_CUSTOMER = 7;
    public static final Integer NOTIFICATION_CUSTOMER_ENTERPRISE = 8;
    public static final Integer NOTIFICATION_CURRENCY = 9;
    public static final Integer NOTIFICATION_DNI = 10;
    public static final Integer NOTIFICATION_SECRET_PIN = 11;
    public static final String RESPONSE_TRANSACTION = "transaction";
    public static final String RESPONSE_SUCCESSFUL = "successfulVerificationPromotions";
    public static final String RESPONSE_SUCCESS = "success";
    public static final String RESPONSE_SUCCESSFUL_NOTIFICATION = "successfulNotification";
    public static final String RESPONSE_SUCCESSFUL_TRANSACTION = "successfulTransaction";
    public static final String RESPONSE_SUCCESSFUL_COMMISSION = "successfulCommission";
    public static final String RESPONSE_PURCHASE_BALANCE_ACCOUNT = "successfulPurchaseBalanceAccount";
    public static final String RESPONSE_PURCHASE_BALANCE_Distributor = "successfulPurchaseBalanceDistributor";
    public static final String BONUS_APPLIED_PROMOTION = "floatBonusAppliedPromotion";
    public static final String PROMOTION_APPLIED = "promotionApplied";
    public static final String BONUS_APPLIED = "bonusApplied";
    public static final String RESPONSE_PIN = "pin";
    public static final String ELECTRONIC_PIN = "product.category.electronicPin";
    public static final String TOP_UP = "product.category.topUp";
    public static final String RESPONSE_ORDER_RECHARGE = "orderRecharge";
    public static final Float MIN_COMMISSION_ELECTRONIC_PIN = 20F;
    public static final Float MAX_NUMBER_TRANSACTION = 5F;
    public static final int MAX_SMS_PER_CUSTOMER = 1;
    public static final Long PINLINE_PLAN=10104L;
    public static final String USA_CURRENCY="$";
	public static final Long PINLINE_SERVICE_CODE = 12L;

        // Correos
    public static String SMTP_SERVER = "smtp1.vpn.alodiga.com";
    public static String DEV_REPORT = "dev-reports@interaxmedia.com";
    public static String IP_ADDRESS_SP_EJB = "192.168.201.21";
    //Codigo error de KDDI
    public static String ERROR_PHONE_NUMBER = "219";
    public static String INVALID_PRODUCT = "319";
    public static String ERROR_GENERAL_RECHARGE = "309";
    public static String HTTP_ERROR_TO_HTTPS = "14";
    public static String ERROR_AUTENTICATION = "101";
    public static String LIMIT_TRANSACTION = "-103";
    public static String INVALID_PARAMETER = "-106";
    public static String PARAMETER_CAN_NOT_BE_NULL = "606";
    public static String ERROR_INVALID_PRODUCT = "110";
    public static String ERROR_KDDI_REMOTE = "303";
    public static String ERROR_KDDI_UNAVAILABLE_SERVICES = "304";
    public static String TRANSACTION_AMOUNT_INVALID = "676";
    public static String TRANSACTION_SUCCESSFUL = "0";
    public static Long COUNTRY_ID_CUBA = 39L;
    public static String ORDER_STATUS_PROCESS = "4";
    public static String INVOICE_TYPE_PIN_LINE = "1";
    public static String INVOICE_STATUS_PROCESS = "2";
    public static String INVOICE_TYPE_PIN_LESS = "2";
}
