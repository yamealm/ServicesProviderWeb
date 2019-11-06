package com.alodiga.services.provider.commons.managers;

import java.util.List;

import com.alodiga.services.provider.commons.ejbs.UtilsEJB;
import com.alodiga.services.provider.commons.exceptions.NullParameterException;
import com.alodiga.services.provider.commons.models.Category;
import com.alodiga.services.provider.commons.models.Currency;
import com.alodiga.services.provider.commons.utils.EJBServiceLocator;
import com.alodiga.services.provider.commons.utils.EjbConstants;

@SuppressWarnings("all")
public class ContentManager {

    private static ContentManager instance;
    private List<Category> categories;
    private List<Currency> currency;
    private UtilsEJB utilsEJB;

    public static synchronized ContentManager getInstance() throws Exception {
        if (instance == null) {
            instance = new ContentManager();
        }
        return instance;
    }

    public static void refresh() throws Exception {
        instance = new ContentManager();
    }


     private ContentManager() throws Exception {
        utilsEJB = (UtilsEJB) EJBServiceLocator.getInstance().get(EjbConstants.UTILS_EJB);
    }


    public Category getCategoryById(Long categoryId) throws NullParameterException{
        if(categoryId == null){
            throw new NullParameterException("Parameter categoryId cannot be null");
        }
        for(Category category : categories){
            if(category.getId().equals(categoryId)){
                return category;
            }
        }
        return null;
    }



    public Currency getCurrency(Long CurrencyId) throws NullParameterException{
        if(CurrencyId == null){
            throw new NullParameterException("Parameter invoiceStatusId cannot be null");
        }
        for(Currency id : currency){
            if(id.getId().equals(CurrencyId)){
                return id;
            }
        }
        return null;
    }


}
