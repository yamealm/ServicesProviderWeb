package com.alodiga.services.provider.commons.ejbs;

import java.util.List;

import com.alodiga.services.provider.commons.exceptions.EmptyListException;
import com.alodiga.services.provider.commons.exceptions.GeneralException;
import com.alodiga.services.provider.commons.exceptions.NullParameterException;
import com.alodiga.services.provider.commons.exceptions.RegisterNotFoundException;
import com.alodiga.services.provider.commons.genericEJB.EJBRequest;
import com.alodiga.services.provider.commons.genericEJB.SPGenericEJB;
import com.alodiga.services.provider.commons.models.Account;
import com.alodiga.services.provider.commons.models.City;
import com.alodiga.services.provider.commons.models.Country;
import com.alodiga.services.provider.commons.models.CountryHasProvider;
import com.alodiga.services.provider.commons.models.CountryTranslation;
import com.alodiga.services.provider.commons.models.County;
import com.alodiga.services.provider.commons.models.Currency;
import com.alodiga.services.provider.commons.models.Enterprise;
import com.alodiga.services.provider.commons.models.Invoice;
import com.alodiga.services.provider.commons.models.IpAddress;
import com.alodiga.services.provider.commons.models.IpBlackList;
import com.alodiga.services.provider.commons.models.Language;
import com.alodiga.services.provider.commons.models.Payment;
import com.alodiga.services.provider.commons.models.PaymentInfo;
import com.alodiga.services.provider.commons.models.PaymentType;
import com.alodiga.services.provider.commons.models.Period;
import com.alodiga.services.provider.commons.models.SMS;
import com.alodiga.services.provider.commons.models.State;
import com.alodiga.services.provider.commons.models.TinType;
import com.alodiga.services.provider.commons.utils.Mail;
import java.sql.Timestamp;
import java.util.Date;

import javax.ejb.Local;

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

    public List<Account> getAccounts() throws EmptyListException, GeneralException, NullParameterException;

    public List<Language> getLanguages() throws EmptyListException, GeneralException, NullParameterException;

    public List<Period> getPeriods() throws EmptyListException, GeneralException, NullParameterException;

    public List<State> getStateByCountry(EJBRequest request) throws EmptyListException, GeneralException, NullParameterException;

    public City loadCity(EJBRequest request) throws RegisterNotFoundException, NullParameterException, GeneralException;

    public Country loadCountry(EJBRequest request) throws RegisterNotFoundException, NullParameterException, GeneralException;

    public County loadCounty(EJBRequest request) throws RegisterNotFoundException, NullParameterException, GeneralException;

    public Currency loadCurrency(EJBRequest request) throws RegisterNotFoundException, NullParameterException, GeneralException;

    public  Enterprise loadEnterprisebyId(Long enterpriseId) throws GeneralException;

    public Account loadAccountbyId(Long accountId) throws GeneralException;

    public Float getTotalAmauntbyTransacction(Long accountId, Timestamp date1, Date date2) throws GeneralException, NullParameterException;

    public Float getTotalTaxTransacction(Long accountId, Timestamp date1, Date date2) throws GeneralException, NullParameterException;

    public Float getTotalTransacctionNum(Long accountId, Timestamp date1, Date date2) throws GeneralException, NullParameterException;

    public Enterprise loadEnterprise(EJBRequest request) throws RegisterNotFoundException, NullParameterException, GeneralException;

    public Language loadLanguage(EJBRequest request) throws RegisterNotFoundException, NullParameterException, GeneralException;

    public Period loadPeriod(EJBRequest request) throws RegisterNotFoundException, NullParameterException, GeneralException;

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

    public SMS saveSMS(EJBRequest request) throws NullParameterException, GeneralException;

    public CountryTranslation saveCountryTranslation(CountryTranslation countryTranslation) throws NullParameterException, GeneralException;

    public List<CountryTranslation> getCountryTranslationByCountryId(Long countryId) throws EmptyListException, NullParameterException, GeneralException;

    public List<SMS> searchSMS(Date beginningDate, Date endingDate, Account account) throws GeneralException, NullParameterException, EmptyListException;

    public List<PaymentType> getPaymentTypes() throws GeneralException, EmptyListException;

    public int getInvoiceByAccontId(Long accountId) throws GeneralException, NullParameterException;

    public  List<Invoice> loadInvoicesbyId(EJBRequest request) throws GeneralException, NullParameterException, EmptyListException;

    public List<Invoice> loadInvoicesbyIds(Long accountId) throws GeneralException;

    public Invoice loadInvoices(Long invId) throws GeneralException;

    public Period loadperiod(Period period) throws RegisterNotFoundException, NullParameterException, GeneralException;

    public boolean isIpAddresInBlackList(String ip) throws NullParameterException, GeneralException;

    public IpBlackList saveIpBlackList(IpBlackList ipBlackList) throws NullParameterException, GeneralException;

    public IpAddress loadIpddress(String ipAddress) throws RegisterNotFoundException, NullParameterException, GeneralException;

    public List<IpBlackList> getBlackList() throws GeneralException, EmptyListException;

    public IpBlackList loadBlackList(String ipAddress) throws RegisterNotFoundException, NullParameterException, GeneralException;

    public void deleteIpBlackList(String ipBlackList) throws NullParameterException, GeneralException;

    public PaymentInfo loadPaymentInfoBySisacId(String referenceCode) throws RegisterNotFoundException, NullParameterException, GeneralException;

  }
