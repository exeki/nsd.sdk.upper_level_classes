package ru.naumen.metainfo.shared.elements;

import ru.naumen.common.shared.Snapshotable;

public interface HasComplexAttrGroup extends Snapshotable {
    String getComplexAttrGroupCode();

    void setComplexAttrGroupCode(String complexAttrGroupCode);
}
