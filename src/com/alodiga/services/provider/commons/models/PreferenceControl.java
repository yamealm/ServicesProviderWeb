package com.alodiga.services.provider.commons.models;

import com.alodiga.services.provider.commons.exceptions.TableNotFoundException;
import com.alodiga.services.provider.commons.genericEJB.AbstractSPEntity;
import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



/**
 * The persistent class for the preference database table.
 * 
 */
@Entity
@Table(name="preference_control")

public class PreferenceControl extends AbstractSPEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Timestamp creationDate;
	
	private Integer accessCounter;
	
	private String paramValue;
	
	@ManyToOne(cascade=CascadeType.REFRESH)
	@JoinColumn(name="preferenceFieldId")
	private PreferenceField preferenceField;
	
	@ManyToOne(cascade=CascadeType.REFRESH)
	@JoinColumn(name="accountId")
	private Account account;
	
	@ManyToOne(cascade=CascadeType.REFRESH)
	@JoinColumn(name="customerId")
	private Customer customer;
	
	@ManyToOne(cascade=CascadeType.REFRESH)
	@JoinColumn(name="userId")
	private User user;
	
	

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	
	/**
	 * @param accessCounter the accessCounter to set
	 */
	public void setAccessCounter(Integer accessCounter) {
		this.accessCounter = accessCounter;
	}
	
	/**
	 * @return the accessCounter
	 */
	public Integer getAccessCounter() {
		return accessCounter;
	}
	
	/**
	 * @param creationDate the creationDate to set
	 */
	public void setCreationDate(Timestamp creationDate) {
		this.creationDate = creationDate;
	}
	
	/**
	 * @return the creationDate
	 */
	public Timestamp getCreationDate() {
		return creationDate;
	}

	/**
	 * @param preference the preference to set
	 */
	public void setPreferenceField(PreferenceField preferenceField) {
		this.preferenceField = preferenceField;
	}

	/**
	 * @return the preference
	 */
	public PreferenceField getPreferenceField() {
		return preferenceField;
	}

	/**
	 * @param account the account to set
	 */
	public void setAccount(Account account) {
		this.account = account;
	}
	
	/**
	 * @return the account
	 */
	public Account getAccount() {
		return account;
	}
	
	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	/**
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer;
	}
	
	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}
	
	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param paramValue the paramValue to set
	 */
	public void setParamValue(String paramValue) {
		this.paramValue = paramValue;
	}

	/**
	 * @return the paramValue
	 */
	public String getParamValue() {
		return paramValue;
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