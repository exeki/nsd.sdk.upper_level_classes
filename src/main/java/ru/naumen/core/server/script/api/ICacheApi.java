package ru.naumen.core.server.script.api;

import ru.naumen.core.server.script.ScriptApi;

import javax.annotation.Nullable;
import java.util.Collection;
import java.util.Map;

public interface ICacheApi extends ScriptApi {
    Map<Object, Object> create(String var1);

    Map<Object, Object> create(String var1, int var2);

    Map<Object, Object> create(String var1, int var2, int var3);

    boolean isRemoteCacheConnected();

    void remotePut(Object var1, Object var2, String var3);

    @Nullable
    Object remoteGet(Object var1, String var2);

    void remoteClear(String var1);

    Collection<String> getRemoteCacheAddresses();

    void addRemoteCacheAddresses(String... var1);

    void removeRemoteCacheAddresses(String... var1);

    boolean connectRemoteCache();

    boolean disconnectRemoteCache();

    boolean reconnectRemoteCache();
}
