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
import com.alodiga.services.provider.commons.models.Permission;
import com.alodiga.services.provider.commons.models.PermissionGroup;
import com.alodiga.services.provider.commons.models.Profile;
//import com.alodiga.services.provider.commons.models.Account;
//import com.alodiga.services.provider.commons.models.AccountProduct;
//import com.alodiga.services.provider.commons.models.Invoice;
//import com.alodiga.services.provider.commons.models.Permission;
//import com.alodiga.services.provider.commons.models.PermissionGroup;
//import com.alodiga.services.provider.commons.models.Profile;
import com.alodiga.services.provider.commons.models.User;


@Remote
public interface UserEJB extends SPGenericEJB {

    public List<User> getUsers(EJBRequest request) throws EmptyListException, GeneralException, NullParameterException;

    public User loadUser(EJBRequest request) throws RegisterNotFoundException, NullParameterException, GeneralException;

    public User loadUserByEmail(EJBRequest request) throws RegisterNotFoundException, NullParameterException, GeneralException;

    public User loadUserByLogin(EJBRequest request) throws RegisterNotFoundException, NullParameterException, GeneralException;

    public User saveUser(EJBRequest request) throws NullParameterException, GeneralException;

    public boolean validateExistingUser(EJBRequest request) throws NullParameterException, GeneralException;

    public List<User> getUserTopUpNotification() throws EmptyListException, GeneralException;

    public void updateUserNotifications(String ids) throws NullParameterException, GeneralException;

    public List<PermissionGroup> getPermissionGroups() throws EmptyListException, NullParameterException, GeneralException;

    public List<Permission> getPermissions() throws EmptyListException, NullParameterException, GeneralException;

    public List<Permission> getPermissionByGroupId(Long groupId) throws EmptyListException, NullParameterException, GeneralException;

    public List<Permission> getPermissionByProfileId(Long profileId) throws EmptyListException, NullParameterException, GeneralException;

    public Permission loadPermissionById(Long permissionId) throws GeneralException, NullParameterException, RegisterNotFoundException;

    public List<Profile> getProfiles() throws EmptyListException, GeneralException;

    public User loadUserByLogin(String login) throws RegisterNotFoundException, NullParameterException, GeneralException;

     
}
