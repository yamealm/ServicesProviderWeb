//package com.alodiga.services.provider.commons.ejbs;
//
//import java.util.List;
//
//import javax.ejb.Local;
//
//import com.alodiga.services.provider.commons.exceptions.EmptyListException;
//import com.alodiga.services.provider.commons.exceptions.GeneralException;
//import com.alodiga.services.provider.commons.exceptions.NullParameterException;
//import com.alodiga.services.provider.commons.exceptions.RegisterNotFoundException;
//import com.alodiga.services.provider.commons.genericEJB.EJBRequest;
//import com.alodiga.services.provider.commons.genericEJB.SPGenericEJB;
//import com.alodiga.services.provider.commons.models.Category;
//import com.alodiga.services.provider.commons.models.Period;
//import com.alodiga.services.provider.commons.models.Pin;
//import com.alodiga.services.provider.commons.models.Product;
//import com.alodiga.services.provider.commons.models.ProductData;
//import com.alodiga.services.provider.commons.models.ProductDenomination;
//import com.alodiga.services.provider.commons.models.Provider;
//
//@SuppressWarnings("all")
//@Local
//public interface ProductEJBLocal extends SPGenericEJB {
//
//    public Category deleteCategory(EJBRequest request) throws GeneralException, NullParameterException;
//
//    public Product deleteProduct(EJBRequest request) throws GeneralException, NullParameterException;
//
//    public void deleteProductDenomination(EJBRequest request) throws NullParameterException, GeneralException;
//
//    public void deleteProductHasProvider(Long productId) throws NullParameterException, GeneralException;
//
//    public void deletePromotionTypeHasPromotion(EJBRequest request) throws NullParameterException, GeneralException;
//
//    public Provider deleteProvider(EJBRequest request) throws GeneralException, NullParameterException;
//
//    public Product enableProduct(EJBRequest request) throws GeneralException, NullParameterException, RegisterNotFoundException;
//
//    public List<Product> filterProducts(EJBRequest request) throws GeneralException, EmptyListException, NullParameterException;
//
//    public List<Category> getCategories(EJBRequest request) throws GeneralException, EmptyListException, NullParameterException;
//
//    public List<Float> getDenominationsByCategoryId(EJBRequest request) throws GeneralException, NullParameterException, EmptyListException;
//
//    public List<Product> getProducts(EJBRequest request) throws GeneralException, EmptyListException, NullParameterException;
//
//    public List<Product> getProductsByEnterprise(Long enterpriseId) throws GeneralException, EmptyListException, NullParameterException;
//
//    public List<Provider> getProviders(EJBRequest request) throws GeneralException, EmptyListException, NullParameterException;
//
//    public Float getPercentDiscount(Long levelId, Long productId) throws GeneralException, NullParameterException;
//
//    public Category loadCategory(EJBRequest request) throws GeneralException, RegisterNotFoundException, NullParameterException;
//
//    public Pin loadPinByAni(String ani) throws RegisterNotFoundException, GeneralException, NullParameterException;
//
//    public Pin loadPinBySerial(String serial) throws RegisterNotFoundException, GeneralException, NullParameterException;
//
//    public Pin loadPinByTransactionItemId(Long transactionItemId) throws RegisterNotFoundException, GeneralException, NullParameterException;
//
//    public Product loadProduct(EJBRequest request) throws GeneralException, RegisterNotFoundException, NullParameterException;
//
//    public Product loadProductById(Long productId) throws GeneralException, RegisterNotFoundException, NullParameterException;
//
//    public ProductDenomination loadProductDenominationById(Long id) throws NullParameterException, EmptyListException, GeneralException;
//
//    public Provider loadProvider(EJBRequest request) throws GeneralException, RegisterNotFoundException, NullParameterException;
//
//    public Category saveCategory(EJBRequest request) throws GeneralException, NullParameterException;
//
//    public Product saveProduct(EJBRequest request) throws GeneralException, NullParameterException;
//
//    public ProductData saveProductData(EJBRequest request) throws GeneralException, NullParameterException;
//
//    public Provider saveProvider(EJBRequest request) throws GeneralException, NullParameterException;
//
//    public List<Period> getPeriods(EJBRequest request) throws GeneralException, EmptyListException, NullParameterException;
//
//    public Pin savePin(EJBRequest request) throws GeneralException, NullParameterException;
//
//    public Boolean deletePinFree(EJBRequest request) throws GeneralException, NullParameterException;
//
//    public List<Product> getProductsByAccount(EJBRequest request) throws GeneralException, NullParameterException, EmptyListException;
//
//    public  List<ProductDenomination> loadProductDenominations(Long productId) throws NullParameterException, EmptyListException, GeneralException;
//
//}
