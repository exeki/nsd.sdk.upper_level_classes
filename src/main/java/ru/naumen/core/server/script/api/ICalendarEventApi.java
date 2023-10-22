package ru.naumen.core.server.script.api;

import java.util.Date;
import javax.annotation.Nullable;
import ru.naumen.core.server.script.ScriptApi;
import ru.naumen.core.shared.dto.ISDtObject;

public interface ICalendarEventApi extends ScriptApi {
    ICalendarEvent create(String var1, Date var2);

    ICalendarEvent create(String var1, Date var2, @Nullable String var3);

    ICalendarEvent create(String var1, Date var2, @Nullable ISDtObject var3);

    public static interface ICalendarEvent {
        ICalendarEvent setEndDateTime(Date var1);

        ICalendarEvent setDescription(String var1);

        ICalendarEvent setRecurRule(String var1, int var2);

        ICalendarEvent setRecurRule(String var1, Date var2);

        ICalendarEvent setOrganizerName(String var1);

        ICalendarEvent setOrganizerEmail(String var1);

        ICalendarEvent setUID(String var1);

        ICalendarEvent setMethod(String var1);

        String getMethod();

        String getUID();

        String getContentAsString();
    }
}
