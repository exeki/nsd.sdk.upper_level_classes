package ru.naumen.core.server.catalog.servicetime;

import java.util.ArrayList;
import java.util.List;

import ru.naumen.core.server.catalog.CatalogItem;

import ru.naumen.metainfo.shared.ClassFqn;

public class ServiceTimeCatalogItem extends CatalogItem<ServiceTimeCatalogItem> {
    public static final String CLASS_ID = "servicetime";
    public static final String FILTER_NOT_PERSONAL_SERVICE_TIME = "filterNotPersonalServiceTime";
    private String description;
    private String status;
    private List<ServiceTimePeriod> periods;
    private List<ServiceTimeExclusion> exclusions;
    private ServiceTimeCatalogItem activeCopy;
    private Object employee;

    public ServiceTimeCatalogItem() {
    }

    public static String getUUIDPrefix() {
        return "1";
    }

    public ServiceTimeCatalogItem clone() {
        return this;
    }

    public ServiceTimeCatalogItem getActiveCopy() {
        return this.activeCopy;
    }

    public String getDescription() {
        return this.description;
    }

    public List<ServiceTimeExclusion> getExclusions() {
        if (null == this.exclusions) {
            this.exclusions = new ArrayList();
        }

        return this.exclusions;
    }

    public ClassFqn getMetaClass() {
        return null;
    }

    public List<ServiceTimePeriod> getPeriods() {
        return null;
    }

    public String getPrefixLoaderUUIDPrefix() {
        return "1";
    }

    public String getStatus() {
        return this.status;
    }

    public Object getEmployee() {
        return this.employee;
    }

    public void setActiveCopy(ServiceTimeCatalogItem activeCopy) {
        this.activeCopy = activeCopy;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setExclusions(List<ServiceTimeExclusion> exclusions) {

    }

    public void setPeriods(List<ServiceTimePeriod> periods) {
    }

    public void setStatus(String state) {

    }

    public void setEmployee(Object employee) {

    }
}
