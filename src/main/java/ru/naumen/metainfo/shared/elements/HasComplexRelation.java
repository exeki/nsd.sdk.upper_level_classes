package ru.naumen.metainfo.shared.elements;

import ru.naumen.common.shared.Snapshotable;

public interface HasComplexRelation extends Snapshotable {
    String getComplexRelationType();

    void setComplexRelationType(String complexRelationType);

    Boolean isComplexRelation();

    void setComplexRelation(Boolean isComplexRelation);
}
