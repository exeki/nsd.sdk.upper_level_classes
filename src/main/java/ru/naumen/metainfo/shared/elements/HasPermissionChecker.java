package ru.naumen.metainfo.shared.elements;

import ru.naumen.common.shared.Snapshotable;

public interface HasPermissionChecker extends Snapshotable {
    String getPermissionChecker();
}
