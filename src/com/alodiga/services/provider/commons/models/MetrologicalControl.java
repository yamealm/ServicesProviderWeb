package com.alodiga.services.provider.commons.models;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import com.alodiga.services.provider.commons.exceptions.TableNotFoundException;
import com.alodiga.services.provider.commons.genericEJB.AbstractSPEntity;
import com.alodiga.services.provider.commons.utils.QueryConstants;

@Entity
@Table(name = "metrological_control")
@NamedQueries({
    @NamedQuery(name = QueryConstants.LOAD_CONTROL_BY_INSTRUMENT,
    query = "SELECT c FROM MetrologicalControl c WHERE c.instrument =:instrument")
})
public class MetrologicalControl extends AbstractSPEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String designation;
    private String instrument;
    @ManyToOne
    @JoinColumn(name = "braundId")
    private Braund braund;
    @ManyToOne
    @JoinColumn(name = "modelId")
    private Model model;
    private String name;
    private String serie;
    private String rango; 
    private Timestamp creationDate; 
    @ManyToOne
    @JoinColumn(name = "enterCalibrationId")
    private EnterCalibration enterCalibration;
    private String ubication;
    private String scale; 
//    @ManyToOne
//    @JoinColumn(name = "controlTypeId")
    private String controlType;
    private boolean enabled;
    
      
    public MetrologicalControl() {
    }

  		public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Braund getBraund() {
		return braund;
	}

	public void setBraund(Braund braund) {
		this.braund = braund;
	}

	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public String getRango() {
		return rango;
	}

	public void setRango(String rango) {
		this.rango = rango;
	}

	public Timestamp getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Timestamp creationDate) {
		this.creationDate = creationDate;
	}

	public EnterCalibration getEnterCalibration() {
		return enterCalibration;
	}

	public void setEnterCalibration(EnterCalibration enterCalibration) {
		this.enterCalibration = enterCalibration;
	}

	public String getUbication() {
		return ubication;
	}

	public void setUbication(String ubication) {
		this.ubication = ubication;
	}

	public String getScale() {
		return scale;
	}

	public void setScale(String scale) {
		this.scale = scale;
	}
	

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getInstrument() {
		return instrument;
	}

	public void setInstrument(String instrument) {
		this.instrument = instrument;
	}

	public boolean isEnabled() {
		return enabled;
	}


	public String getControlType() {
		return controlType;
	}

	public void setControlType(String controlType) {
		this.controlType = controlType;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
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
    
    

    @Override
    public boolean equals(Object object) {
        if (object instanceof MetrologicalControl) {
            return this.getId().equals(((MetrologicalControl) object).getId());
        } else {
            return false;
        }
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
