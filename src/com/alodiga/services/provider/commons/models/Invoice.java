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
import java.util.List;
import javax.persistence.OneToMany;

@Entity
@EntityListeners(SPEntityListerner.class)
@Table(name = "invoice")
public class Invoice extends AbstractSPEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(cascade = {CascadeType.REFRESH})
    @JoinColumn(name = "enterpriseId")
    private Enterprise enterprise;
    @ManyToOne(cascade = {CascadeType.REFRESH})
    @JoinColumn(name = "invoiceStatusId")
    private InvoiceStatus invoiceStatus;
    @ManyToOne(cascade = {CascadeType.REFRESH})
    @JoinColumn(name = "accountId")
    private Account account;
    private String numberInvoice;
    private Float taxTotal= 0F;
    private Float total= 0F;
    private Float exemptTotal= 0F;
    private Float otherCharges= 0F;
    private Float previousBalance= 0F;
    private Float totalToPay= 0F;
    @ManyToOne(cascade = {CascadeType.REFRESH})
    @JoinColumn(name = "currencyId")
    private Currency currency;
    private Timestamp emissionDate;
    private Timestamp beginningDate;
    private Timestamp closingDate;
    private Integer chargeAttempts;
    private Long emailStatus;
    private byte[] XMLAddress;

//    @OneToMany(mappedBy = "invoice", cascade = CascadeType.ALL)
//    private List<Transaction> transaction;

    public Invoice() {
    }


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public byte[] getXMLAddress() {
        return XMLAddress;
    }

    public void setXMLAddress(byte[] XMLAddress) {
        this.XMLAddress = XMLAddress;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Timestamp getBeginningDate() {
        return beginningDate;
    }

    public void setBeginningDate(Timestamp beginningDate) {
        this.beginningDate = beginningDate;
    }

    public Integer getChargeAttempts() {
        return chargeAttempts;
    }

    public void setChargeAttempts(Integer chargeAttempts) {
        this.chargeAttempts = chargeAttempts;
    }

    public Timestamp getClosingDate() {
        return closingDate;
    }

    public void setClosingDate(Timestamp closingDate) {
        this.closingDate = closingDate;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }


    public Long getEmailStatus() {
        return emailStatus;
    }

    public void setEmailStatus(Long emailStatus) {
        this.emailStatus = emailStatus;
    }

    public Timestamp getEmissionDate() {
        return emissionDate;
    }

    public void setEmissionDate(Timestamp emissionDate) {
        this.emissionDate = emissionDate;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public Float getExemptTotal() {
        return exemptTotal;
    }

    public void setExemptTotal(Float exemptTotal) {
        this.exemptTotal = exemptTotal;
    }

    public InvoiceStatus getInvoiceStatus() {
        return invoiceStatus;
    }

    public void setInvoiceStatus(InvoiceStatus invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
    }

    public String getNumberInvoice() {
        return numberInvoice;
    }

    public void setNumberInvoice(String numberInvoice) {
        this.numberInvoice = numberInvoice;
    }

    public Float getOtherCharges() {
        return otherCharges;
    }

    public void setOtherCharges(Float otherCharges) {
        this.otherCharges = otherCharges;
    }

    public Float getPreviousBalance() {
        return previousBalance;
    }

    public void setPreviousBalance(Float previousBalance) {
        this.previousBalance = previousBalance;
    }

    public Float getTaxTotal() {
        return taxTotal;
    }

    public void setTaxTotal(Float taxTotal) {
        this.taxTotal = taxTotal;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public Float getTotalToPay() {
        return totalToPay;
    }

    public void setTotalToPay(Float totalToPay) {
        this.totalToPay = totalToPay;
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
