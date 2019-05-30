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
@Table(name = "transaction_type")
public class TransactionType extends AbstractSPEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    public static final Long PIN_PURCHASE = 1L;
    public static final Long PIN_RECHARGE = 2L;
    public static final Long TOP_UP_PURCHASE = 3L;
    public static final Long BILL_PAYMENT_PURCHASE = 4L;
    public static final Long PURCHASE_BALANCE = 5L;
    public static final Long REVERSE_TRANSACTION = 6L;
    public static final Long PIN_OPERATIONS =7L;
    public static final Long BILL_PAYMENT_RECHARGE=8L;
    public static final Long PINLESS_PURCHASE = 9L;
    public static final Long PINLESS_RECHARGE = 10L;
     public static final Long NAUTA_RECHARGE = 11L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String value;

    public TransactionType() {
    }

    public TransactionType(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
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
