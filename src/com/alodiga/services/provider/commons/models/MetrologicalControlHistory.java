package com.alodiga.services.provider.commons.models;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.alodiga.services.provider.commons.exceptions.TableNotFoundException;
import com.alodiga.services.provider.commons.genericEJB.AbstractSPEntity;
import com.alodiga.services.provider.commons.genericEJB.SPEntityListerner;

@Entity
@EntityListeners(SPEntityListerner.class)
@Table(name = "metrological_control_history")
public class MetrologicalControlHistory extends AbstractSPEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "metrologicalControlId")
    private MetrologicalControl metrologicalControl;
    private Timestamp creationDate; 
    private Timestamp calibrationDateOld; 
    private Timestamp calibrationDate; 
    private Timestamp expirationDate; 
    private String observation;
    @ManyToOne(cascade = {CascadeType.REFRESH})
    @JoinColumn(name = "categoryId")
    private Category category;


    public MetrologicalControlHistory() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    
	public MetrologicalControl getMetrologicalControl() {
		return metrologicalControl;
	}

	public void setMetrologicalControl(MetrologicalControl metrologicalControl) {
		this.metrologicalControl = metrologicalControl;
	}

	public Timestamp getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Timestamp creationDate) {
		this.creationDate = creationDate;
	}

	public Timestamp getCalibrationDateOld() {
		return calibrationDateOld;
	}

	public void setCalibrationDateOld(Timestamp calibrationDateOld) {
		this.calibrationDateOld = calibrationDateOld;
	}

	public Timestamp getCalibrationDate() {
		return calibrationDate;
	}

	public void setCalibrationDate(Timestamp calibrationDate) {
		this.calibrationDate = calibrationDate;
	}

	public Timestamp getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(Timestamp expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getObservation() {
		return observation;
	}

	public void setObservation(String observation) {
		this.observation = observation;
	}
	

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
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