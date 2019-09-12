package com.alodiga.services.provider.commons.models;

import java.io.Serializable;
import java.lang.reflect.Field;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.alodiga.services.provider.commons.exceptions.TableNotFoundException;
import com.alodiga.services.provider.commons.genericEJB.AbstractSPEntity;

@Entity
@Table(name = "model")
public class Model extends AbstractSPEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    //bi-directional many-to-one association to Country
    @ManyToOne
    @JoinColumn(name = "braundId")
    private Braund braund;

    public Model() {
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

   

    public Braund getBraund() {
		return braund;
	}

	public void setBraund(Braund braund) {
		this.braund = braund;
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
