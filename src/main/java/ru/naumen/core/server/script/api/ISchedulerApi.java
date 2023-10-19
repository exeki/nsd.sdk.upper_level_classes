package ru.naumen.core.server.script.api;

import ru.naumen.common.shared.utils.IDateTimeInterval;
import ru.naumen.core.server.script.ScriptApi;
import ru.naumen.core.server.script.api.scheduler.ISchedulerTaskWrapper;
import ru.naumen.core.server.script.api.scheduler.ITriggerInfo;
import ru.naumen.core.server.script.api.scheduler.ITriggerStatus;
import ru.naumen.core.server.script.api.scheduler.ITriggerWrapper;

import java.util.Date;
import java.util.List;

public interface ISchedulerApi extends ScriptApi {
    void disableTrigger(String var1);

    void enableTrigger(String var1);

    List<ITriggerStatus> getFullStatus();

    ITriggerStatus getFullStatus(String var1, String var2);

    List<ISchedulerTaskWrapper> getStatus();

    ISchedulerTaskWrapper getStatus(String var1);

    ITriggerWrapper getStatus(String var1, String var2);

    List<ITriggerInfo> getTriggersInfo(String var1, boolean var2);

    void interruptJob(String var1);

    void interruptJob(String var1, String var2);

    void recover();

    void resume();

    void run(String var1);

    void setTriggerDate(String var1, String var2, Date var3);

    void setTriggerInterval(String var1, String var2, IDateTimeInterval var3, String var4, Date var5);

    void setTriggerPeriod(String var1, String var2, String var3, String var4, Date var5);

    void suspend(boolean var1);

    void deleteTask(String var1);
}
