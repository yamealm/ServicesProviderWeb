package com.alodiga.services.provider.commons.models;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.alodiga.services.provider.commons.exceptions.TableNotFoundException;
import com.alodiga.services.provider.commons.genericEJB.AbstractSPEntity;
import com.alodiga.services.provider.commons.genericEJB.SPEntityListerner;

@Entity
@EntityListeners(SPEntityListerner.class)
@Table(name = "top_up_product")
public class TopUpProduct extends AbstractSPEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private Float commissionPercent;
    private String referenceCode;
    private Timestamp creationDate;
    private Boolean isInternational;
    private Integer phoneLength;
    private String internationalCallingCode;
    private String areaCode;
    private Float exRate;
    private Float trxExRate;
    private Float bonus;
    private String updateSource;
    private String instructions;
    private String disclaimer;
    private String commissionFormula;
    private Boolean enabled;
    @ManyToOne(cascade = {CascadeType.REFRESH})
    @JoinColumn(name = "mobileOperatorId")
    private MobileOperator mobileOperator;
    @ManyToOne(cascade = {CascadeType.REFRESH})
    @JoinColumn(name = "providerId")
    private Provider provider;
    @ManyToOne(cascade = {CascadeType.REFRESH})
    @JoinColumn(name = "productDenominationId")
    private ProductDenomination productDenomination;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getCommissionPercent() {
        return commissionPercent;
    }

    public void setCommissionPercent(Float commissionPercent) {
        this.commissionPercent = commissionPercent;
    }

    public String getReferenceCode() {
        return referenceCode;
    }

    public void setReferenceCode(String referenceCode) {
        this.referenceCode = referenceCode;
    }

    public Timestamp getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Timestamp creationDate) {
        this.creationDate = creationDate;
    }

    public Boolean getIsInternational() {
        return isInternational;
    }

    public void setIsInternational(Boolean isInternational) {
        this.isInternational = isInternational;
    }

    public Integer getPhoneLength() {
        return phoneLength;
    }

    public void setPhoneLength(Integer phoneLength) {
        this.phoneLength = phoneLength;
    }

    public String getInternationalCallingCode() {
        return internationalCallingCode;
    }

    public void setInternationalCallingCode(String internationalCallingCode) {
        this.internationalCallingCode = internationalCallingCode;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public Float getExRate() {
        return exRate;
    }

    public void setExRate(Float exRate) {
        this.exRate = exRate;
    }

    public Float getTrxExRate() {
        return trxExRate;
    }

    public void setTrxExRate(Float trxExRate) {
        this.trxExRate = trxExRate;
    }

    public Float getBonus() {
        return bonus;
    }

    public void setBonus(Float bonus) {
        this.bonus = bonus;
    }

    public String getUpdateSource() {
        return updateSource;
    }

    public void setUpdateSource(String updateSource) {
        this.updateSource = updateSource;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public String getDisclaimer() {
        return disclaimer;
    }

    public void setDisclaimer(String disclaimer) {
        this.disclaimer = disclaimer;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public MobileOperator getMobileOperator() {
        return mobileOperator;
    }

    public void setMobileOperator(MobileOperator mobileOperator) {
        this.mobileOperator = mobileOperator;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public ProductDenomination getProductDenomination() {
        return productDenomination;
    }

    public void setProductDenomination(ProductDenomination productDenomination) {
        this.productDenomination = productDenomination;
    }

    @Override
    public Object getPk() {
        return getId();
    }

    @Override
    public String getTableName() throws TableNotFoundException {
        return super.getTableName(this.getClass());
    }

    public String getCommissionFormula() {
        return commissionFormula;
    }

    public void setCommissionFormula(String commissionFormula) {
        this.commissionFormula = commissionFormula;
    }
    
}
