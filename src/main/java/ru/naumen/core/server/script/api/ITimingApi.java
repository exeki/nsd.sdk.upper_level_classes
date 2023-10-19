package ru.naumen.core.server.script.api;

import ru.naumen.core.server.script.ScriptApi;
import ru.naumen.core.server.script.api.metainfo.ITimerDefinitionWrapper;
import ru.naumen.core.server.script.spi.IScriptDtObject;
import ru.naumen.core.shared.IUUIDIdentifiable;
import ru.naumen.metainfo.shared.IClassFqn;

import javax.annotation.Nullable;
import java.util.Date;

public interface ITimingApi extends ScriptApi {
    @Nullable
    Date addWorkingDays(@Nullable Date var1, int var2, IUUIDIdentifiable var3, @Nullable IUUIDIdentifiable var4);

    @Nullable
    Date addWorkingHours(@Nullable Date var1, int var2, IUUIDIdentifiable var3, @Nullable IUUIDIdentifiable var4);

    @Nullable
    Date getEndOfWorkingDay(@Nullable Date var1, IUUIDIdentifiable var2, @Nullable IUUIDIdentifiable var3);

    @Nullable
    Date getEndOfWorkingMonth(@Nullable Date var1, IUUIDIdentifiable var2, @Nullable IUUIDIdentifiable var3);

    @Nullable
    Date getEndOfWorkingYear(@Nullable Date var1, IUUIDIdentifiable var2, @Nullable IUUIDIdentifiable var3);

    @Nullable
    Date getStartOfWorkingDay(@Nullable Date var1, IUUIDIdentifiable var2, @Nullable IUUIDIdentifiable var3);

    @Nullable
    Date getStartOfWorkingMonth(@Nullable Date var1, IUUIDIdentifiable var2, @Nullable IUUIDIdentifiable var3);

    @Nullable
    Date getStartOfWorkingYear(@Nullable Date var1, IUUIDIdentifiable var2, @Nullable IUUIDIdentifiable var3);

    Date parseDate(String var1);

    void resetTimer(Object var1, String var2);

    void resetTimer(Object var1, String var2, boolean var3);

    void resetTimer(Object var1, String var2, boolean var3, boolean var4);

    Date serviceEndTime(IScriptDtObject var1, IScriptDtObject var2, Date var3, long var4);

    Date serviceEndTime(String var1, String var2, Date var3, long var4);

    Date serviceStartTime(Date var1, IUUIDIdentifiable var2, IUUIDIdentifiable var3);

    Date serviceStartTime(IUUIDIdentifiable var1, IUUIDIdentifiable var2);

    long serviceTime(IUUIDIdentifiable var1, IUUIDIdentifiable var2, Date var3, Date var4);

    long serviceTime(String var1, String var2, Date var3, Date var4);

    void setBackTimer(Object var1, String var2, Date var3, Date var4, String var5, String var6, String var7);

    void setBackTimer(Object var1, String var2, Date var3, long var4, String var6, String var7, String var8);

    ITimerDefinitionWrapper timerDefinition(IClassFqn var1, String var2);
}
