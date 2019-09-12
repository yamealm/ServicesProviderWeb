package com.alodiga.services.provider.commons.models;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "user")
@NamedQueries({
    @NamedQuery(name = QueryConstants.VALIDATE_USER,
    query = "SELECT u FROM User u WHERE u.login=:login AND u.password=:password"),
    @NamedQuery(name = QueryConstants.LOAD_USER_BY_LOGIN,
    query = "SELECT u FROM User u WHERE u.login=:login"),
    @NamedQuery(name = QueryConstants.LOAD_USER_BY_EMAIL,
    query = "SELECT u FROM User u WHERE u.email=:email")
})
public class User extends AbstractSPEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Timestamp creationDate;
    private String email;
    private boolean enabled;
    private boolean receiveTopUpNotification;
    private String firstName;
    private String lastName;
    private String login;
    private String password;
    private String phoneNumber;
    //bi-directional many-to-one association to UserHasProfileHasEnterprise
    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER, cascade = {CascadeType.ALL})
    private List<UserHasProfileHasEnterprise> userHasProfileHasEnterprises;

    public User() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public List<UserHasProfileHasEnterprise> getUserHasProfileHasEnterprises() {
        return this.userHasProfileHasEnterprises;
    }

    public void setUserHasProfileHasEnterprises(List<UserHasProfileHasEnterprise> userHasProfileHasEnterprises) {
        this.userHasProfileHasEnterprises = userHasProfileHasEnterprises;
    }

    public boolean getReceiveTopUpNotification() {
        return receiveTopUpNotification;
    }

    public void setReceiveTopUpNotification(boolean receiveTopUpNotification) {
        this.receiveTopUpNotification = receiveTopUpNotification;
    }

    public Profile getCurrentProfile(Long enterpriseId) {
        Profile profile = null;
        for (UserHasProfileHasEnterprise uhp : this.userHasProfileHasEnterprises) {
            if (uhp.getEndingDate() == null && uhp.getEnterprise().getId().equals(enterpriseId)) {
                profile = uhp.getProfile();
            }
        }
        return profile;
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
