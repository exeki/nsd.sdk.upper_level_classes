package ru.naumen.core.server.script.api.metainfo;

public interface ITimerDefinitionWrapper {
    String getCode();

    String getDescription();

    String getResolutionTimeAttribute();

    String getServiceTimeAttribute();

    String getTimeMetric();

    String getTimeZoneAttribute();

    String getTitle();

    boolean isRemoved();

    boolean isSystem();
}
