package ru.naumen.core.shared.dto;

import ru.naumen.common.shared.utils.ISProperties;
import ru.naumen.core.shared.*;
import ru.naumen.metainfo.shared.IClassFqn;

import javax.annotation.CheckForNull;
import java.util.Map;

public interface ISDtObject extends IUUIDIdentifiable, ISTitled, ISProperties, Map<String, Object>, HasAttrPermissions, ISHasMetainfo, HasPermissionMetaData {
    IClassFqn getMetainfo();

    @CheckForNull
    Boolean hasAuthAttrPermission(String var1, boolean var2);

    @CheckForNull
    Boolean hasPermission(String var1);
}
