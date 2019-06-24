package com.alodiga.services.provider.commons.models;

import java.io.Serializable;

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
@Table(name = "product")
@NamedQueries({
    @NamedQuery(name = QueryConstants.PRODUCTS_BY_ENTERPRISE,
    query = "SELECT p FROM Product p WHERE p.enterprise.id =:enterpriseId")
})
public class Product extends AbstractSPEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    public static final String ID_FIELD = "id";
    public static final String ACCESS_NUMBER_URL = "accessNumberUrl";
    public static final String ENABLED = "enabled";
    public static final String NAME = "name";
    public static final String CATEGORY_ID = "categoryId";
    public static final String PROVIDER_ID = "providerId";
    public static final String ENTERPRISE_ID = "enterpriseId";


    
    private String partNumber;
    private String description;
    //bi-directional many-to-one association to Enterprise
    @ManyToOne
    @JoinColumn(name = "enterpriseId")
    private Enterprise enterprise;
    private String actNpNsn;
    private String ubicationBox;
    private String ubicationFolder;
    private String batchNumber;
    private int stockMin;
    private int stockMax;
    private float amount;
    private float inictialAmount;
    private float realAmount;
    private boolean enabled;
   
// 
//    //bi-directional many-to-one association to Category
//    @ManyToOne
//    @JoinColumn(name = "categoryId")
//    private Category category;
    
    public Product() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

   

    public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Enterprise getEnterprise() {
		return enterprise;
	}

	public void setEnterprise(Enterprise enterprise) {
		this.enterprise = enterprise;
	}

	public String getActNpNsn() {
		return actNpNsn;
	}

	public void setActNpNsn(String actNpNsn) {
		this.actNpNsn = actNpNsn;
	}

	public String getUbicationBox() {
		return ubicationBox;
	}

	public void setUbicationBox(String ubicationBox) {
		this.ubicationBox = ubicationBox;
	}

	public String getUbicationFolder() {
		return ubicationFolder;
	}

	public void setUbicationFolder(String ubicationFolder) {
		this.ubicationFolder = ubicationFolder;
	}

	public String getBatchNumber() {
		return batchNumber;
	}

	public void setBatchNumber(String batchNumber) {
		this.batchNumber = batchNumber;
	}

	public int getStockMin() {
		return stockMin;
	}

	public void setStockMin(int stockMin) {
		this.stockMin = stockMin;
	}

	public int getStockMax() {
		return stockMax;
	}

	public void setStockMax(int stockMax) {
		this.stockMax = stockMax;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public float getInictialAmount() {
		return inictialAmount;
	}

	public void setInictialAmount(float inictialAmount) {
		this.inictialAmount = inictialAmount;
	}

	public float getRealAmount() {
		return realAmount;
	}

	public void setRealAmount(float realAmount) {
		this.realAmount = realAmount;
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
        if (object instanceof Product) {
            return this.getId().equals(((Product) object).getId());
        } else {
            return false;
        }
    }


}
