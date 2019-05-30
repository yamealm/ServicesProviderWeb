package com.alodiga.services.provider.commons.ejbs;

import java.util.List;
import java.util.Map;
import javax.ejb.Local;

import com.alodiga.services.provider.commons.exceptions.EmptyListException;
import com.alodiga.services.provider.commons.exceptions.GeneralException;
import com.alodiga.services.provider.commons.exceptions.NullParameterException;
import com.alodiga.services.provider.commons.exceptions.RegisterNotFoundException;
import com.alodiga.services.provider.commons.genericEJB.EJBRequest;
import com.alodiga.services.provider.commons.genericEJB.SPGenericEJBLocal;
import com.alodiga.services.provider.commons.models.PreferenceField;
import com.alodiga.services.provider.commons.models.PreferenceType;
import com.alodiga.services.provider.commons.models.PreferenceValue;

@SuppressWarnings("all")
@Local
public interface PreferencesEJBLocal extends SPGenericEJBLocal {

    public PreferenceField deletePreferenceField(EJBRequest request) throws GeneralException, NullParameterException;

    public PreferenceType deletePreferenceType(EJBRequest request) throws GeneralException, NullParameterException;

    public PreferenceValue deletePreferenceValue(EJBRequest request) throws GeneralException, NullParameterException;

    public Map<Long, String> getLastPreferenceValues(EJBRequest request) throws GeneralException, RegisterNotFoundException, NullParameterException, EmptyListException;

    public List<PreferenceField> getPreferenceFields(EJBRequest request) throws GeneralException, RegisterNotFoundException, NullParameterException, EmptyListException;

    public List<PreferenceType> getPreferenceTypes(EJBRequest request) throws GeneralException, RegisterNotFoundException, NullParameterException, EmptyListException;

    public List<PreferenceValue> getPreferenceValues(EJBRequest request) throws GeneralException, RegisterNotFoundException, NullParameterException, EmptyListException;

    public List<PreferenceValue> getPreferenceValuesByEnterpriseIdAndFieldId(Long enterpriseId, Long fieldId) throws GeneralException, RegisterNotFoundException, NullParameterException, EmptyListException;

    public PreferenceValue loadActivePreferenceValuesByEnterpriseIdAndFieldId(Long enterpriseId, Long fieldId) throws GeneralException, RegisterNotFoundException, NullParameterException;
    
    public PreferenceField loadPreferenceField(EJBRequest request) throws GeneralException, RegisterNotFoundException, NullParameterException;

    public PreferenceType loadPreferenceType(EJBRequest request) throws GeneralException, RegisterNotFoundException, NullParameterException;

    public PreferenceValue loadPreferenceValue(EJBRequest request) throws GeneralException, RegisterNotFoundException, NullParameterException;

    public PreferenceField savePreferenceField(EJBRequest request) throws GeneralException, NullParameterException;

    public PreferenceType savePreferenceType(EJBRequest request) throws GeneralException, NullParameterException;

    public PreferenceValue savePreferenceValue(EJBRequest request) throws GeneralException, NullParameterException;

    public List<PreferenceValue> savePreferenceValues(EJBRequest request) throws GeneralException, NullParameterException;
}
