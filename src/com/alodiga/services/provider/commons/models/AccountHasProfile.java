package com.alodiga.services.provider.commons.models;

import com.alodiga.services.provider.commons.exceptions.TableNotFoundException;
import com.alodiga.services.provider.commons.genericEJB.AbstractSPEntity;
import com.alodiga.services.provider.commons.genericEJB.SPEntityListerner;
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

@Entity
@EntityListeners(SPEntityListerner.class)
@Table(name = "account_has_profile")
public class AccountHasProfile extends AbstractSPEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Timestamp beginningDate;
    private Timestamp endingDate;
    @ManyToOne
    @JoinColumn(name = "accountId")
    private Account account;
    @ManyToOne
    @JoinColumn(name = "profileId")
    private Profile profile;

    public AccountHasProfile() {
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

    public Timestamp getEndingDate() {
	return this.endingDate;
    }

    public void setEndingDate(Timestamp endingDate) {
	this.endingDate = endingDate;
    }

    public Profile getProfile() {
	return this.profile;
    }

    public void setProfile(Profile profile) {
	this.profile = profile;
    }

    public Account getAccount() {
	return account;
    }

    public void setAccount(Account account) {
	this.account = account;
    }

    @Override
    public Object getPk() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getTableName() throws TableNotFoundException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
