package com.alodiga.services.provider.commons.models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.alodiga.services.provider.commons.exceptions.TableNotFoundException;
import com.alodiga.services.provider.commons.genericEJB.AbstractSPEntity;
import com.alodiga.services.provider.commons.utils.QueryConstants;
import javax.persistence.NamedQuery;

@Entity
@Table(name = "permission_has_profile")
@NamedQuery(name = QueryConstants.DELETE_PERMISSION_HAS_PROFILE,
query = "DELETE FROM PermissionHasProfile php WHERE php.profile.id=:profileId")
public class PermissionHasProfile extends AbstractSPEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //bi-directional many-to-one association to Permission
    @ManyToOne
    @JoinColumn(name = "permissionId")
    private Permission permission;
    //bi-directional many-to-one association to Profile
    @ManyToOne
    @JoinColumn(name = "profileId")
    private Profile profile;

    public PermissionHasProfile() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Permission getPermission() {
        return this.permission;
    }

    public void setPermission(Permission permission) {
        this.permission = permission;
    }

    public Profile getProfile() {
        return this.profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
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
