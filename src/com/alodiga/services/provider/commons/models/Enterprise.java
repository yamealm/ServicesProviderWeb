package com.alodiga.services.provider.commons.models;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.alodiga.services.provider.commons.exceptions.TableNotFoundException;
import com.alodiga.services.provider.commons.genericEJB.AbstractSPEntity;

import javax.persistence.FetchType;

@Entity
@Table(name = "enterprise")
public class Enterprise extends AbstractSPEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    public static final Long TURBINES = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String address;
    private String atcNumber;
    private String email;
    private boolean enabled;
    private String infoEmail;
    private String invoiceAddress;
    private String name;
    private String url;
    
    //bi-directional many-to-one association to Currency
    @ManyToOne(cascade = {CascadeType.REFRESH})
    @JoinColumn(name = "currencyId")
    private Currency currency;
    //bi-directional many-to-one association to Country
    @ManyToOne(cascade = {CascadeType.REFRESH})
    @JoinColumn(name = "countryId")
    private Country country;
//    //bi-directional many-to-one association to EnterpriseHasTinType
//    @OneToMany(mappedBy = "enterprise", fetch = FetchType.EAGER, cascade = {CascadeType.REFRESH})
//    private List<EnterpriseHasTinType> enterpriseHasTinTypes;


    public Enterprise() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAtcNumber() {
        return this.atcNumber;
    }

    public void setAtcNumber(String atcNumber) {
        this.atcNumber = atcNumber;
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

    public String getInfoEmail() {
        return this.infoEmail;
    }

    public void setInfoEmail(String infoEmail) {
        this.infoEmail = infoEmail;
    }

    public String getInvoiceAddress() {
        return this.invoiceAddress;
    }

    public void setInvoiceAddress(String invoiceAddress) {
        this.invoiceAddress = invoiceAddress;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Currency getCurrency() {
        return this.currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public Country getCountry() {
        return this.country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

//    public List<EnterpriseHasTinType> getEnterpriseHasTinTypes() {
//        return this.enterpriseHasTinTypes;
//    }
//
//    public void setEnterpriseHasTinTypes(List<EnterpriseHasTinType> enterpriseHasTinTypes) {
//        this.enterpriseHasTinTypes = enterpriseHasTinTypes;
//    }

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

    public String getNaturalField(Object o,Object o2){
        StringBuilder sb = new StringBuilder();
        Class<?> thisClass = o.getClass();
        Class<?> thisClass2 = o2.getClass();
        try {
            Field[] aClassFields = thisClass.getDeclaredFields();
            Field[] aClassFields2 = thisClass2.getDeclaredFields();
            sb.append("[");
            for(Field f : aClassFields){
                for(Field f2 : aClassFields2){
                  if(f.get(o) !=  f.get(o2)){
                       sb.append(f.getName()).append("=");
    //                   sb.append(f.get(o)).append("|");
                       sb.append(f.get(o2)).append(",");
                       break;
                  }
                }
            }  sb.append("]");
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}
