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
@Table(name = "condicion")
public class Condicion extends AbstractSPEntity implements Serializable,Cloneable {

    private static final long serialVersionUID = 1L;
    
    public static long NEW = 1L;
    public static long REPAIRED = 2L;
    public static long OVERHAULD = 3L;
    public static long INPECTED = 4L;
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private boolean enabled;
    private String name;

    public Condicion() {
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
    
    public Object clone(){
        Object obj=null;
        try{
            obj=super.clone();
        }catch(CloneNotSupportedException ex){
            System.out.println(" no se puede duplicar condition");
        }
        return obj;
    }
}
