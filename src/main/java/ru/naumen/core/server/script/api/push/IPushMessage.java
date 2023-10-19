package ru.naumen.core.server.script.api.push;

import java.util.Map;

public interface IPushMessage {
    String getText();

    IPushMessage setLink(String var1);

    IPushMessage setSubject(String var1);

    IPushMessage setUseHtml(boolean var1);

    IPushMessage showBrowser();

    IPushMessage showInterfaceAlways();

    IPushMessage showInterfaceAndBrowser();

    IPushMessage showInterfaceOnly();

    IPushMessage showSubject();

    IPushMessage showSystemName();

    IPushMessage showSystemNameAndSubject();

    IPushMessage useTemplate(String var1);

    IPushMessage useTemplate(String var1, Map<String, Object> var2);
}
