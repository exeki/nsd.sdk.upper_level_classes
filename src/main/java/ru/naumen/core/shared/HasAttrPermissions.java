package ru.naumen.core.shared;

import javax.annotation.CheckForNull;

public interface HasAttrPermissions {
    @CheckForNull
    Boolean hasReadPermission(String var1);

    @CheckForNull
    Boolean hasWritePermission(String var1);
}
