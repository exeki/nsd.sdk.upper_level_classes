package ru.naumen.core.server.script.api.scheduler;

import java.util.Date;

public interface ISchedulerTaskWrapper {
    String getCode();

    String getDescription();

    Date getLastExecutionDate();

    Date getPlanDate();

    String getTitle();

    Iterable<ITriggerWrapper> getTrigger();

    ITriggerWrapper getTrigger(String var1);

    String getType();

    String prettyPrint();
}
