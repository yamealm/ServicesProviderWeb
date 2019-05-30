package com.alodiga.services.provider.commons.managers;

import com.alodiga.services.provider.commons.ejbs.PreferencesEJB;
import com.alodiga.services.provider.commons.ejbs.UtilsEJB;
import com.alodiga.services.provider.commons.genericEJB.EJBRequest;
import com.alodiga.services.provider.commons.models.Enterprise;
import com.alodiga.services.provider.commons.models.PreferenceFieldEnum;
import com.alodiga.services.provider.commons.utils.EJBServiceLocator;
import com.alodiga.services.provider.commons.utils.EjbConstants;
import com.alodiga.services.provider.commons.utils.QueryConstants;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ejb.EJB;

@SuppressWarnings("all")
public class PreferenceManager {

    private static PreferenceManager instance;
    private Map<Long, Map<Long, String>> preferencesByEnterprise = new HashMap<Long, Map<Long, String>>();
    private Map<Long, String> preferences = new HashMap<Long, String>();
    @EJB
    private PreferencesEJB preferencesEJB;
    @EJB
    private UtilsEJB utilsEJB;

    public static synchronized PreferenceManager getInstance() throws Exception {
        if (instance == null) {
            instance = new PreferenceManager();
        }
        return instance;
    }

    public static void refresh() throws Exception {
        instance = new PreferenceManager();
    }

    private PreferenceManager() throws Exception {

        preferencesEJB = (PreferencesEJB) EJBServiceLocator.getInstance().get(EjbConstants.PREFERENCES_EJB);
        utilsEJB = (UtilsEJB) EJBServiceLocator.getInstance().get(EjbConstants.UTILS_EJB);
        List<Enterprise> enterprises = utilsEJB.getEnterprises();
        for (Enterprise enterprise : enterprises) {
            
            EJBRequest request = new EJBRequest();
            Map params = new HashMap<String, Object>();
            params.put(QueryConstants.PARAM_ENTERPRISE_ID, enterprise.getId());
            request.setParams(params);
            try {
                preferences = preferencesEJB.getLastPreferenceValues(request);
                preferencesByEnterprise.put(enterprise.getId(), preferences);
            } catch (Exception e) {
                e.printStackTrace();
                throw new Exception(e);
            }
        }

    }

    public String getPreferenceValueByPreferenceId(Long preferenceFielId) {
        return preferences.get(preferenceFielId);
    }
    public String getPreferencesValueByEnterpriseAndPreferenceId(Long enterpriseId, Long preferenceFielId) {
        return preferencesByEnterprise.get(enterpriseId).get(preferenceFielId);
    }

    public Map<Long, String> getPreferences() {
        return preferences;
    }
    public Float getPointsExchangeByEnterpriseId(Long enterpriseId){
        return Float.parseFloat(preferencesByEnterprise.get(enterpriseId).get(PreferenceFieldEnum.POINT_EXCHANGE.getId()));


    }
}
