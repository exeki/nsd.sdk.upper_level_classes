package ru.naumen.core.server.script.api;

import ru.naumen.core.shared.IUUIDIdentifiable;

import java.util.Map;

public interface IRunImportMessageConfiguration {
    IRunImportMessageConfiguration setFileXmlConfiguration(Object var1);

    IRunImportMessageConfiguration setObjectForLogAttachUuid(IUUIDIdentifiable var1);

    IRunImportMessageConfiguration setAttribute(String var1);

    IRunImportMessageConfiguration setCustomUuid(String var1);

    IRunImportMessageConfiguration setParameters(Map<String, Object> var1);

    void run();
}
