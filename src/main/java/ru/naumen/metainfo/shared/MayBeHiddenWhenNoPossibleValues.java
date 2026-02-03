package ru.naumen.metainfo.shared;

import ru.naumen.common.shared.Snapshotable;

public interface MayBeHiddenWhenNoPossibleValues extends Snapshotable {
    Boolean isHiddenWhenNoPossibleValues();

    void setHiddenWhenNoPossibleValues(Boolean isHiddenWhenNoPossibleValues);
}
