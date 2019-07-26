package com.alodiga.services.provider.commons.models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import com.alodiga.services.provider.commons.exceptions.TableNotFoundException;
import com.alodiga.services.provider.commons.genericEJB.AbstractSPEntity;
import com.alodiga.services.provider.commons.utils.QueryConstants;

@Entity
@Table(name = "model")
@NamedQuery(name = QueryConstants.MODEL_BY_BRAUND,
query = "SELECT m FROM Model m WHERE s.braund.id=:braundId")
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
}
