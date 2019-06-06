package com.alodiga.services.provider.commons.models;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.alodiga.services.provider.commons.exceptions.TableNotFoundException;
import com.alodiga.services.provider.commons.genericEJB.AbstractSPEntity;
import com.alodiga.services.provider.commons.genericEJB.SPEntityListerner;
import com.alodiga.services.provider.commons.utils.QueryConstants;
import javax.persistence.NamedQueries;

@Entity
@EntityListeners(SPEntityListerner.class)
@Table(name = "customer")
@NamedQueries({
    @NamedQuery(name = QueryConstants.VALIDATE_CUSTOMER,
    query = "SELECT c FROM Customer c WHERE c.login=:login AND c.password=:password"),
    @NamedQuery(name = QueryConstants.LOAD_CUSTOMER_BY_LOGIN,
    query = "SELECT c FROM Customer c WHERE c.login=:login"),
    @NamedQuery(name = QueryConstants.LOAD_CUSTOMER_BY_EMAIL,
    query = "SELECT c FROM Customer c WHERE c.email=:email")
})

public class Customer extends AbstractSPEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    public static final String LOGIN = "login";
    public static final String PHONE_NUMBER = "phoneNumber";
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Timestamp birthDate;
    private String civilState;
    private Timestamp creationDate;
    private String email;
    private boolean enabled;
    private String facebookAccount;
    private String firstName;
    private String gender;
    private String lastName;
    private String login;
    private String password;
    private String phoneNumber;
    private String twitterAccount;
    //bi-directional many-to-one association to Enterprise
    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "enterpriseId")
    private Enterprise enterprise;
    @ManyToOne(cascade = {CascadeType.REFRESH})
    @JoinColumn(name = "addressId")
    private Address address;

    public Customer() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Timestamp getBirthDate() {
        return this.birthDate;
    }

    public void setBirthDate(Timestamp birthDate) {
        this.birthDate = birthDate;
    }

    public String getCivilState() {
        return this.civilState;
    }

    public void setCivilState(String civilState) {
        this.civilState = civilState;
    }

    public Timestamp getCreationDate() {
        return this.creationDate;
    }

    public void setCreationDate(Timestamp creationDate) {
        this.creationDate = creationDate;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean getEnabled() {
        return this.enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFacebookAccount() {
        return facebookAccount;
    }

    public void setFacebookAccount(String facebookAccount) {
        this.facebookAccount = facebookAccount;
    }

    public String getTwitterAccount() {
        return twitterAccount;
    }

    public void setTwitterAccount(String twitterAccount) {
        this.twitterAccount = twitterAccount;
    }


    public Enterprise getEnterprise() {
        return this.enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public Object getPk() {
        return getId();
    }

    @Override
    public String getTableName() throws TableNotFoundException {
        return super.getTableName(this.getClass());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Customer) {
            Customer other = (Customer) obj;
            return this.getId().equals(other.getId());
        } else {
            return false;
        }
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
