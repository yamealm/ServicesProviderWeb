package com.alodiga.services.provider.commons.managers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alodiga.services.provider.commons.ejbs.BannerEJB;
import com.alodiga.services.provider.commons.ejbs.UtilsEJB;
import com.alodiga.services.provider.commons.exceptions.NullParameterException;
import com.alodiga.services.provider.commons.models.Banner;
import com.alodiga.services.provider.commons.models.BannerType;
import com.alodiga.services.provider.commons.models.Category;
import com.alodiga.services.provider.commons.models.Currency;
import com.alodiga.services.provider.commons.utils.EJBServiceLocator;
import com.alodiga.services.provider.commons.utils.EjbConstants;

@SuppressWarnings("all")
public class ContentManager {

    private static ContentManager instance;
    private Map<Long, List<Banner>> bannersByTypeId;
    private List<BannerType> bannerTypes;
    private List<Banner> banners;
    private BannerEJB bannerEJB;
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
        banners = new ArrayList<Banner>();
        bannerTypes = new ArrayList<BannerType>();
        bannersByTypeId = new HashMap<Long, List<Banner>>();
        bannerEJB = (BannerEJB) EJBServiceLocator.getInstance().get(EjbConstants.BANNER_EJB);
        bannerTypes = bannerEJB.getBannerTypes();


        for (BannerType bannerType : bannerTypes) {
            try {
                banners = bannerEJB.getBannersByType(bannerType.getId());
                bannersByTypeId.put(bannerType.getId(), banners);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        utilsEJB = (UtilsEJB) EJBServiceLocator.getInstance().get(EjbConstants.UTILS_EJB);


    }


    public List<Banner> getBannersByTypeId(Long bannerTypeId) throws NullParameterException {
        if (bannerTypeId == null) {
            throw new NullParameterException("Parameter bannerTypeId cannot be null");
        }
        return bannersByTypeId.get(bannerTypeId);
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
