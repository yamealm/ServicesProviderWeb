package com.alodiga.services.provider.commons.models;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.alodiga.services.provider.commons.exceptions.TableNotFoundException;
import com.alodiga.services.provider.commons.genericEJB.AbstractSPEntity;
import javax.persistence.ManyToOne;

@Entity
@Table(name = "preference_field")
public class PreferenceField extends AbstractSPEntity implements Serializable {

    public PreferenceField() {
    }

    public PreferenceField(Long id) {
        this.id = id;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "preferenceTypeId")
    private PreferenceType preferenceType;
    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "preferenceId")
    private Preference preference;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "preferenceField", cascade = {CascadeType.PERSIST, CascadeType.REFRESH})
    private List<PreferenceValue> preferenceValue;
    private Boolean enabled;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PreferenceType getPreferenceType() {
        return preferenceType;
    }

    public void setPreferenceType(PreferenceType preferenceType) {
        this.preferenceType = preferenceType;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public List<PreferenceValue> getPreferenceValue() {
        return preferenceValue;
    }

    public void setPreferenceValue(List<PreferenceValue> preferenceValue) {
        this.preferenceValue = preferenceValue;
    }

    public Preference getPreference() {
        return preference;
    }

    public void setPreference(Preference preference) {
        this.preference = preference;
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
