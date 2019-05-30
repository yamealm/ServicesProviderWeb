package com.alodiga.services.provider.commons.ejbs;

import java.util.List;
import javax.ejb.Local;

import com.alodiga.services.provider.commons.exceptions.EmptyListException;
import com.alodiga.services.provider.commons.exceptions.GeneralException;
import com.alodiga.services.provider.commons.exceptions.NullParameterException;
import com.alodiga.services.provider.commons.exceptions.RegisterNotFoundException;
import com.alodiga.services.provider.commons.genericEJB.EJBRequest;
import com.alodiga.services.provider.commons.genericEJB.SPGenericEJB;
import com.alodiga.services.provider.commons.models.ParameterType;
import com.alodiga.services.provider.commons.models.Report;
import com.alodiga.services.provider.commons.models.ReportHasProfile;
import com.alodiga.services.provider.commons.models.ReportParameter;
import com.alodiga.services.provider.commons.models.ReportType;
import com.alodiga.services.provider.commons.models.User;

@SuppressWarnings("all")
@Local
public interface ReportEJBLocal extends SPGenericEJB {

    public void deleteProfileReports(EJBRequest request) throws NullParameterException, GeneralException;

    public void deleteReportParameter(EJBRequest request) throws NullParameterException, GeneralException;

    public Report enableProduct(EJBRequest request) throws GeneralException, NullParameterException, RegisterNotFoundException;

    public List<ParameterType> getParameterType(EJBRequest request) throws EmptyListException, GeneralException, NullParameterException;

    public List<Report> getReport(EJBRequest request) throws EmptyListException, GeneralException, NullParameterException;

    public List<ReportHasProfile> getReportByProfile(EJBRequest request) throws EmptyListException, GeneralException, NullParameterException;

    public List<Report> getReportByReportTypeId(Long reportTypeId, User currentUser) throws NullParameterException, GeneralException, EmptyListException;

    public List<ReportParameter> getReportParameter(EJBRequest request) throws EmptyListException, GeneralException, NullParameterException;

    public List<ReportType> getReportTypes(EJBRequest request) throws EmptyListException, GeneralException, NullParameterException;

    public ParameterType loadParameterType(EJBRequest request) throws RegisterNotFoundException, NullParameterException, GeneralException;

    public Report loadReport(EJBRequest request) throws RegisterNotFoundException, NullParameterException, GeneralException;

    public ReportParameter loadReportParameter(EJBRequest request) throws RegisterNotFoundException, NullParameterException, GeneralException;

    public List<String> runReport(EJBRequest request) throws NullParameterException, GeneralException, EmptyListException;

    public Report saveReport(EJBRequest request) throws NullParameterException, GeneralException, NullParameterException;
}
