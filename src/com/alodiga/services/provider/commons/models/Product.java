package com.alodiga.services.provider.commons.models;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.alodiga.services.provider.commons.exceptions.TableNotFoundException;
import com.alodiga.services.provider.commons.genericEJB.AbstractSPEntity;
import com.alodiga.services.provider.commons.utils.AmmountComparator;
import com.alodiga.services.provider.commons.utils.QueryConstants;
import java.util.Collections;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

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
    public static final String RATES_URL = "ratesUrl";
    public static final String REFERENCE_CODE = "referenceCode";
    public static final String TAX_INCLUDE = "taxInclude";
    public static final String CATEGORY_ID = "categoryId";
    public static final String PROVIDER_ID = "providerId";
    public static final String PRODUCT_INTEGRATION_TYPE_ID = "productIntegrationTypeId";
    public static final String ENTERPRISE_ID = "enterpriseId";
    public static final Long ELECTRONIC_PIN_ID = 1L;
    public static final Long TOP_UP_PRODUCT_ID = 3L;
    public static final Long BILLPAYMENT_ID = 4L;
    public static final Long PINLESS_ID = 5L;

    
    private String accessNumberUrl;
    private boolean enabled;
    private String name;
    private boolean isFree;
    private String ratesUrl;
    private String referenceCode;
    private boolean taxInclude;
    //bi-directional many-to-one association to Category
    @ManyToOne
    @JoinColumn(name = "categoryId")
    private Category category;
    //bi-directional many-to-one association to Enterprise
    @ManyToOne
    @JoinColumn(name = "enterpriseId")
    private Enterprise enterprise;
    
    @OneToMany(mappedBy = "product", fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST})
    private List<ProductData> productData;
    @OneToMany(mappedBy = "product", fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST})
    private List<ProductDenomination> productDenominations;

    public Product() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccessNumberUrl() {
        return this.accessNumberUrl;
    }

    public void setAccessNumberUrl(String accessNumberUrl) {
        this.accessNumberUrl = accessNumberUrl;
    }

    public boolean getEnabled() {
        return this.enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean getIsFree() {
        return isFree;
    }

    public void setIsFree(boolean isFree) {
        this.isFree = isFree;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRatesUrl() {
        return this.ratesUrl;
    }

    public void setRatesUrl(String ratesUrl) {
        this.ratesUrl = ratesUrl;
    }

    public String getReferenceCode() {
        return this.referenceCode;
    }

    public void setReferenceCode(String referenceCode) {
        this.referenceCode = referenceCode;
    }

    public boolean getTaxInclude() {
        return this.taxInclude;
    }

    public void setTaxInclude(boolean taxInclude) {
        this.taxInclude = taxInclude;
    }

    public Category getCategory() {
        return this.category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Enterprise getEnterprise() {
        return this.enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public List<ProductData> getProductData() {
        return this.productData;
    }

    public void setProductData(List<ProductData> productData) {
        this.productData = productData;
    }

    public List<ProductDenomination> getProductDenominations() {

        Collections.sort(productDenominations, new AmmountComparator());
        return this.productDenominations;
    }

    public void setProductDenominations(List<ProductDenomination> productDenominations) {
        this.productDenominations = productDenominations;
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

    public ProductData getProductDataByLanguageId(Long languageId) {
        ProductData pd = null;
        for (ProductData pData : this.productData) {
            if (pData.getLanguage().getId().equals(languageId)) {
                pd = pData;
                break;
            }
        }
        return pd;
    }
}
