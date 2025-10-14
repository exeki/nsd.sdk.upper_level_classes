package ru.naumen.core.server.catalog.servicetime;

import ru.naumen.core.server.UUIDIdentifiableBase;
import ru.naumen.core.shared.HasClone;


public abstract class TimePeriod extends UUIDIdentifiableBase implements HasClone {
    private Long startTime;
    private Long endTime;
    private ServiceTimeCatalogItem serviceTime;
    public TimePeriod() {
    }

    public TimePeriod clone() {
        return null;
    }

    public Long getEndTime() {
        return this.endTime;
    }

    public ServiceTimeCatalogItem getServiceTime() {
        return this.serviceTime;
    }

    public Long getStartTime() {
        return this.startTime;
    }

    public TimePeriod setEndTime(Long endTime) {
        return this;
    }

    public void setServiceTime(ServiceTimeCatalogItem serviceTime) {
    }

    public TimePeriod setStartTime(Long startTime) {
        return this;
    }
}
