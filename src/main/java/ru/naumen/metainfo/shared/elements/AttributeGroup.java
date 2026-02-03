package ru.naumen.metainfo.shared.elements;

import java.util.List;
import ru.naumen.common.shared.Snapshotable;

public interface AttributeGroup extends HasCodeAndTitle, HasAttributes, HasMetaClass, HasHardcoded, HasDeclaredMetaClass, Snapshotable, CoreAttributeGroup {
    List<String> getAttributeCodes();
}
