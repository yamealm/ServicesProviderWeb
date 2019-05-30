package com.alodiga.services.provider.commons.ejbs;

import java.util.List;
import javax.ejb.Local;
import com.alodiga.services.provider.commons.exceptions.EmptyListException;
import com.alodiga.services.provider.commons.exceptions.GeneralException;
import com.alodiga.services.provider.commons.exceptions.NullParameterException;
import com.alodiga.services.provider.commons.exceptions.RegisterNotFoundException;
import com.alodiga.services.provider.commons.genericEJB.SPGenericEJB;
import com.alodiga.services.provider.commons.genericEJB.EJBRequest;
import com.alodiga.services.provider.commons.models.Address;
import com.alodiga.services.provider.commons.models.Customer;

@SuppressWarnings("all")
@Local
public interface CustomerEJBLocal extends SPGenericEJB {

    public Customer deleteCustomer(EJBRequest request) throws GeneralException, NullParameterException;

    public List<Customer> getCustomers(EJBRequest request) throws GeneralException, NullParameterException, EmptyListException;

    public List<Customer> getCustomersByConditions(EJBRequest request) throws GeneralException, NullParameterException, EmptyListException;

    public Customer loadCustomer(EJBRequest request) throws GeneralException, RegisterNotFoundException, NullParameterException;

    public Customer loadCustomerByAni(String ani) throws RegisterNotFoundException, GeneralException, NullParameterException;

    public Customer loadCustomerByEmail(EJBRequest request) throws GeneralException, RegisterNotFoundException, NullParameterException;

    public Customer loadCustomerByLogin(EJBRequest request) throws GeneralException, RegisterNotFoundException, NullParameterException;

    public Customer loadCustomerByLogin(String login) throws GeneralException, RegisterNotFoundException, NullParameterException;

    public Customer loadCustomerByProductPinFree(String pinFree) throws GeneralException, NullParameterException;

    public Customer loadCustomerBySerial(String serial) throws RegisterNotFoundException, GeneralException, NullParameterException;

    public Customer saveCustomer(EJBRequest request) throws GeneralException, NullParameterException;

    public Customer saveCustomer(Customer customer) throws NullParameterException, GeneralException;

    public Address saveAddress(Address address) throws NullParameterException, GeneralException;
    
    public List<Customer> searchCustomers(Long enterpriseId, String login, String fullName, String email) throws EmptyListException, NullParameterException, GeneralException;
    
}
