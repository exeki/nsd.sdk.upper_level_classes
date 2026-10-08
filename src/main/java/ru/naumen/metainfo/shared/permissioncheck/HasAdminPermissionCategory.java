package ru.naumen.metainfo.shared.permissioncheck;

import com.google.gwt.user.client.rpc.IsSerializable;
import java.io.Serializable;
import ru.naumen.common.shared.Snapshotable;

public interface HasAdminPermissionCategory extends IsSerializable, Serializable, Snapshotable {
    String getAdminPermissionCategory();
}
