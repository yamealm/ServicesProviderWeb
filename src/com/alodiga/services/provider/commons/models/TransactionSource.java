package com.alodiga.services.provider.commons.models;

import com.alodiga.services.provider.commons.exceptions.TableNotFoundException;
import com.alodiga.services.provider.commons.genericEJB.AbstractSPEntity;
import com.alodiga.services.provider.commons.genericEJB.SPEntityListerner;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The persistent class for the transaction_source database table.
 * 
 */
@Entity
@EntityListeners(SPEntityListerner.class)
@Table(name = "transaction_source")
public class TransactionSource extends AbstractSPEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    public static final Long CUSTOMER_WEB = 1L;
    public static final Long ACCOUNT_WEB = 2L;
    public static final Long IVR = 3L;
    public static final Long MOBILE = 6L;
    //public static final Long RESIDUAL_SISAC = 4L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public TransactionSource() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
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
