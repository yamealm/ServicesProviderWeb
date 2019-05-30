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


/**
 * The persistent class for the user_has_profile_has_enterprise database table.
 * 
 */
@Entity
@EntityListeners(SPEntityListerner.class)
@Table(name="user_has_profile_has_enterprise")
public class UserHasProfileHasEnterprise extends AbstractSPEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Timestamp beginningDate;

	private Timestamp endingDate;

	//bi-directional many-to-one association to Profile
    @ManyToOne
	@JoinColumn(name="userId")
	private User user;
    
	//bi-directional many-to-one association to Profile
    @ManyToOne
	@JoinColumn(name="profileId")
	private Profile profile;

	//bi-directional many-to-one association to Enterprise
    @ManyToOne
	@JoinColumn(name="enterpriseId")
	private Enterprise enterprise;

    public UserHasProfileHasEnterprise() {
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
	
	public Enterprise getEnterprise() {
		return this.enterprise;
	}

	public void setEnterprise(Enterprise enterprise) {
		this.enterprise = enterprise;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
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