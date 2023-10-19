package ru.naumen.core.server.script.api;

import ru.naumen.core.server.script.ScriptApi;

import javax.annotation.Nullable;
import java.util.Map;

public interface IHttpClientApi extends ScriptApi {
    Map<String, Object> getJSON(String var1);

    Map<String, Object> getJSON(String var1, Map<String, String> var2);

    Object getSessionAttribute(String var1);

    boolean hasHttpSession();

    Map<String, Object> postJSON(String var1, @Nullable Map<String, Object> var2);

    Map<String, Object> postJSON(String var1, @Nullable Map<String, Object> var2, @Nullable Map<String, String> var3);

    Map<String, Object> patchJSON(String var1, @Nullable Map<String, Object> var2, @Nullable Map<String, String> var3);

    Map<String, Object> deleteJSON(String var1, Map<String, String> var2);

    Map<String, Object> putJSON(String var1, Map<String, Object> var2, Map<String, String> var3);

    void removeSessionAttribute(String var1);

    void setSessionAttribute(String var1, Object var2);

    Object createHttpBuilderClient(String var1);
}
