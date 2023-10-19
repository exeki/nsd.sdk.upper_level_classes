package ru.naumen.core.shared;

import javax.annotation.Nullable;
import java.util.Set;

public interface HasPermissionMetaData {
    @Nullable
    <R> R getPermissionMetaData(String var1);

    Set<String> permissionMetaDataKeys();
}
