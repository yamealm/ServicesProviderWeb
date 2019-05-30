package com.alodiga.services.provider.commons.models;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.alodiga.services.provider.commons.exceptions.TableNotFoundException;
import com.alodiga.services.provider.commons.genericEJB.AbstractSPEntity;
import com.alodiga.services.provider.commons.utils.IndexComparator;

import java.util.Collections;

@Entity
@Table(name = "report")
public class Report extends AbstractSPEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    public static final Long REPORT_WALLET = 20l;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Lob()
    private String description;
    @ManyToOne(cascade = {CascadeType.REFRESH})
    @JoinColumn(name = "reportTypeId")
    private ReportType reportType;
    private boolean enabled;
    private String name;
    @Lob()
    private String query;
    private String webServiceUrl;
    //bi-directional many-to-one association to ReportHasProfile
    @OneToMany(mappedBy = "report", fetch = FetchType.EAGER, cascade = {CascadeType.ALL})
    private List<ReportHasProfile> reportHasProfiles;
    //bi-directional many-to-one association to ReportParameter
    @OneToMany(mappedBy = "report", fetch = FetchType.EAGER, cascade = {CascadeType.ALL})
    private List<ReportParameter> reportParameters;

    public Report() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean getEnabled() {
        return this.enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuery() {
        return this.query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getWebServiceUrl() {
        return this.webServiceUrl;
    }

    public void setWebServiceUrl(String webServiceUrl) {
        this.webServiceUrl = webServiceUrl;
    }

    public List<ReportHasProfile> getReportHasProfiles() {
        return this.reportHasProfiles;
    }

    public void setReportHasProfiles(List<ReportHasProfile> reportHasProfiles) {
        this.reportHasProfiles = reportHasProfiles;
    }

    public List<ReportParameter> getReportParameters() {
        Collections.sort(reportParameters, new IndexComparator());
        return this.reportParameters;
    }

    public void setReportParameters(List<ReportParameter> reportParameters) {
        this.reportParameters = reportParameters;
    }

    public ReportType getReportType() {
        return reportType;
    }

    public void setReportType(ReportType reportType) {
        this.reportType = reportType;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public Object getPk() {
        return getId();
    }

    @Override
    public String getTableName() throws TableNotFoundException {
        return super.getTableName(this.getClass());
    }
}
