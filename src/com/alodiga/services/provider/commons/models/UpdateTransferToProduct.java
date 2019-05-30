package com.alodiga.services.provider.commons.models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.alodiga.services.provider.commons.exceptions.TableNotFoundException;
import com.alodiga.services.provider.commons.genericEJB.AbstractSPEntity;
import com.alodiga.services.provider.commons.genericEJB.SPEntityListerner;

@Entity
@EntityListeners(SPEntityListerner.class)
@Table(name = "update_transfer_to_product")
public class UpdateTransferToProduct extends AbstractSPEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String countryName;
    private Long transferToCountryId;
    private String operatorName;
    private Long transferToOperatorId;
    private String countryCurrency;
    private String localCurrencyAmount;
    private Float retailPrice;
    private Float wholesalePrice;
    private Float commissionPercent;
    private Long denominationId;
    private Long mobileOperatorId;

    public UpdateTransferToProduct() {
    }

    public UpdateTransferToProduct(Long id, String countryName, Long transferToCountryId, String operatorName, Long transferToOperatorId, String countryCurrency, String localCurrencyAmount, Float retailPrice, Float wholesalePrice, Float commissionPercent, Long denominationId, Long mobileOperatorId) {
        this.id = id;
        this.countryName = countryName;
        this.transferToCountryId = transferToCountryId;
        this.operatorName = operatorName;
        this.transferToOperatorId = transferToOperatorId;
        this.countryCurrency = countryCurrency;
        this.localCurrencyAmount = localCurrencyAmount;
        this.retailPrice = retailPrice;
        this.wholesalePrice = wholesalePrice;
        this.commissionPercent = commissionPercent;
        this.denominationId = denominationId;
        this.mobileOperatorId = mobileOperatorId;
    }

    public Float getCommissionPercent() {
        return commissionPercent;
    }

    public void setCommissionPercent(Float commissionPercent) {
        this.commissionPercent = commissionPercent;
    }

    public String getCountryCurrency() {
        return countryCurrency;
    }

    public void setCountryCurrency(String countryCurrency) {
        this.countryCurrency = countryCurrency;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public Long getDenominationId() {
        return denominationId;
    }

    public void setDenominationId(Long denominationId) {
        this.denominationId = denominationId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLocalCurrencyAmount() {
        return localCurrencyAmount;
    }

    public void setLocalCurrencyAmount(String localCurrencyAmount) {
        this.localCurrencyAmount = localCurrencyAmount;
    }

    public Long getMobileOperatorId() {
        return mobileOperatorId;
    }

    public void setMobileOperatorId(Long mobileOperatorId) {
        this.mobileOperatorId = mobileOperatorId;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public Float getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(Float retailPrice) {
        this.retailPrice = retailPrice;
    }

    public Long getTransferToCountryId() {
        return transferToCountryId;
    }

    public void setTransferToCountryId(Long transferToCountryId) {
        this.transferToCountryId = transferToCountryId;
    }

    public Long getTransferToOperatorId() {
        return transferToOperatorId;
    }

    public void setTransferToOperatorId(Long transferToOperatorId) {
        this.transferToOperatorId = transferToOperatorId;
    }

    public Float getWholesalePrice() {
        return wholesalePrice;
    }

    public void setWholesalePrice(Float wholesalePrice) {
        this.wholesalePrice = wholesalePrice;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public Object getPk() {
        return getId();
    }

    @Override
    public String getTableName() throws TableNotFoundException {
        return super.getTableName(this.getClass());
    }

}
