package ru.naumen.core.server.script.api.scheduler;

import java.util.Date;

public interface ITriggerWrapper {
    String getCode();

    Date getLastExecutionDate();

    Date getPlanExecutionDate();

    String getSchTaskCode();

    String getTitle();

    String getType();

    boolean isEnabled();

    String prettyPrint();
}
