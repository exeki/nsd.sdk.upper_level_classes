package ru.naumen.core.server.script.api;

import ru.naumen.core.server.script.ScriptApi;
import ru.naumen.core.server.script.api.metainfo.IPersonalSettingsWrapper;
import ru.naumen.core.shared.dto.ISDtObject;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public interface IEmployeeApi extends ScriptApi {
    void disableEmulatedStack(String var1);

    void enableEmulatedStack(String var1);

    Map<String, List<String>> getNotUniqueLoginEmployees();

    IPersonalSettingsWrapper getPersonalSettings(String var1);

    ISDtObject getTimeZone(String var1);

    void setFullHomePage(Object var1, String var2, String var3);

    void setHomePage(Object var1, String var2);

    void setHomePageInterface(Object var1, String var2);

    void setLocale(Object var1, String var2);

    void setTheme(Object var1, String var2);

    void setTheme(Object var1, String var2, String var3);

    void setTimeZone(Object var1, String var2);

    String setTimeZoneAccordingToLocation(Object var1, String var2, String var3);

    String setTimeZoneEntireOu(Object var1, String var2);

    Collection<ISDtObject> getActiveEmployees();

    Set<String> getActiveEmployeesUUIDs();

    Map<String, Integer> getLicensesUsage();
}
