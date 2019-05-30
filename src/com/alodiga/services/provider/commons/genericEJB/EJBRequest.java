package com.alodiga.services.provider.commons.genericEJB;

import com.alodiga.services.provider.commons.models.Audit;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import org.springframework.http.HttpMethod;
import com.alodiga.services.provider.commons.utils.DistributionWSMediaType;

public class EJBRequest implements Serializable {

    private Integer limit;
    private Integer first;
    private Object param;
    private Map<String, Object> params;
    private List<Audit> auditData;
    private String url;
    private DistributionWSMediaType mediaType;
    private HttpMethod method;

    public EJBRequest() {
        super();
    }

    public EJBRequest(Integer limit, Integer first) {
        super();
        this.limit = limit;
        this.first = first;
    }

    public EJBRequest(Integer limit, Integer first, Object param) {
        super();
        this.limit = limit;
        this.first = first;
        this.param = param;
    }

    public EJBRequest(Integer limit, Integer first, Map<String, Object> params) {
        super();
        this.limit = limit;
        this.first = first;
        this.params = params;
    }

    public EJBRequest(Integer limit, Integer first, Map<String, Object> params, List<Audit> auditData) {
        super();
        this.limit = limit;
        this.first = first;
        this.auditData = auditData;
    }

    public EJBRequest(Integer limit, Integer first, Object param,
            Map<String, Object> params, List<Audit> auditData) {
        super();
        this.limit = limit;
        this.first = first;
        this.param = param;
        this.params = params;
        this.auditData = auditData;
    }

    public EJBRequest(Object param) {
        super();
        this.param = param;
    }

    public EJBRequest(Object param, List<Audit> auditData) {
        super();
        this.param = param;
        this.auditData = auditData;
    }

    public EJBRequest(Map<String, Object> params, List<Audit> auditData) {
        super();
        this.params = params;
        this.auditData = auditData;
    }

    public EJBRequest(Integer limit, Integer first,
            List<Audit> auditData) {
        super();
        this.limit = limit;
        this.first = first;
        this.auditData = auditData;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getFirst() {
        return first;
    }

    public void setFirst(Integer first) {
        this.first = first;
    }

    public Object getParam() {
        return param;
    }

    public void setParam(Object param) {
        this.param = param;
    }

    public Map<String, Object> getParams() {
        return params;
    }

    public void setParams(Map<String, Object> params) {
        this.params = params;
    }

     public List<Audit> getAuditData() {
        return auditData;
    }

    public void setAuditData(List<Audit> auditData) {
        this.auditData = auditData;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public DistributionWSMediaType getMediaType() {
        return mediaType;
    }

    public void setMediaType(DistributionWSMediaType mediaType) {
        this.mediaType = mediaType;
    }

    public HttpMethod getMethod() {
        return method;
    }

    public void setMethod(HttpMethod method) {
        this.method = method;
    }
}
