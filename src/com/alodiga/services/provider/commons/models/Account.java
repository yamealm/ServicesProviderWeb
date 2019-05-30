package com.alodiga.services.provider.commons.models;

import com.alodiga.services.provider.commons.exceptions.TableNotFoundException;
import com.alodiga.services.provider.commons.genericEJB.AbstractSPEntity;
import com.alodiga.services.provider.commons.genericEJB.SPEntityListerner;
import com.alodiga.services.provider.commons.utils.QueryConstants;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@EntityListeners(SPEntityListerner.class)
@Table(name = "account")
@NamedQueries({
    @NamedQuery(name = QueryConstants.VALIDATE_ACCOUNT,
    query = "SELECT a FROM Account a WHERE a.login=:login AND a.password=:password"),
    @NamedQuery(name = QueryConstants.LOAD_ACCOUNT_BY_LOGIN,
    query = "SELECT a FROM Account a WHERE a.login=:login"),
    @NamedQuery(name = QueryConstants.LOAD_ACCOUNT_BY_EMAIL,
    query = "SELECT a FROM Account a WHERE a.email=:email"),
    @NamedQuery(name = QueryConstants.LOAD_ACCOUNT_BY_ENTERPRISE,
    query = "SELECT a FROM Account a WHERE a.enterprise.id=:enterpriseId")
})

public class Account extends AbstractSPEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String login;
    private String password;
    private String accountPassword;
    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "addressId")
    private Address address;
    private String fullName;
    @ManyToOne(cascade = {CascadeType.REFRESH})
    @JoinColumn(name = "tinTypeId")
    private TinType tinType;
    private String businessName;
    private String identifier;
    private Timestamp creationDate;
    private String email;
    private String phoneNumber;
    private String url;
    private String facebookAccount;
    private String twitterAccount;
    private Boolean enabled;
    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "enterpriseId")
    private Enterprise enterprise;
    @ManyToOne(cascade = {CascadeType.REFRESH})
    @JoinColumn(name = "languageId")
    private Language language;
    private Long custumerServiceIdSisac;
    private Long webUserIdSisac;
    private Float balance;
    private Float crediLimit;
    private Timestamp lastBillingDate;
    private Timestamp nexBillingDate;
    private Boolean isPrePaid;
    @ManyToOne(cascade = {CascadeType.REFRESH})
    @JoinColumn(name = "periodId")
    private Period period;
    @OneToMany(mappedBy = "account", fetch = FetchType.EAGER, cascade = {CascadeType.ALL})
    private List<AccountHasProfile> accountHasProfiles;
    @OneToMany(mappedBy = "account", fetch = FetchType.EAGER, cascade = {CascadeType.ALL})
    private List<AccountProduct> accountProducts;
    @OneToMany(mappedBy = "account", fetch = FetchType.EAGER, cascade = {CascadeType.ALL})
    private List<AccountBalance> accountBalances;
    @OneToMany(mappedBy = "account", fetch = FetchType.EAGER, cascade = {CascadeType.ALL})
    private List<AccountHasIpAddress> accountHasIpAddress;
    @OneToMany(mappedBy = "account", fetch = FetchType.EAGER, cascade = {CascadeType.ALL})
    private List<AccountLimitTopUp> limitTopUps;

    public Account() {
    }

    public Float getBalance() {
        return balance;
    }

    public void setBalance(Float Balance) {
        this.balance = Balance;
    }

    public Float getCrediLimit() {
        return crediLimit;
    }

    public void setCrediLimit(Float CrediLimit) {
        this.crediLimit = CrediLimit;
    }

    public Timestamp getLastBillingDate() {
        return lastBillingDate;
    }

    public void setLastBillingDate(Timestamp LastBillingDate) {
        this.lastBillingDate = LastBillingDate;
    }

    public Timestamp getNexBillingDate() {
        return nexBillingDate;
    }

    public void setNexBillingDate(Timestamp NexBillingDate) {
        this.nexBillingDate = NexBillingDate;
    }

    public List<AccountHasProfile> getAccountHasProfiles() {
        return accountHasProfiles;
    }

    public void setAccountHasProfiles(List<AccountHasProfile> accountHasProfiles) {
        this.accountHasProfiles = accountHasProfiles;
    }

    public List<AccountHasIpAddress> getAccountHasIpAddress() {
        List<AccountHasIpAddress> list = new ArrayList<AccountHasIpAddress>();
        for (AccountHasIpAddress ipAddress : accountHasIpAddress){
            if (ipAddress.getEndingDate()==null )
                list.add(ipAddress);
        }
        return list;
    }

    public void setAccountHasIpAddress(List<AccountHasIpAddress> accountHasIpAddress) {
        this.accountHasIpAddress = accountHasIpAddress;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public Timestamp getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Timestamp creationDate) {
        this.creationDate = creationDate;
    }

    public Long getCustumerServiceIdSisac() {
        return custumerServiceIdSisac;
    }

    public void setCustumerServiceIdSisac(Long custumerServiceIdSisac) {
        this.custumerServiceIdSisac = custumerServiceIdSisac;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public String getFacebookAccount() {
        return facebookAccount;
    }

    public void setFacebookAccount(String facebookAccount) {
        this.facebookAccount = facebookAccount;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccountPassword() {
        return accountPassword;
    }

    public void setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public TinType getTinType() {
        return tinType;
    }

    public void setTinType(TinType tinType) {
        this.tinType = tinType;
    }

    public String getTwitterAccount() {
        return twitterAccount;
    }

    public void setTwitterAccount(String twitterAccount) {
        this.twitterAccount = twitterAccount;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Boolean getIsPrePaid() {
        return isPrePaid;
    }

    public void setIsPrePaid(Boolean isPrePaid) {
        this.isPrePaid = isPrePaid;
    }

     public Period getPeriod() {
        return period;
    }

    public void setPeriod(Period period) {
        this.period = period;
    }

    public Long getWebUserIdSisac() {
        return webUserIdSisac;
    }

    public void setWebUserIdSisac(Long webUserIdSisac) {
        this.webUserIdSisac = webUserIdSisac;
    }

    public Profile getCurrentProfile() {
        Profile profile = new Profile();
        for (AccountHasProfile ahp : this.accountHasProfiles) {
            if (ahp.getEndingDate() == null) {
                profile = ahp.getProfile();
            }
        }
        return profile;
    }

    public List<AccountProduct> getAccountProducts() {
        return accountProducts;
    }

    public void setAccountProducts(List<AccountProduct> accountProducts) {
        this.accountProducts = accountProducts;
    }

    public List<AccountBalance> getAccountBalances() {
        return this.accountBalances;
    }

    public void setAccountBalances(List<AccountBalance> accountBalances) {
        this.accountBalances = accountBalances;
    }

    public List<AccountLimitTopUp> getLimitTopUps() {
        return limitTopUps;
    }

    public void setLimitTopUps(List<AccountLimitTopUp> limitTopUps) {
        this.limitTopUps = limitTopUps;
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
