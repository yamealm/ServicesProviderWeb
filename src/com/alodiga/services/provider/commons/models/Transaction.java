package com.alodiga.services.provider.commons.models;


import java.io.Serializable;
import java.sql.Blob;
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
import java.util.List;
import javax.persistence.OneToMany;

@Entity
@EntityListeners(SPEntityListerner.class)
@Table(name = "transaction")
public class Transaction extends AbstractSPEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(cascade = {CascadeType.REFRESH})
    @JoinColumn(name = "productId")
    private Product product;
    @ManyToOne(cascade = {CascadeType.REFRESH})
    @JoinColumn(name = "providerId")
    private Provider provider;
    @ManyToOne(cascade = {CascadeType.REFRESH})
    @JoinColumn(name = "categoryId")
    private Category category;
    @ManyToOne(cascade = {CascadeType.REFRESH})
    @JoinColumn(name = "conditionId")
    private Condition condition;
    @ManyToOne(cascade = {CascadeType.REFRESH})
    @JoinColumn(name = "customerId")
    private Customer customer;
    @ManyToOne(cascade = {CascadeType.REFRESH})
    @JoinColumn(name = "userId")
    private User user;
    private Timestamp creationDate; 
    private Timestamp transactionDate; 
    private int quantity;
    private String invoice;
    private boolean isSerial;
    private Blob form;
    private String orderWord;
    private String quarantineReason;
    @OneToMany(mappedBy = "transaction", cascade = {CascadeType.PERSIST, CascadeType.REFRESH})
    private List<ProductHistory> productHistories;

    public Transaction() {
    }

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Condition getCondition() {
		return condition;
	}

	public void setCondition(Condition condition) {
		this.condition = condition;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}

	public Timestamp getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Timestamp creationDate) {
		this.creationDate = creationDate;
	}


	public Timestamp getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Timestamp transactionDate) {
		this.transactionDate = transactionDate;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getInvoice() {
		return invoice;
	}

	public void setInvoice(String invoice) {
		this.invoice = invoice;
	}

	public boolean isSerial() {
		return isSerial;
	}

	public void setSerial(boolean isSerial) {
		this.isSerial = isSerial;
	}

	public Blob getForm() {
		return form;
	}

	public void setForm(Blob form) {
		this.form = form;
	}

	public String getOrderWord() {
		return orderWord;
	}

	public void setOrderWord(String orderWord) {
		this.orderWord = orderWord;
	}

	public String getQuarantineReason() {
		return quarantineReason;
	}

	public void setQuarantineReason(String quarantineReason) {
		this.quarantineReason = quarantineReason;
	}

	public List<ProductHistory> getProductHistories() {
		return productHistories;
	}

	public void setProductHistories(List<ProductHistory> productHistories) {
		this.productHistories = productHistories;
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

   
}
