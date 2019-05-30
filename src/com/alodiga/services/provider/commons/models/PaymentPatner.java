package com.alodiga.services.provider.commons.models;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.alodiga.services.provider.commons.exceptions.TableNotFoundException;
import com.alodiga.services.provider.commons.genericEJB.AbstractSPEntity;
import com.alodiga.services.provider.commons.genericEJB.SPEntityListerner;

@Entity
@EntityListeners(SPEntityListerner.class)
@Table(name = "payment_patner")
public class PaymentPatner extends AbstractSPEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    public static final Long AUTHORIZE = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private boolean enabled;
    private String encriptionKey;
    private String name;
    private String paymentUser;
    private boolean testMode;
    private String urlConfirmation;
    private String urlResponse;
    private String urlSubmit;
    //bi-directional many-to-one association to PaymentIntegrationType
    @ManyToOne
    @JoinColumn(name = "integrationTypeId")
    private PaymentIntegrationType paymentIntegrationType;
    //bi-directional many-to-one association to PaymentPatnerHasPaymentType
    @OneToMany(mappedBy = "paymentPatner", cascade = {CascadeType.ALL})
    private List<PaymentPatnerHasPaymentType> paymentPatnerHasPaymentTypes;

    public PaymentPatner() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean getEnabled() {
        return this.enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getEncriptionKey() {
        return this.encriptionKey;
    }

    public void setEncriptionKey(String encriptionKey) {
        this.encriptionKey = encriptionKey;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPaymentUser() {
        return this.paymentUser;
    }

    public void setPaymentUser(String paymentUser) {
        this.paymentUser = paymentUser;
    }

    public boolean getTestMode() {
        return this.testMode;
    }

    public void setTestMode(boolean testMode) {
        this.testMode = testMode;
    }

    public String getUrlConfirmation() {
        return this.urlConfirmation;
    }

    public void setUrlConfirmation(String urlConfirmation) {
        this.urlConfirmation = urlConfirmation;
    }

    public String getUrlResponse() {
        return this.urlResponse;
    }

    public void setUrlResponse(String urlResponse) {
        this.urlResponse = urlResponse;
    }

    public String getUrlSubmit() {
        return this.urlSubmit;
    }

    public void setUrlSubmit(String urlSubmit) {
        this.urlSubmit = urlSubmit;
    }

    public PaymentIntegrationType getPaymentIntegrationType() {
        return this.paymentIntegrationType;
    }

    public void setPaymentIntegrationType(PaymentIntegrationType paymentIntegrationType) {
        this.paymentIntegrationType = paymentIntegrationType;
    }

    public List<PaymentPatnerHasPaymentType> getPaymentPatnerHasPaymentTypes() {
        return this.paymentPatnerHasPaymentTypes;
    }

    public void setPaymentPatnerHasPaymentTypes(List<PaymentPatnerHasPaymentType> paymentPatnerHasPaymentTypes) {
        this.paymentPatnerHasPaymentTypes = paymentPatnerHasPaymentTypes;
    }

    @Override
    public Object getPk() {
        return getId();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String getTableName() throws TableNotFoundException {
        return super.getTableName(this.getClass());
    }
}
