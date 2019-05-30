package com.alodiga.services.provider.commons.models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.alodiga.services.provider.commons.exceptions.TableNotFoundException;
import com.alodiga.services.provider.commons.genericEJB.AbstractSPEntity;

@Entity
@Table(name = "provider")
public class Provider extends AbstractSPEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    public static final int SISAC = 1;
    public static final int EASY_CALL = 2;
    public static final int TRANSFER_TO = 3;
    public static final int MLAT = 4;
    public static final int TELINTEL = 5;
    public static final int EMIDA = 6; // No está en el requerimiento
    public static final int MOBILE_PIN_INVENTORY = 7;
    public static final int PREPAY_NATION = 8;
    public static final int CSQ = 9;
    public static final int KDDI = 10;
    public static final int TWILIO = 11;
    public static final int IDENTIDAD = 13;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String url;
    private boolean isSMSProvider;
    private boolean enabled;

    public Provider() {
    }

    public Provider(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public boolean isIsSMSProvider() {
        return this.isSMSProvider;
    }

    public void setIsSMSProvider(boolean isSMSProvider) {
        this.isSMSProvider = isSMSProvider;
    }

    @Override
    public Object getPk() {
        return getId();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }


    @Override
    public String getTableName() throws TableNotFoundException {
        return super.getTableName(this.getClass());
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof Provider) {
            return this.getId().equals(((Provider) object).getId());
        } else {
            return false;
        }
    }
}
