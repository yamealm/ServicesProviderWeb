package com.alodiga.services.provider.commons.ejbs;

import java.util.List;
import javax.ejb.Remote;
import com.alodiga.services.provider.commons.exceptions.EmptyListException;
import com.alodiga.services.provider.commons.exceptions.GeneralException;
import com.alodiga.services.provider.commons.exceptions.NullParameterException;
import com.alodiga.services.provider.commons.exceptions.RegisterNotFoundException;
import com.alodiga.services.provider.commons.genericEJB.SPGenericEJB;
import com.alodiga.services.provider.commons.genericEJB.EJBRequest;
import com.alodiga.services.provider.commons.models.Address;
import com.alodiga.services.provider.commons.models.Customer;


@SuppressWarnings("all")
@Remote
public interface CustomerEJB extends SPGenericEJB {

    public Customer deleteCustomer(EJBRequest request) throws GeneralException, NullParameterException;

    public List<Customer> getCustomers(EJBRequest request) throws GeneralException, NullParameterException, EmptyListException;

    public List<Customer> getCustomersByConditions(EJBRequest request) throws GeneralException, NullParameterException, EmptyListException;

    public Customer loadCustomer(EJBRequest request) throws GeneralException, RegisterNotFoundException, NullParameterException;

    public Customer loadCustomerByEmail(EJBRequest request) throws GeneralException, RegisterNotFoundException, NullParameterException;

    public Customer loadCustomerByLogin(EJBRequest request) throws GeneralException, RegisterNotFoundException, NullParameterException;

    public Customer loadCustomerByLogin(String login) throws GeneralException, RegisterNotFoundException, NullParameterException;

    public Customer saveCustomer(EJBRequest request) throws GeneralException, NullParameterException;

    public Customer saveCustomer(Customer customer) throws NullParameterException, GeneralException;

    public Address saveAddress(Address address) throws NullParameterException, GeneralException;

    public List<Customer> searchCustomers(String login, String fullName, String email) throws EmptyListException, NullParameterException, GeneralException;

   
}
