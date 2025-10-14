package ru.naumen.core.server.catalog.servicetime;

import java.util.Date;

public class ServiceTimeExclusion extends TimePeriod {
    public static final String CLASS_ID = "srvTimeExcl";
    private Date exclusionDate;
    public ServiceTimeExclusion() {
    }

    public static String getUUIDPrefix() {
        return "srvTimeExcl";
    }

    public ServiceTimeExclusion clone() {
        return null;
    }

    public Date getExclusionDate() {
        return this.exclusionDate;
    }

    public String getPrefixLoaderUUIDPrefix() {
        return "";
    }

    public ServiceTimeExclusion setExclusionDate(Date exclusionDate) {
        return this;
    }

    public String toString() {
        return "";
    }
}
