package ru.naumen.core.server.catalog.servicetime;

import java.util.Date;

import ru.naumen.core.server.script.api.servicetime.IServiceTimeExclusion;

public class ServiceTimeExclusionImpl implements IServiceTimeExclusion {
    ServiceTimeExclusion exclusion;

    public ServiceTimeExclusionImpl(ServiceTimeExclusion exclusion) {
        this.exclusion = exclusion;
    }

    public Long getEndTime() {
        return this.exclusion.getEndTime();
    }

    public ServiceTimeExclusion getExclusion() {
        return this.exclusion;
    }

    public Date getExclusionDate() {
        return this.exclusion.getExclusionDate();
    }

    public Long getId() {
        return this.exclusion.getId();
    }

    public Long getStartTime() {
        return this.exclusion.getStartTime();
    }

    public String getUuid() {
        return this.exclusion.getUUID();
    }

    public String toString() {
        return "";
    }
}
