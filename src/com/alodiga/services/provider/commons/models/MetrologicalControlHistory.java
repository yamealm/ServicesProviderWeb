package com.alodiga.services.provider.commons.models;
import java.io.Serializable;
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