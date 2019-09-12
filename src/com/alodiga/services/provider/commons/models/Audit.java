package com.alodiga.services.provider.commons.models;

import com.alodiga.services.provider.commons.exceptions.TableNotFoundException;
import java.io.Serializable;
import javax.persistence.*;
import com.alodiga.services.provider.commons.genericEJB.AbstractSPEntity;
import java.sql.Timestamp;
import com.alodiga.services.provider.commons.utils.QueryConstants;

@Entity
@Table(name = "audit")
@NamedQueries({
    @NamedQuery(name = QueryConstants.LOAD_LAST_AUDITS,
    query = "SELECT a FROM Audit a order by a.id desc")
})
public class Audit extends AbstractSPEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Timestamp creationDate;
    private String extra;
    @Lob()
    private String newValues;
    @Lob()
    private String originalValues;
    
    private String remoteIp;
    private String responsibleType;
    private String tableName;
    //bi-directional many-to-one association to Event
    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "eventId")
    private Event event;
    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "userId")
    private User user;
    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "permissionId")
    private Permission permission;

    public Audit() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Timestamp getCreationDate() {
        return this.creationDate;
    }

    public void setCreationDate(Timestamp creationDate) {
        this.creationDate = creationDate;
    }

    public String getExtra() {
        return this.extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public String getNewValues() {
        return this.newValues;
    }

    public void setNewValues(String newValues) {
        this.newValues = newValues;
    }

    public String getOriginalValues() {
        return this.originalValues;
    }

    public void setOriginalValues(String originalValues) {
        this.originalValues = originalValues;
    }

    public String getRemoteIp() {
        return this.remoteIp;
    }

    public void setRemoteIp(String remoteIp) {
        this.remoteIp = remoteIp;
    }

    public String getResponsibleType() {
        return this.responsibleType;
    }

    public void setResponsibleType(String responsibleType) {
        this.responsibleType = responsibleType;
    }
    
    

    public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Permission getPermission() {
		return permission;
	}

	public void setPermission(Permission permission) {
		this.permission = permission;
	}

	@Override
    public String getTableName() throws TableNotFoundException {
        return super.getTableName(this.getClass());
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public Event getEvent() {
        return this.event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public Object getPk() {
        return getId();
    }
}
