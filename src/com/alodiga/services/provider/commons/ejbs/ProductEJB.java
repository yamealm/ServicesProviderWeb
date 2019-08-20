package com.alodiga.services.provider.commons.ejbs;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import com.alodiga.services.provider.commons.exceptions.EmptyListException;
import com.alodiga.services.provider.commons.exceptions.GeneralException;
import com.alodiga.services.provider.commons.exceptions.NullParameterException;
import com.alodiga.services.provider.commons.exceptions.RegisterNotFoundException;
import com.alodiga.services.provider.commons.genericEJB.EJBRequest;
import com.alodiga.services.provider.commons.genericEJB.SPGenericEJB;
import com.alodiga.services.provider.commons.models.Category;
import com.alodiga.services.provider.commons.models.MetrologicalControl;
import com.alodiga.services.provider.commons.models.MetrologicalControlHistory;
import com.alodiga.services.provider.commons.models.Product;
import com.alodiga.services.provider.commons.models.ProductSerie;
import com.alodiga.services.provider.commons.models.Provider;

@SuppressWarnings("all")
@Remote
public interface ProductEJB extends SPGenericEJB {

    public Category deleteCategory(EJBRequest request) throws GeneralException, NullParameterException;

    public Product deleteProduct(EJBRequest request) throws GeneralException, NullParameterException;

    public Provider deleteProvider(EJBRequest request) throws GeneralException, NullParameterException;

    public Product enableProduct(EJBRequest request) throws GeneralException, NullParameterException, RegisterNotFoundException;

    public List<Product> filterProducts(EJBRequest request) throws GeneralException, EmptyListException, NullParameterException;

    public List<Category> getCategories(EJBRequest request) throws GeneralException, EmptyListException, NullParameterException;

    public List<Product> getProducts(EJBRequest request) throws GeneralException, EmptyListException, NullParameterException;

    public List<Provider> getProviders(EJBRequest request) throws GeneralException, EmptyListException, NullParameterException;

    public Category loadCategory(EJBRequest request) throws GeneralException, RegisterNotFoundException, NullParameterException;

    public Product loadProduct(EJBRequest request) throws GeneralException, RegisterNotFoundException, NullParameterException;

    public Product loadProductById(Long productId) throws GeneralException, RegisterNotFoundException, NullParameterException;

    public Provider loadProvider(EJBRequest request) throws GeneralException, RegisterNotFoundException, NullParameterException;

    public Category saveCategory(EJBRequest request) throws GeneralException, NullParameterException;

    public Product saveProduct(EJBRequest request) throws GeneralException, NullParameterException;

    public Provider saveProvider(EJBRequest request) throws GeneralException, NullParameterException;
    
    public List<ProductSerie> searchProductSerie(EJBRequest request) throws GeneralException, NullParameterException, EmptyListException;
    
    public List<ProductSerie> getProductDefeated() throws GeneralException, NullParameterException, EmptyListException;
    
    public List<ProductSerie> getProductDefeated(int dayEnding) throws GeneralException, NullParameterException, EmptyListException;
    
    public List<ProductSerie> getProductDefeatedCure(int dayEnding) throws GeneralException, NullParameterException, EmptyListException;
    
    public List<MetrologicalControlHistory> searchMetrologicalControl(EJBRequest request) throws GeneralException, NullParameterException, EmptyListException;
    
    public List<Product> getProductsByParams(EJBRequest request) throws GeneralException, EmptyListException, NullParameterException;
}
