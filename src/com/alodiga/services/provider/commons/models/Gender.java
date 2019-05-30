package com.alodiga.services.provider.commons.models;

public enum Gender {

    M("sp.enum.gender.male"),
    F("sp.enum.gender.female");
    private String propKey;

    Gender(String propKey) {
        this.propKey = propKey;
    }

    public String getPropKey() {
        return propKey;
    }
}
