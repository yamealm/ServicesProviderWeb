package com.alodiga.services.provider.commons.models;

public enum PreferenceTypeValuesEnum {

    INTEGER(1L, "-1"),
    FLOAT(2L, "0.0"),
    STRING(3L, "NONE"),
    DATE(4L, "0000-00-00"),
    PERIOD(5L, "DAY");
    private Long value;
    private String defaultValue;

    PreferenceTypeValuesEnum(Long value, String defaultValue) {
        this.value = value;
        this.defaultValue = defaultValue;
    }

    public Long getValue() {
        return value;
    }

    public void setValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDeafultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }
}
