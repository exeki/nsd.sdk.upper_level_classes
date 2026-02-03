package ru.naumen.metainfo.shared.elements;

import ru.naumen.common.shared.Snapshotable;

public interface HasComputable extends CoreHasComputable, Snapshotable {
    Boolean isComputable();
}
