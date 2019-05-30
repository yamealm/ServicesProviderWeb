package com.alodiga.services.provider.commons.models;

import java.io.Serializable;
import java.util.Date;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "address")
public class ResponseAddress implements Serializable {

    private static final long serialVersionUID = -224153612976477547L;
    @Element(name = "countryId", required = false)
    private String countryId;
    @Element(name = "stateId", required = false)
    private String stateId;
    @Element(name = "cityId", required = false)
    private String cityId;
    @Element(name = "countyId", required = false)
    private String countyId;
    @Element(name = "address1", required = false)
    private String address1;
    @Element(name = "zipCode", required = false)
    private String zipCode;
    @Element(name = "stateName", required = false)
    private String stateName;
    @Element(name = "countyName", required = false)
    private String countyName;
    @Element(name = "cityName", required = false)
    private String cityName;

    public ResponseAddress() {
        super();
    }

    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public String getStateId() {
        return stateId;
    }

    public void setStateId(String stateId) {
        this.stateId = stateId;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCountyId() {
        return countyId;
    }

    public void setCountyId(String countyId) {
        this.countyId = countyId;
    }
}
