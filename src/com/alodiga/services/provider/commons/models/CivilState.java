package com.alodiga.services.provider.commons.models;

public enum CivilState {
    SINGLE("sp.enum.civilState.single"),
    MARRIED("sp.enum.civilState.married"),
    DIVORCED("sp.enum.civilState.divorced"),
    WIDOWED("sp.enum.civilState.widowed");
    private String propKey;

    CivilState(String propKey) {
        this.propKey = propKey;
    }

    public String getPropKey() {
        return propKey;
    }
}
