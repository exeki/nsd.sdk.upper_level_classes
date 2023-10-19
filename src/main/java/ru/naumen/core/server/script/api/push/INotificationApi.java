package ru.naumen.core.server.script.api.push;

import ru.naumen.core.server.script.ScriptApi;

import java.util.Collection;

public interface INotificationApi extends ScriptApi {
    void archivePushMessages(String var1, Object var2);

    IPushMessage createPushMessage(String var1);

    boolean sendMobilePush(IPushMessage var1, Object var2);

    boolean sendMobilePush(String var1, Object var2);

    boolean sendWebPush(IPushMessage var1, Object var2);

    boolean sendWebPush(String var1, Object var2);

    void markEventsAsRead(Collection<String> var1);
}
