package com.alodiga.services.provider.commons.models;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.alodiga.services.provider.commons.exceptions.TableNotFoundException;
import com.alodiga.services.provider.commons.genericEJB.AbstractSPEntity;

@Entity
@Table(name = "profile")
public class Profile extends AbstractSPEntity implements Serializable {

    public static Long ADMINISTRATOR = 1L;
    public static Long DISTRIBUTOR = 2L;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private boolean enabled;
    private String name;
    @OneToMany(mappedBy = "profile", fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST})
    private List<PermissionHasProfile> permissionHasProfiles;
    @OneToMany(mappedBy = "profile", fetch = FetchType.EAGER, cascade = {CascadeType.ALL})
    private List<ProfileData> profileData;

    public Profile() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean getEnabled() {
        return this.enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<PermissionHasProfile> getPermissionHasProfiles() {
        return this.permissionHasProfiles;
    }

    public void setPermissionHasProfiles(List<PermissionHasProfile> permissionHasProfiles) {
        this.permissionHasProfiles = permissionHasProfiles;
    }

    public List<ProfileData> getProfileData() {
        return this.profileData;
    }

    public void setProfileData(List<ProfileData> profileData) {
        this.profileData = profileData;
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

    public ProfileData getProfileDataByLanguageId(Long languageId) {
        ProfileData pd = null;
        for (ProfileData pData : this.profileData) {
            if (pData.getLanguage().getId().equals(languageId)) {
                pd = pData;
                break;
            }
        }
        return pd;
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
