package com.alodiga.services.provider.commons.models;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class TopUpResponseConstants {

    public static String CODE = "Code";
    public static String MESSAGE = "Message";
    public static String ADDITIONAL_MESSAGE = "AdditionalMessage";
    public static String RETAILER_ID = "RetailerID";
    public static String TRANSACTION_DATE = "TransactionDate";
    public static String EXTERNAL_ID = "ExternalID";
    public static String INSTRUCTIONS = "Instructions";
    public static String DISCLAIMER = "Disclaimer";
    public static String ORDER_NUMBER = "OrderNumber";
    public static String DISTRIBUTOR = "Distributor";
    public static String AMOUNT = "Amount";
    public static String TRANSACTION_MESSAGE = "TransactionMessage";
    /*Esta constante no está relacionada con la respuesta de EasyCall.
     Posteriormente la usaremos para concatenar la respuesta en un String*/
    public static String COMPLETE_RESPONSE = "CompleteResponse";

    public static String ERROR_CODE = "error_code";
    public static String ERROR_TEXT = "error_txt";
    public static String AUTHENTICATION_KEY = "authentication_key";
    public static String DESTINATION_NUMBER = "destination_number";
    public static String SENDER_NUMBER = "sender_number";
    public static String OPERATOR_NAME = "operator_name";
    public static String LANGUAGE_ID = "language_id";
    public static String SMS_DESTINATION = "sms_destination";
    public static String SMS_SENDER = "sms_sender";


    
    public static final Map<String, String> EASY_CALL_CODES;
    static {
        Map<String, String> aMap = new HashMap<String, String>();
        aMap.put("0", "SuccessfulTransaction");
        aMap.put("6000", "Provider Platform error");
        aMap.put("6001", "Authentication error");
        aMap.put("6002", "Invalid username or password");
        aMap.put("6003", "No products available");
        aMap.put("6004", "Retailer was disabled");
        aMap.put("6005", "Order not registered");
        aMap.put("6006", "Not authorized to modify");
        aMap.put("6007", "Not authorized to void this order");
        aMap.put("6008", "This order cannot be voided");
        aMap.put("6009", "This order was not Acknowledge/Confirmed");
        aMap.put("6010", "Too many orders not Acknowledge/Confirmed");
        aMap.put("6011", "Product not authorized to be transacted");
        aMap.put("6012", "Invalid quantity");
        aMap.put("6013", "Product is disabled");
        aMap.put("6014", "Credit limit exceeded");
        aMap.put("6015", "Invalid product delivery method");
        aMap.put("6016", "This order has been Acknowledge/Confirmed");
        aMap.put("6017", "This order has been cancelled before");
        aMap.put("6018", "The transaction has been cancelled: No PINs Available");
        aMap.put("6019", "Provider response error when trying to execute transaction");
        aMap.put("6020", "Provider connection not available");
        aMap.put("6021", "Invalid amount format");
        aMap.put("6022", "Invalid denomination for this product");
        aMap.put("6023", "TopUp transaction failed");
        aMap.put("6024", "Another transaction with same data exists, wait a few minutes to try again");
        aMap.put("6025", "Zip Code and Store ID data required");
        aMap.put("6026", "We can not permit transactions from this zip code");
        aMap.put("6027", "Boss Revolution -­‐ product not loaded");
        aMap.put("6028", "Boss Revolution -­‐ provider cannot create the distributor");
        aMap.put("6029", "Boss Revolution -­‐ invalid language");
        aMap.put("6030", "Boss Revolution -­‐ invalid PIN");
        aMap.put("6031", "Boss Revolution -­‐ invalid Caller ID");
        aMap.put("6032", "Boss Revolution -­‐ invalid Transaction Type");
        aMap.put("6033", "Boss Revolution -­‐ transaction cannot be made");
        aMap.put("6034", "Boss Revolution -­‐ invalid Phone Number");

        EASY_CALL_CODES = Collections.unmodifiableMap(aMap);
    }

    public static final Map<String, String> TRANSFER_TO_CODES;
    static {
        Map<String, String> aMap = new HashMap<String, String>();

        aMap.put("0", "Transactionsuccessful");
        aMap.put("101", "DestinationMSISDNoutofrange");
        aMap.put("104","MSISDNinblacklist");
        aMap.put("105","Notenoughcreditonyourdistributor");
        aMap.put("201","Transactionrefused");
        aMap.put("203","Transactionincomplete");
        aMap.put("204","DestinationDistributorisnotprepaid");
        aMap.put("205","OriginatingDistributorisnotprepaid");
        aMap.put("206","Erroratdebitconfirmation");
        aMap.put("207","Transactionamountlimitexceeded");
        aMap.put("208","Dayamountlimitexceeded");
        aMap.put("209","Totalamountlimitexceeded");
        aMap.put("210","Originatordailylimitexceeded");
        aMap.put("211","Destinationdailylimitexceeded");
        aMap.put("212","Destinationmaximumbalanceexceeded");
        aMap.put("213","Duplicated transaction");
        aMap.put("214","Topup refused");
        aMap.put("215","Denomination currently unavailable");
        aMap.put("216","Destination number not activated");
        aMap.put("217","Destination number expired");
        aMap.put("218","Request timeout");
        aMap.put("219","Key does not exist");
        aMap.put("220","Request timeout");
        aMap.put("221","Fraud suspicion");
        aMap.put("222","Mobilenumber temporarily barred from refill");
        aMap.put("223","ID not reserved");
        aMap.put("224","Invalid length of destination MSISDN");
        aMap.put("230","Recipient reached maximum topup number");
        aMap.put("231","Recipient reached maximum topup amount");
        aMap.put("301","Denomination not available");
        aMap.put("303","output_value out of range");
        aMap.put("310","Denomination blocked");
        aMap.put("401","transactionid not found");
        aMap.put("901","Invalid action");
        aMap.put("902","Invalid input_currency");
        aMap.put("903","Invalid output_currency");
        aMap.put("904","Invalid input_value");
        aMap.put("905","Invalid start_date");
        aMap.put("906","Invalid stop_date");
        aMap.put("907","Invalid transactionid");
        aMap.put("908","Distributor not configured for this service");
        aMap.put("909","Invalid flag");
        aMap.put("919","All needed argument not received");
        aMap.put("921","Wrong key encoding");
        aMap.put("922","Originating IP not allowed");
        aMap.put("923","Key already used or invalid key value");
        aMap.put("998","System not available. Please retry later.");
        aMap.put("999","Unknown error. Please contact support.");

        TRANSFER_TO_CODES = Collections.unmodifiableMap(aMap);
    }

    public static final Map<String, String> PREPAY_NATION_CODES;
    static {
        Map<String, String> aMap = new HashMap<String, String>();

        aMap.put("0", "Transactionsuccessful");
        aMap.put("001", "The charge amount for Denomination {0} should be between {1} and {2}");
        aMap.put("003","Transaction cannot be performed as the Credit Limit for Customer {0} has been exceeded");
        aMap.put("004","Transaction cannot be performed as the Daily transaction Limit for Customer {0} has been exceeded");
        aMap.put("005","For Location {0}, transaction can only be performed between {1} and {2}");
        aMap.put("009","The users daily limit has been exceeded. Please contact customer support");
        aMap.put("015","The System failed to complete the Rtr Transaction. Unexpected error occurred.");
        aMap.put("027","The mobile number {0} was last charged at {1}. System does not allow recharging of a mobile number within {2} minutes");
        aMap.put("032","The Total Charge amount for a mobile number is limited to $200 per day");
        aMap.put("033","The Mobile Number is not in right format.");
        aMap.put("035","Transaction cannot be performed as the Exposure Limit for Customer {0} has been exceeded");
        aMap.put("041","The Carrier {0} is under maintenance. The following advisory has been issued {1}.");
        aMap.put("500","The Account was not activated. a) Possible reasons are: Subscriber number is not found. b) Subscriber account is suspended c) Carrier's experienced internal error. Please try again");
        aMap.put("501","The Subscriber number is not valid");
        aMap.put("502","The Topup was unsuccessful. The Subscriber account might be suspended");
        aMap.put("503","The Subscriber will exceed limit");
        aMap.put("520","An internal error occurred in Carrier's system, Please try again");
        aMap.put("530","The Carrier rejected the transaction due to daily limit. Please contact customer support immediately");
        aMap.put("540","The transaction is a possible duplicate. Please make sure the number is not charged recently. The transaction can be flagged as possible duplicate, even if the number has been charged somewhere else");
        aMap.put("560","The Carrier timed out the request. Please try again");
        aMap.put("570","The Carrier system is not available. Please try again");
        aMap.put("580","Communication with Carrier system could not be established. Please try again");
        aMap.put("590","Unexpected error occurred while calling the Carrier system. Please try again");
        aMap.put("600","An Unknown error occurred while calling the Carrier system. Please try again");
        aMap.put("998","The transactions system is offline right now. The System will come online in {0} minutes and {1} seconds");
        aMap.put("999","Unspecified system error occurred");

        PREPAY_NATION_CODES = Collections.unmodifiableMap(aMap);
    }
}

