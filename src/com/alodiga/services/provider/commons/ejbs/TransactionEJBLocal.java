package com.alodiga.services.provider.commons.ejbs;

import java.util.List;

import javax.ejb.Local;

import com.alodiga.services.provider.commons.exceptions.EmptyListException;
import com.alodiga.services.provider.commons.exceptions.GeneralException;
import com.alodiga.services.provider.commons.exceptions.NegativeBalanceException;
import com.alodiga.services.provider.commons.exceptions.NullParameterException;
import com.alodiga.services.provider.commons.exceptions.RegisterNotFoundException;
import com.alodiga.services.provider.commons.genericEJB.EJBRequest;
import com.alodiga.services.provider.commons.genericEJB.SPGenericEJB;
import com.alodiga.services.provider.commons.models.Category;
import com.alodiga.services.provider.commons.models.Condicion;
import com.alodiga.services.provider.commons.models.Product;
import com.alodiga.services.provider.commons.models.ProductHistory;
import com.alodiga.services.provider.commons.models.ProductSerie;
import com.alodiga.services.provider.commons.models.Transaction;

@Local
public interface TransactionEJBLocal extends SPGenericEJB {

  
    public List<Transaction> getTransactionByCondition(EJBRequest request) throws NullParameterException, EmptyListException, GeneralException;

    public List<Condicion> getConditions() throws GeneralException, NullParameterException, EmptyListException;

    public List<Category> getCategories() throws GeneralException, NullParameterException, EmptyListException;

    public Transaction loadTransaction(EJBRequest request) throws GeneralException, RegisterNotFoundException, NullParameterException;

    public Transaction saveTransaction(EJBRequest request) throws GeneralException, NullParameterException;

    public List<Transaction> searchTransaction(EJBRequest request) throws GeneralException, NullParameterException, EmptyListException;

    public Float getCurrentBalanceByProduct(Long productId) throws NullParameterException, GeneralException;

    public Condicion loadConditionbyId(Long id) throws NullParameterException, RegisterNotFoundException, GeneralException;

    public Category loadCategorybyId(Long id) throws NullParameterException, RegisterNotFoundException, GeneralException;

    public Transaction loadTransactionById(Long id) throws GeneralException, RegisterNotFoundException, NullParameterException;

    public ProductHistory loadLastProductHistoryByProductId(Long productId) throws GeneralException, RegisterNotFoundException, NullParameterException;

    public ProductHistory saveProductHistory(EJBRequest request) throws GeneralException, NullParameterException;

    public boolean validateBalance(ProductHistory currentProductHistory, float amount, boolean add) throws NegativeBalanceException;
    
    public Transaction saveTransactionStock(Transaction transaction, List<ProductSerie> productSeries) throws GeneralException, NullParameterException, NegativeBalanceException,RegisterNotFoundException;
    
    public Transaction saveEgressStock(Transaction transaction , List<ProductSerie> productSeries) throws GeneralException, NullParameterException, NegativeBalanceException,RegisterNotFoundException;
    
    public List<ProductSerie> searchProductSerieByProductId(Long productId, Long categoryId) throws GeneralException, NullParameterException, EmptyListException;
    
    public Integer loadQuantityByProductId(Long productId, Long categoryId)	throws GeneralException, NullParameterException;
    
    public boolean validateBalanceProduct(Integer currentQuantity, float amount, boolean isAdd) throws NegativeBalanceException;
    
    public Transaction modificarStock(Transaction transaction , ProductSerie productSeries) throws GeneralException, NullParameterException, NegativeBalanceException,RegisterNotFoundException;

    public Transaction deleteStock(Transaction transaction , ProductSerie productSeries) throws GeneralException, NullParameterException, NegativeBalanceException,RegisterNotFoundException;
    
    public List<Product> listProducts()	throws GeneralException, NullParameterException, EmptyListException;
    
    public List<ProductSerie> searchProductSerieByCategoryId(Long categoryId) throws GeneralException, NullParameterException, EmptyListException;
}

