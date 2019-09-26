package com.alodiga.services.provider.commons.models;


import java.io.Serializable;
import java.sql.Blob;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.alodiga.services.provider.commons.exceptions.TableNotFoundException;
import com.alodiga.services.provider.commons.genericEJB.AbstractSPEntity;
import com.alodiga.services.provider.commons.genericEJB.SPEntityListerner;

@Entity
@EntityListeners(SPEntityListerner.class)
@Table(name = "transaction")
public class Transaction extends AbstractSPEntity implements Serializable,Cloneable {

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
    private Condicion condition;
    @ManyToOne(cascade = {CascadeType.REFRESH})
    @JoinColumn(name = "customerId")
    private Customer customer;
    @ManyToOne(cascade = {CascadeType.REFRESH})
    @JoinColumn(name = "userId")
    private User user;
    @ManyToOne(cascade = {CascadeType.REFRESH})
    @JoinColumn(name = "transactionTypeId")
    private TransactionType transactionType;
    private Timestamp creationDate; 
    private int quantity;
    private String invoice;
    private String observation;
    private byte[] form;
    private String extForm;
    private String nameForm;
    private String orderWord;
    private String quarantineReason;
    private Float amount;
    private String work;
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

	public Condicion getCondition() {
		return condition;
	}

	public void setCondition(Condicion condition) {
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

	

	public byte[] getForm() {
		return form;
	}

	public void setForm(byte[] form) {
		this.form = form;
	}

	public String getExtForm() {
		return extForm;
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

	public TransactionType getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(TransactionType transactionType) {
		this.transactionType = transactionType;
	}

	public String getObservation() {
		return observation;
	}

	public void setObservation(String observation) {
		this.observation = observation;
	}
	
	public Float getAmount() {
		return amount;
	}

	public void setAmount(Float amount) {
		this.amount = amount;
	}
	

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	public String getExtensionForm() {
		return extForm;
	}

	public void setExtForm(String extForm) {
		this.extForm = extForm;
	}

	public String getNameForm() {
		return nameForm;
	}

	public void setNameForm(String nameForm) {
		this.nameForm = nameForm;
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

    public Object clone(){
        Object obj=null;
        try{
            obj=super.clone();
        }catch(CloneNotSupportedException ex){
            System.out.println(" no se puede duplicar transaction");
        }
        return obj;
    }
}
