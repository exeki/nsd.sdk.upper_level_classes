package ru.naumen.core.server.script.api;

import ru.naumen.core.server.script.ScriptApi;
import ru.naumen.core.shared.IUUIDIdentifiable;

import java.util.List;
import java.util.Map;

public interface IAdvimportApi extends ScriptApi {
    void showStatusBar(boolean var1);

    void start(String var1, Map<String, Object> var2);

    String stop(String var1);

    List<String> stopAll();

    List<String> getActiveImports();

    Map<String, Object> getImportInfo(String var1);

    void importByXmlConfiguration(String var1, IUUIDIdentifiable var2, Map<String, Object> var3);

    void importByXmlConfiguration(String var1, IUUIDIdentifiable var2, Map<String, Object> var3, String var4);

    void importByXmlConfiguration(IUUIDIdentifiable var1, IUUIDIdentifiable var2, Map<String, Object> var3);

    void importByXmlConfiguration(IUUIDIdentifiable var1, IUUIDIdentifiable var2, Map<String, Object> var3, String var4);

    void importByXmlConfiguration(String var1, IUUIDIdentifiable var2, String var3, Map<String, Object> var4);

    void importByXmlConfiguration(String var1, IUUIDIdentifiable var2, String var3, Map<String, Object> var4, String var5);

    void importByXmlConfiguration(IUUIDIdentifiable var1, IUUIDIdentifiable var2, String var3, Map<String, Object> var4);

    void importByXmlConfiguration(IUUIDIdentifiable var1, IUUIDIdentifiable var2, String var3, Map<String, Object> var4, String var5);

    IRunImportMessageConfiguration createConfig();
}
