package com.alodiga.services.provider.commons.models;

public enum PreferenceFieldEnum {

    TIMEOUT_INACTIVE_SESSION(1L, PreferenceTypeValuesEnum.INTEGER),
    MAX_TRANSACTION_AMOUNT_LIMIT(2L, PreferenceTypeValuesEnum.FLOAT),
    MAX_TRANSACTION_LIMIT_PER_ACCOUNT(3l, PreferenceTypeValuesEnum.INTEGER),
    MAX_WRONG_LOGIN_INTENT_NUMBER(4L, PreferenceTypeValuesEnum.INTEGER),
    PERIOD(5l, PreferenceTypeValuesEnum.INTEGER),
    DISABLED_TRANSACTION(6l, PreferenceTypeValuesEnum.INTEGER),
    MAX_TRANSACTION_AMOUNT_DAILY_LIMIT(7L, PreferenceTypeValuesEnum.FLOAT),
    MAX_PROMOTION_TRANSACTION_DAILY_LIMIT(8L, PreferenceTypeValuesEnum.INTEGER),
    DEFAULT_SMS_PROVIDER(9L, PreferenceTypeValuesEnum.INTEGER),
    CYCLES(10L, PreferenceTypeValuesEnum.INTEGER),
    POINT_EXCHANGE(11L, PreferenceTypeValuesEnum.FLOAT);
//    ROYALTY_PERCENT(11L, PreferenceTypeValuesEnum.FLOAT),
//    INACTIVITY_HOLDBACK_PAYMENT(12L, PreferenceTypeValuesEnum.INTEGER),

    private Long id;
    private PreferenceTypeValuesEnum type;

    private PreferenceFieldEnum(Long id, PreferenceTypeValuesEnum preferenceTypeValues) {
        this.id = id;
        this.type = preferenceTypeValues;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setType(PreferenceTypeValuesEnum type) {
        this.type = type;
    }

    public PreferenceTypeValuesEnum getType() {

        return type;

    }
}
