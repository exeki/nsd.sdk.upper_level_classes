package ru.naumen.core.server.script.api;

import ru.naumen.core.server.script.api.accesskeys.IAccessKeyWrapper;
import ru.naumen.core.shared.IUUIDIdentifiable;

import javax.annotation.Nullable;
import java.util.Map;

public interface IEditLinkDefinition {
    @Nullable
    String getMobileFormCode();

    @Nullable
    IAccessKeyWrapper getAccessKey();

    @Nullable
    String getLogin();

    @Nullable
    String getUser();

    @Nullable
    Map<String, Object> getAttributes();

    IEditLinkDefinition mobileForm(@Nullable String var1);

    IEditLinkDefinition accessKey(@Nullable IAccessKeyWrapper var1);

    IEditLinkDefinition login(@Nullable String var1);

    IEditLinkDefinition user(@Nullable String var1);

    IEditLinkDefinition user(@Nullable IUUIDIdentifiable var1);

    IEditLinkDefinition attributes(@Nullable Map<String, Object> var1);
}
