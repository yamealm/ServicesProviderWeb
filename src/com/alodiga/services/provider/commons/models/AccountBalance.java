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

/**
 * The persistent class for the account_balance database table.
 * 
 */
/**
 * @author nestor
 *
 */
@Entity
@EntityListeners(SPEntityListerner.class)
@Table(name="account_balance")
public class AccountBalance extends AbstractSPEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Float balance;

	private Timestamp beginningDate;

	private Timestamp endingDate;
	
	@ManyToOne
	@JoinColumn(name="accountId")
	private Account account;

    public AccountBalance() {
    }

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Float getBalance() {
		return this.balance;
	}

	public void setBalance(Float balance) {
		this.balance = balance;
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

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
	@Override
	public String toString()
	{
		return super.toString();
	}

	@Override
	public Object getPk() {
		return getId();
	}
	
	@Override
	public String getTableName() throws TableNotFoundException{
		return super.getTableName(this.getClass());
	}
}