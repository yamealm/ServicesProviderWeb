package com.alodiga.services.provider.commons.ejbs;

import java.util.Date;
import java.util.List;

import javax.ejb.Remote;

import com.alodiga.services.provider.commons.exceptions.EmptyListException;
import com.alodiga.services.provider.commons.exceptions.GeneralException;
import com.alodiga.services.provider.commons.exceptions.NullParameterException;
import com.alodiga.services.provider.commons.exceptions.RegisterNotFoundException;
import com.alodiga.services.provider.commons.genericEJB.EJBRequest;
import com.alodiga.services.provider.commons.genericEJB.SPGenericEJB;
import com.alodiga.services.provider.commons.models.Account;
import com.alodiga.services.provider.commons.models.AccountProduct;
import com.alodiga.services.provider.commons.models.Invoice;
import com.alodiga.services.provider.commons.models.Permission;
import com.alodiga.services.provider.commons.models.PermissionGroup;
import com.alodiga.services.provider.commons.models.Profile;
import com.alodiga.services.provider.commons.models.User;


@Remote
public interface UserEJB extends SPGenericEJB {

    public List<User> getUsers(EJBRequest request) throws EmptyListException, GeneralException, NullParameterException;

    public User loadUser(EJBRequest request) throws RegisterNotFoundException, NullParameterException, GeneralException;

    public User loadUserByEmail(EJBRequest request) throws RegisterNotFoundException, NullParameterException, GeneralException;

    public User loadUserByLogin(EJBRequest request) throws RegisterNotFoundException, NullParameterException, GeneralException;

    public Account loadAccountByLogin(String login) throws RegisterNotFoundException, NullParameterException, GeneralException;

    public User saveUser(EJBRequest request) throws NullParameterException, GeneralException;

    public Invoice saveInvoice(EJBRequest request) throws GeneralException, NullParameterException;

    public boolean validateExistingUser(EJBRequest request) throws NullParameterException, GeneralException;

    public Float getPointsByDistributor(Long distributorId, int previousDays) throws NullParameterException, GeneralException;

    public List<User> getUserTopUpNotification() throws EmptyListException, GeneralException;

    public void updateUserNotifications(String ids) throws NullParameterException, GeneralException;

    public Float getTotalPointsByDistributor(Long distributorId, Date beginningDate, Date endingDate) throws NullParameterException, GeneralException;

    public List<PermissionGroup> getPermissionGroups() throws EmptyListException, NullParameterException, GeneralException;

    public List<Permission> getPermissions() throws EmptyListException, NullParameterException, GeneralException;

    public List<Permission> getPermissionByGroupId(Long groupId) throws EmptyListException, NullParameterException, GeneralException;

    public List<Permission> getPermissionByProfileId(Long profileId) throws EmptyListException, NullParameterException, GeneralException;

    public Permission loadPermissionById(Long permissionId) throws GeneralException, NullParameterException, RegisterNotFoundException;

    public List<Profile> getProfiles() throws EmptyListException, GeneralException;

    public Float getCurrentMonthlyPoints(Long distributorId, Date date) throws NullParameterException, GeneralException;

    public Account saveAccount(EJBRequest request) throws GeneralException, NullParameterException;

    public List<Account> getAccounts(EJBRequest request) throws EmptyListException, GeneralException, NullParameterException;

    public List<Account> searchAccounts(Long enterpriseId, String login, String fullName, String email, String status) throws EmptyListException, NullParameterException, GeneralException;

    public User loadUserByLogin(String login) throws RegisterNotFoundException, NullParameterException, GeneralException;

    public Float CountTransaccionByPaymentInfo(String creditCarNumber) throws RegisterNotFoundException, NullParameterException, GeneralException;

    public Account loadAccount(EJBRequest request) throws RegisterNotFoundException, NullParameterException, GeneralException;

    public Account loadCurrentParentByAccount(Long accountId) throws GeneralException, NullParameterException, RegisterNotFoundException;

    public List<Account> getAccountParentsHasAccount(EJBRequest request) throws GeneralException, NullParameterException, EmptyListException;

    public Account searchAccountsByLogin(String login) throws RegisterNotFoundException, NullParameterException, GeneralException;

    public Invoice getInvoiceByID(Long numInvoice) throws EmptyListException, GeneralException, NullParameterException, RegisterNotFoundException;

    public Account loadAccountbyFullName(String fullName);

    public Account loadAccountById(String id) throws RegisterNotFoundException, NullParameterException, GeneralException;

    public AccountProduct saveAccountProduct(EJBRequest request) throws GeneralException, NullParameterException;

    public float getAccountProductCalculationByAccountId(Long accountId, Long productId) throws GeneralException, RegisterNotFoundException, NullParameterException;

    public List<AccountProduct> loadAccountProductCalculationByAccountId(Long accountId) throws NullParameterException, EmptyListException, GeneralException;

  
}
