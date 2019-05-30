package com.alodiga.services.provider.commons.models;

import java.io.Serializable;
import java.sql.Timestamp;
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
import javax.persistence.CascadeType;

@Entity
@EntityListeners(SPEntityListerner.class)
@Table(name = "payment")

public class Payment extends AbstractSPEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "paymentTypeId")
    private PaymentType paymentType;
    private String numDeposit;
    private Float amount;
    private Timestamp creationDate;
    @ManyToOne(cascade = {CascadeType.REFRESH})
    @JoinColumn(name = "invoiceId")
    private Invoice invoice;
    private Boolean status;
    @ManyToOne
    @JoinColumn(name = "accountId")
    private Account account;

    public Payment() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }
 
    @Override
    public Object getPk() {
        return getId();
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public Timestamp getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Timestamp creationDate) {
        this.creationDate = creationDate;
    }

    public Boolean getEnabled() {
        return status;
    }

    public void setEnabled(Boolean enabled) {
        this.status = enabled;
    }

    public String getNumDeposit() {
        return numDeposit;
    }

    public void setNumDeposit(String numDeposit) {
        this.numDeposit = numDeposit;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
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
