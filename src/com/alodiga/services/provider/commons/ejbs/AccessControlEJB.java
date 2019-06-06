package com.alodiga.services.provider.commons.ejbs;

import java.util.List;

import javax.ejb.Remote;

import com.alodiga.services.provider.commons.exceptions.DisabledDistributorException;
import com.alodiga.services.provider.commons.exceptions.EmptyListException;
import com.alodiga.services.provider.commons.exceptions.GeneralException;
import com.alodiga.services.provider.commons.exceptions.NullParameterException;
import com.alodiga.services.provider.commons.exceptions.RegisterNotFoundException;
import com.alodiga.services.provider.commons.genericEJB.EJBRequest;
import com.alodiga.services.provider.commons.genericEJB.SPGenericEJB;
import com.alodiga.services.provider.commons.models.Permission;
import com.alodiga.services.provider.commons.models.Profile;
import com.alodiga.services.provider.commons.models.ProfileData;
import com.alodiga.services.provider.commons.models.User;

@Remote
public interface AccessControlEJB extends SPGenericEJB {

    public void deletePermissionHasProfile(Long profileId) throws NullParameterException, GeneralException;

    public List<Permission> getPermissions(EJBRequest request) throws EmptyListException, GeneralException, NullParameterException;

    public List<Profile> getProfiles(EJBRequest request) throws EmptyListException, GeneralException, NullParameterException;

    public Permission loadPermission(EJBRequest request) throws RegisterNotFoundException, NullParameterException, GeneralException;

    public Profile loadProfile(EJBRequest request) throws RegisterNotFoundException, NullParameterException, GeneralException;

    public void logginFailed(EJBRequest request) throws NullParameterException, GeneralException, RegisterNotFoundException;

    public void logginSuccessful(EJBRequest request) throws NullParameterException, GeneralException, RegisterNotFoundException;

    public Permission savePermission(EJBRequest request) throws NullParameterException, GeneralException;

    public Profile saveProfile(EJBRequest request) throws NullParameterException, GeneralException;

    public ProfileData saveProfileData(EJBRequest request) throws NullParameterException, GeneralException;

    public boolean validateLoginPreferences(EJBRequest request) throws NullParameterException, GeneralException, RegisterNotFoundException;

    public User validateUser(String login, String password) throws RegisterNotFoundException, NullParameterException, GeneralException, DisabledDistributorException;

 }
