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
@Table(name = "product_serie")
public class ProductSerie extends AbstractSPEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Timestamp expirationDate; 
    private Timestamp cure;
    private String serie;
    private Float amount;
    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "productId")
    private Product product;
    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "providerId")
    private Provider provider;
    @ManyToOne
    @JoinColumn(name = "beginTransactionId")
    private Transaction beginTransactionId;
    @ManyToOne
    @JoinColumn(name = "endingTransactionId")
    private Transaction endingTransactionId;


    public ProductSerie() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

	public Timestamp getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(Timestamp expirationDate) {
		this.expirationDate = expirationDate;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Provider getProvider() {
		return provider;
	}

	public void setProvider(Provider provider) {
		this.provider = provider;
	}

	public Timestamp getCure() {
		return cure;
	}

	public void setCure(Timestamp cure) {
		this.cure = cure;
	}
	
	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public Transaction getBeginTransactionId() {
		return beginTransactionId;
	}

	public void setBeginTransactionId(Transaction beginTransactionId) {
		this.beginTransactionId = beginTransactionId;
	}

	public Transaction getEndingTransactionId() {
		return endingTransactionId;
	}

	public void setEndingTransactionId(Transaction endingTransactionId) {
		this.endingTransactionId = endingTransactionId;
	}

	public Float getAmount() {
		return amount;
	}

	public void setAmount(Float amount) {
		this.amount = amount;
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