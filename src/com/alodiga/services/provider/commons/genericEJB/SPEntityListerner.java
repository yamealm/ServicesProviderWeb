package com.alodiga.services.provider.commons.genericEJB;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import javax.persistence.PostLoad;
import javax.persistence.PostPersist;
import javax.persistence.PostRemove;
import javax.persistence.PostUpdate;
import javax.persistence.PrePersist;
import javax.persistence.PreRemove;
import javax.persistence.PreUpdate;

public class SPEntityListerner {

    @PrePersist
    public void onEntityPrePersist(Object entity) {
    }

    @PostPersist
    public void onEntityPostPersist(Object entity) {
    }

    @PreRemove
    public void onEntityPreRemove(Object entity) {
    }

    @PostRemove
    public void onEntityPostRemove(Object entity) {
    }

    @PreUpdate
    public void onEntityPreUpdate(Object entity) {
    }

    @PostUpdate
    public void onEntityPostUpdate(Object entity) {
    }

    @PostLoad
    public void onEntityLoad(Object entity) {
    }

 
    public static boolean isInstanceEntity(Object entity) {
        return entity instanceof AbstractSPEntity;
    }
}
