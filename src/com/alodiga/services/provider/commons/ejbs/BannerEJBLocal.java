package com.alodiga.services.provider.commons.ejbs;

import com.alodiga.services.provider.commons.genericEJB.SPGenericEJB;
import com.alodiga.services.provider.commons.exceptions.EmptyListException;
import com.alodiga.services.provider.commons.exceptions.GeneralException;
import com.alodiga.services.provider.commons.exceptions.NullParameterException;
import com.alodiga.services.provider.commons.exceptions.RegisterNotFoundException;
import com.alodiga.services.provider.commons.genericEJB.EJBRequest;
import com.alodiga.services.provider.commons.models.Banner;
import com.alodiga.services.provider.commons.models.BannerType;
import java.util.List;
import javax.ejb.Local;

@SuppressWarnings("all")
@Local
public interface BannerEJBLocal extends SPGenericEJB {

    public List<Banner> getBanners(EJBRequest request) throws GeneralException, RegisterNotFoundException, NullParameterException, EmptyListException;

    public List<BannerType> getBannerTypes() throws GeneralException, EmptyListException;

    public List<Banner> getBannersByPosition(EJBRequest request) throws GeneralException, EmptyListException, NullParameterException;

    public List<Banner> getBannersByType(Long bannerTypeId) throws GeneralException, EmptyListException, NullParameterException;

    public Banner loadBanner(EJBRequest request) throws GeneralException, RegisterNotFoundException, NullParameterException;

    public Banner saveBanner(EJBRequest request) throws GeneralException, NullParameterException;
}
