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
import com.alodiga.services.provider.commons.models.Audit;
import com.alodiga.services.provider.commons.models.AuditAction;
import com.alodiga.services.provider.commons.models.Event;

@Remote
public interface AuditoryEJB extends SPGenericEJB {
	
	public List<Audit> getLastAudits(EJBRequest request) throws GeneralException, RegisterNotFoundException, NullParameterException, EmptyListException;

    public List<Audit> getAudits(EJBRequest request) throws GeneralException, RegisterNotFoundException, NullParameterException, EmptyListException;

    public Audit loadAudit(EJBRequest request) throws GeneralException, RegisterNotFoundException, NullParameterException;

    public Audit saveAudit(EJBRequest request) throws GeneralException, NullParameterException;

    public List<Audit> searchAudit(EJBRequest request) throws GeneralException, NullParameterException, EmptyListException;

    public AuditAction deleteAuditAction(Long actionId) throws GeneralException, NullParameterException;

    public List<AuditAction> getAuditActions(Date beginningDate, Date endingDate) throws GeneralException, RegisterNotFoundException, NullParameterException, EmptyListException;

    public List<AuditAction> searchAuditAction(String login, String userName, Long permissionId, Date beginningDate, Date endingDate) throws GeneralException, NullParameterException, EmptyListException;

    public AuditAction saveAuditAction(AuditAction action) throws GeneralException, NullParameterException;

    public List<AuditAction> getAuditActionsByUserId(Long userId, Date beginningDate, Date endingDate) throws GeneralException, RegisterNotFoundException, NullParameterException, EmptyListException;
    
    public Event loadEvent(EJBRequest request) throws RegisterNotFoundException, NullParameterException, GeneralException;
    
    public String getNaturalFieldUser(EJBRequest request1, EJBRequest request2) throws NullParameterException, GeneralException;
    
    public String getNaturalFieldProfile(EJBRequest request1, EJBRequest request2) throws NullParameterException, GeneralException;
    
    public String getNaturalFieldMetrologicalControl(EJBRequest request1, EJBRequest request2) throws NullParameterException, GeneralException;
    
    public String getNaturalFieldCustomer(EJBRequest request1, EJBRequest request2) throws NullParameterException, GeneralException;
    
    public String getNaturalFieldBraund(EJBRequest request1, EJBRequest request2) throws NullParameterException, GeneralException;
    
    public String getNaturalFieldModel(EJBRequest request1, EJBRequest request2) throws NullParameterException, GeneralException;
    
    public String getNaturalFieldProduct(EJBRequest request1, EJBRequest request2) throws NullParameterException, GeneralException;
    
    public String getNaturalFieldProvider(EJBRequest request1, EJBRequest request2) throws NullParameterException, GeneralException;
    
}
