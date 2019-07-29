package com.alodiga.services.provider.commons.ejbs;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.ejb.Local;

import com.alodiga.services.provider.commons.exceptions.EmptyListException;
import com.alodiga.services.provider.commons.exceptions.GeneralException;
import com.alodiga.services.provider.commons.exceptions.NullParameterException;
import com.alodiga.services.provider.commons.exceptions.RegisterNotFoundException;
import com.alodiga.services.provider.commons.genericEJB.EJBRequest;
import com.alodiga.services.provider.commons.genericEJB.SPGenericEJB;
import com.alodiga.services.provider.commons.models.Braund;
import com.alodiga.services.provider.commons.models.City;
import com.alodiga.services.provider.commons.models.ControlType;
import com.alodiga.services.provider.commons.models.Country;
import com.alodiga.services.provider.commons.models.CountryHasProvider;
import com.alodiga.services.provider.commons.models.CountryTranslation;
import com.alodiga.services.provider.commons.models.County;
import com.alodiga.services.provider.commons.models.Currency;
import com.alodiga.services.provider.commons.models.EnterCalibration;
import com.alodiga.services.provider.commons.models.Enterprise;
import com.alodiga.services.provider.commons.models.Language;
import com.alodiga.services.provider.commons.models.Model; 
import com.alodiga.services.provider.commons.models.Provider;
import com.alodiga.services.provider.commons.models.State;
import com.alodiga.services.provider.commons.models.TinType;
import com.alodiga.services.provider.commons.utils.Mail;

@SuppressWarnings(value = {"all"})
@Local
public interface UtilsEJBLocal extends SPGenericEJB {

public List<City> getCitiesByCounty(EJBRequest request) throws EmptyListException, GeneralException, NullParameterException;

    public List<City> getCitiesByState(EJBRequest request) throws EmptyListException, GeneralException, NullParameterException;

    public List<County> getCountiesByState(EJBRequest request) throws EmptyListException, GeneralException, NullParameterException;

    public List<Country> getCountries(EJBRequest request) throws EmptyListException, GeneralException, NullParameterException;

    public List<Country> getCountries() throws EmptyListException, GeneralException, NullParameterException;

    public List<Currency> getCurrencies() throws EmptyListException, GeneralException, NullParameterException;

    public List<Enterprise> getEnterprises() throws EmptyListException, GeneralException, NullParameterException;

    public List<Language> getLanguages() throws EmptyListException, GeneralException, NullParameterException;

    public List<State> getStateByCountry(EJBRequest request) throws EmptyListException, GeneralException, NullParameterException;

    public City loadCity(EJBRequest request) throws RegisterNotFoundException, NullParameterException, GeneralException;

    public Country loadCountry(EJBRequest request) throws RegisterNotFoundException, NullParameterException, GeneralException;

    public County loadCounty(EJBRequest request) throws RegisterNotFoundException, NullParameterException, GeneralException;

    public Currency loadCurrency(EJBRequest request) throws RegisterNotFoundException, NullParameterException, GeneralException;

    public  Enterprise loadEnterprisebyId(Long enterpriseId) throws GeneralException;

  
    public Float getTotalAmauntbyTransacction(Long accountId, Timestamp date1, Date date2) throws GeneralException, NullParameterException;

    public Float getTotalTaxTransacction(Long accountId, Timestamp date1, Date date2) throws GeneralException, NullParameterException;

    public Float getTotalTransacctionNum(Long accountId, Timestamp date1, Date date2) throws GeneralException, NullParameterException;

    public Enterprise loadEnterprise(EJBRequest request) throws RegisterNotFoundException, NullParameterException, GeneralException;

    public Language loadLanguage(EJBRequest request) throws RegisterNotFoundException, NullParameterException, GeneralException;

    
    public State loadState(EJBRequest request) throws RegisterNotFoundException, NullParameterException, GeneralException;

    public List<TinType> getTinTypes() throws EmptyListException, GeneralException, NullParameterException;

    public List<TinType> getTinTypesByEnterprise(Long enterpriseId) throws EmptyListException, GeneralException, NullParameterException;

    public Enterprise saveEnterprise(EJBRequest request) throws NullParameterException, GeneralException;

    public void sendMail(Mail mail) throws GeneralException, NullParameterException;

    public Country loadCountryByName(String name) throws RegisterNotFoundException, NullParameterException, GeneralException;

    public Country searchCountry(String name) throws RegisterNotFoundException, NullParameterException, GeneralException;

    public Country saveCountry(Country country) throws NullParameterException, GeneralException;

    public void deleteEnterpriseHasTinType(Long enterpriseId) throws NullParameterException, GeneralException;

    public Country loadCountryByShortName(String referenceCode) throws RegisterNotFoundException, NullParameterException, GeneralException;

    public int getCyclesbyPreferenValue(Long preferenceFieldId) throws EmptyListException, NullParameterException, GeneralException;

    public CountryHasProvider saveCountryHasProvider(CountryHasProvider countryHasProvider) throws NullParameterException, GeneralException;

   
    public CountryTranslation saveCountryTranslation(CountryTranslation countryTranslation) throws NullParameterException, GeneralException;

    public List<CountryTranslation> getCountryTranslationByCountryId(Long countryId) throws EmptyListException, NullParameterException, GeneralException;
    
    public List<Provider> getProvider() throws EmptyListException, GeneralException, NullParameterException;
    
    public List<Braund> getBraunds() throws EmptyListException, GeneralException, NullParameterException;
    
    public List<Model> getModelsByBraund(Long braundId) throws EmptyListException, GeneralException, NullParameterException;
    
    public List<ControlType> getControlTypes() throws EmptyListException, GeneralException, NullParameterException;

    public List<EnterCalibration> getEnterCalibrations() throws EmptyListException, GeneralException, NullParameterException;
    
    public Braund saveBraund(Braund braund) throws NullParameterException, GeneralException;
    
    public Model saveModel(Model model) throws NullParameterException, GeneralException;
    
    public List<Model> getModels() throws EmptyListException, GeneralException, NullParameterException;
    
    public EnterCalibration saveEnterCalibration(EnterCalibration enterCalibration) throws NullParameterException, GeneralException;
  }
