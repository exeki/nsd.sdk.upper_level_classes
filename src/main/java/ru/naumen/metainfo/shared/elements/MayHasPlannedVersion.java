package ru.naumen.metainfo.shared.elements;

import ru.naumen.common.shared.Snapshotable;

public interface MayHasPlannedVersion extends Snapshotable {
    Boolean isPlanVersionsAllowed();

    Integer getDepthEnv();
}
