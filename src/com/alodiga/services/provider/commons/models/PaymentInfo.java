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
import com.alodiga.services.provider.commons.utils.Encrypter;
import javax.persistence.Column;
import javax.persistence.Lob;

@Entity
@EntityListeners(SPEntityListerner.class)
@Table(name = "payment_info")
public class PaymentInfo extends AbstractSPEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Timestamp beginningDate;
    @Lob
    @Column(name = "creditCardNumber", length = 40, nullable = false)
    private byte[] creditCardNumber;
    @Lob
    @Column(name = "creditcardCVV", length = 40, nullable = false)
    private byte[] creditcardCVV;
    private Timestamp creditCardDate;
    private String creditCardName;
    private Timestamp endingDate;
    @ManyToOne(cascade = {CascadeType.REFRESH})
    @JoinColumn(name = "billingAddressId")
    private Address address;
    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "paymentPatnerId")
    private PaymentPatner paymentPatner;
    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "customerId")
    private Customer customer;
    @ManyToOne
    @JoinColumn(name = "creditCardType")
    private CreditcardType creditcardType;
    @ManyToOne
    @JoinColumn(name = "paymentTypeId")
    private PaymentType paymentType;
    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "accountId")
    private Account account;
    private String paymentInfoIdSISAC;
    private String paymentInfoIdRU;

    public PaymentInfo() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Timestamp getBeginningDate() {
        return this.beginningDate;
    }

    public void setBeginningDate(Timestamp beginningDate) {
        this.beginningDate = beginningDate;
    }

    public String getCreditCardNumber() {
        try {
            if (creditCardNumber != null) {
                return new String(Encrypter.getInstance().decrypt(creditCardNumber), "UTF-8");
            } else {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void setCreditCardNumber(String number) {
        try {
            if (number != null) {
                this.creditCardNumber = Encrypter.getInstance().encrypt(number.getBytes("UTF-8"));
            } else {
                creditCardNumber = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getCreditCardCvv() {
        try {
            if (creditcardCVV != null) {
                return new String(Encrypter.getInstance().decrypt(creditcardCVV), "UTF-8");
            } else {
                return null;
            }

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void setCreditCardNumber(byte[] creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public byte[] getCreditcardCVV() {
        return creditcardCVV;
    }

    public void setCreditcardCVV(byte[] creditcardCVV) {
        this.creditcardCVV = creditcardCVV;
    }

    public void setCreditCardCvv(String number) {
        try {
            if (number != null) {
                this.creditcardCVV = Encrypter.getInstance().encrypt(number.getBytes("UTF-8"));
            } else {
                creditcardCVV = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Timestamp getCreditCardDate() {
        return this.creditCardDate;
    }

    public void setCreditCardDate(Timestamp creditCardDate) {
        this.creditCardDate = creditCardDate;
    }

    public String getCreditCardName() {
        return this.creditCardName;
    }

    public void setCreditCardName(String creditCardName) {
        this.creditCardName = creditCardName;
    }

    public Timestamp getEndingDate() {
        return this.endingDate;
    }

    public void setEndingDate(Timestamp endingDate) {
        this.endingDate = endingDate;
    }

    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public PaymentPatner getPaymentPatner() {
        return this.paymentPatner;
    }

    public void setPaymentPatner(PaymentPatner paymentPatner) {
        this.paymentPatner = paymentPatner;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public PaymentType getPaymentType() {
        return this.paymentType;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public CreditcardType getCreditcardType() {
        return creditcardType;
    }

    public void setCreditcardType(CreditcardType creditcardType) {
        this.creditcardType = creditcardType;
    }

    

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public String getPaymentInfoIdSISAC() {
        return paymentInfoIdSISAC;
    }

    public void setPaymentInfoIdSISAC(String paymentInfoIdSISAC) {
        this.paymentInfoIdSISAC = paymentInfoIdSISAC;
    }

    public String getPaymentInfoIdRU() {
        return paymentInfoIdRU;
    }

    public void setPaymentInfoIdRU(String paymentInfoIdRU) {
        this.paymentInfoIdRU = paymentInfoIdRU;
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
