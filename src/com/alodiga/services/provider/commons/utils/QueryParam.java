package com.alodiga.services.provider.commons.utils;

import java.io.Serializable;

public class QueryParam implements Serializable {

    private String operator;
    private String value;

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
