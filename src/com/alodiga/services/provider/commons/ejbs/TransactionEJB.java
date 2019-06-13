package com.alodiga.services.provider.commons.ejbs;

import java.util.List;

import javax.ejb.Remote;

import com.alodiga.services.provider.commons.exceptions.EmptyListException;
import com.alodiga.services.provider.commons.exceptions.GeneralException;
import com.alodiga.services.provider.commons.exceptions.MinAmountBalanceException;
import com.alodiga.services.provider.commons.exceptions.NullParameterException;
import com.alodiga.services.provider.commons.exceptions.RegisterNotFoundException;
import com.alodiga.services.provider.commons.genericEJB.EJBRequest;
import com.alodiga.services.provider.commons.genericEJB.SPGenericEJB;
import com.alodiga.services.provider.commons.models.Category;
import com.alodiga.services.provider.commons.models.Condition;
import com.alodiga.services.provider.commons.models.ProductHistory;
import com.alodiga.services.provider.commons.models.Transaction;

@Remote
public interface TransactionEJB extends SPGenericEJB {

  
    public List<Transaction> getTransactionByCondition(EJBRequest request) throws NullParameterException, EmptyListException, GeneralException;

    public List<Condition> getConditions() throws GeneralException, NullParameterException, EmptyListException;

    public List<Category> getCategories() throws GeneralException, NullParameterException, EmptyListException;

    public Transaction loadTransaction(EJBRequest request) throws GeneralException, RegisterNotFoundException, NullParameterException;

    public Transaction saveTransaction(EJBRequest request) throws GeneralException, NullParameterException;

    public List<Transaction> searchTransaction(EJBRequest request) throws GeneralException, NullParameterException, EmptyListException;

    public Float getCurrentBalanceByProduct(Long productId) throws NullParameterException, GeneralException;

    public Condition loadConditionbyId(Long id) throws NullParameterException, RegisterNotFoundException, GeneralException;

    public Category loadCategorybyId(Long id) throws NullParameterException, RegisterNotFoundException, GeneralException;

    public Transaction loadTransactionById(Long id) throws GeneralException, RegisterNotFoundException, NullParameterException;

    public ProductHistory loadLastProductHistoryByProductId(Long productId) throws GeneralException, RegisterNotFoundException, NullParameterException;
 
    public ProductHistory saveProductHistory(EJBRequest request) throws GeneralException, NullParameterException;

    public boolean validateBalance(ProductHistory currentProductHistory, float amount) throws MinAmountBalanceException;

}

