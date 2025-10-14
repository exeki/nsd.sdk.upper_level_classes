package ru.naumen.core.server.catalog.servicetime;

public class ServiceTimePeriod extends TimePeriod {
    public static final String CLASS_ID = "srvTimePeriod";
    private int dayOfWeek;

    public ServiceTimePeriod() {
    }

    public static String getUUIDPrefix() {
        return "1";
    }

    public TimePeriod clone() {
       return null;
    }

    public int getDayOfLocalWeek() {
        return 1;
    }

    public int getDayOfWeek() {
        return this.dayOfWeek;
    }

    public String getPrefixLoaderUUIDPrefix() {
        return "1";
    }

    public ServiceTimePeriod setDayOfWeek(Integer dayOfWeek) {
        return this;
    }
}
