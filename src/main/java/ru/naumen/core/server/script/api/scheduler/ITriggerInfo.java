package ru.naumen.core.server.script.api.scheduler;

import java.util.Date;

public interface ITriggerInfo {
    Date getDate();

    String getPeriod();

    String getTriggerName();

    boolean isEnabled();
}
