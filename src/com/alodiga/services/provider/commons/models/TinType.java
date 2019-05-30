package com.alodiga.services.provider.commons.models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.OneToMany;

import com.alodiga.services.provider.commons.exceptions.TableNotFoundException;
import com.alodiga.services.provider.commons.genericEJB.AbstractSPEntity;

@Entity
@Table(name = "tin_type")

public class TinType extends AbstractSPEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    public static final Long EXTRANJERO = 1L;
    public static final Long EIN = 2L;
    public static final Long GUBERNAMENTAL = 3L;
    public static final Long GENERADO = 4L;
    public static final Long JURIDICO = 5L;
    public static final Long NATURAL = 6L;
    public static final Long TAXES_ID = 7L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private boolean isNatural;
    private String name;
    private String prefix;

    public TinType() {
    }
    

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean getIsNatural() {
        return this.isNatural;
    }

    public void setIsNatural(boolean isNatural) {
        this.isNatural = isNatural;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrefix() {
        return this.prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
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
}
