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
@Table(name = "transaction_type")
public class TransactionType extends AbstractSPEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    public static long ADD = 1L;
    public static long REMOVE = 2L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

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
