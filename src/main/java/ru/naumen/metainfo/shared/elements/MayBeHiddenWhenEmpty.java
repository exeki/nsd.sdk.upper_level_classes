package ru.naumen.metainfo.shared.elements;

import ru.naumen.common.shared.Snapshotable;

public interface MayBeHiddenWhenEmpty extends Snapshotable {
    Boolean isHiddenWhenEmpty();

    void setHiddenWhenEmpty(Boolean isHiddenWhenEmpty);
}
