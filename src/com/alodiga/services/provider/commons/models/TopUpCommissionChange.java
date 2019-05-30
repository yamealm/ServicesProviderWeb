package com.alodiga.services.provider.commons.models;


import com.alodiga.services.provider.commons.exceptions.TableNotFoundException;
import com.alodiga.services.provider.commons.genericEJB.AbstractSPEntity;
import com.alodiga.services.provider.commons.genericEJB.SPEntityListerner;
import com.alodiga.services.provider.commons.utils.QueryConstants;
import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@EntityListeners(SPEntityListerner.class)
@Table(name = "top_up_commission_change")
@NamedQuery(name = QueryConstants.DELETE_TUP_UP_COMMISSION_CHANGE,
query = "DELETE FROM TopUpCommissionChange tpcc WHERE tpcc.profile.id=:profileId")
        
public class TopUpCommissionChange extends AbstractSPEntity implements Serializable{

    private static final long serialVersionUID = 1L;
    public static String PENDING = "PENDING";
    public static String PROCESSED = "PROCESSED";
    public static String CANCELED_BY_ERRORS = "CANCELED_BY_ERRORS";
    public static String CANCELED = "CANCELED";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne(cascade = {CascadeType.REFRESH})
    @JoinColumn(name = "profileId")
    private Profile profile;

    @ManyToOne(cascade = {CascadeType.REFRESH})
    @JoinColumn(name = "responsibleUserId")
    private User responsibleUser;

    private String urlFile;
    private Timestamp beginningDate;
    private Timestamp endingDate;
    private String status;
    
    public Timestamp getBeginningDate() {
        return beginningDate;
    }

    public void setBeginningDate(Timestamp beginningDate) {
        this.beginningDate = beginningDate;
    }

    public Timestamp getEndingDate() {
        return endingDate;
    }

    public void setEndingDate(Timestamp endingDate) {
        this.endingDate = endingDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public User getResponsibleUser() {
        return responsibleUser;
    }

    public void setResponsibleUser(User responsibleUser) {
        this.responsibleUser = responsibleUser;
    }

    public String getUrlFile() {
        return urlFile;
    }

    public void setUrlFile(String urlFile) {
        this.urlFile = urlFile;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
