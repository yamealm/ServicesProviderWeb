package com.alodiga.services.provider.commons.ejbs;

import java.util.List;

import javax.ejb.Local;

import com.alodiga.services.provider.commons.exceptions.DisabledAccountException;
import com.alodiga.services.provider.commons.exceptions.EmptyListException;
import com.alodiga.services.provider.commons.exceptions.GeneralException;
import com.alodiga.services.provider.commons.exceptions.InvalidAccountException;
import com.alodiga.services.provider.commons.exceptions.NullParameterException;
import com.alodiga.services.provider.commons.genericEJB.SPGenericEJB;
import com.alodiga.services.provider.commons.models.Product;
import com.alodiga.services.provider.commons.utils.AccountData;


@SuppressWarnings("all")
@Local
public interface ServicesEJBLocal extends SPGenericEJB {

  
    public List<Product> getProducts(AccountData userData) throws NullParameterException, InvalidAccountException, DisabledAccountException, EmptyListException, GeneralException;
    
   
}
