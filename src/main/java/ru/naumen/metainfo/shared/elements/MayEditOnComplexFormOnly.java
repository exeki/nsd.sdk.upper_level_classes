package ru.naumen.metainfo.shared.elements;

import ru.naumen.common.shared.Snapshotable;

public interface MayEditOnComplexFormOnly extends Snapshotable {
    Boolean isEditOnComplexFormOnly();

    void setEditOnComplexFormOnly(Boolean editOnComplexFormOnly);
}
