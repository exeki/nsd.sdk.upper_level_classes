package ru.naumen.core.server.script.api;

import ru.naumen.core.server.script.ScriptApi;
import ru.naumen.core.server.script.spi.IScriptDtObject;

public interface IServiceTimeApi extends ScriptApi, IDocumentedServiceTimeApi {
    IScriptDtObject createPersonalServiceTime(String code, Object serviceTime, Object employee, boolean copyExclusionsAndPeriods);

    IScriptDtObject createPersonalServiceTime(Object serviceTime, Object employee, boolean copyExclusionsAndPeriods);

    IScriptDtObject getPersonalServiceTime(Object employee);

    boolean deletePersonalServiceTime(Object employee);
}
