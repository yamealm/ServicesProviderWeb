package com.alodiga.services.provider.commons.models;

import com.alodiga.services.provider.commons.exceptions.TableNotFoundException;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.alodiga.services.provider.commons.genericEJB.AbstractSPEntity;
import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Table(name = "banner_type")
public class BannerType extends AbstractSPEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    public static long HOME_CENTRAL_BANNER_USA_ENGLISH = 1L;
    public static long HOME_CENTRAL_BANNER_USA_SPANISH = 2L;
    public static long FOOTER_BANNER_USA_ENGLISH = 3L;
    public static long FOOTER_BANNER_USA_SPANISH = 4L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "enterpriseId")
    private Enterprise enterprise;
    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "languageId")
    private Language language;
    private boolean enabled;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }
    
    @Override
    public Object getPk() {
        // TODO Auto-generated method stub
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
