package ru.naumen.core.server.script.api.servicetime;

import java.util.Date;

public interface IServiceTimeExclusion {
    Long getEndTime();

    Date getExclusionDate();

    Long getId();

    Long getStartTime();

    String getUuid();
}
