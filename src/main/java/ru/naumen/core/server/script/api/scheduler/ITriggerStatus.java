package ru.naumen.core.server.script.api.scheduler;

public interface ITriggerStatus {
    String getFinalFireTime();

    String getGroupName();

    String getJobName();

    String getNextFireTime();

    String getPreviousFireTime();

    String getTriggerName();

    boolean isRunning();
}
