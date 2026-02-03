
package ru.naumen.metainfo.shared.elements;

import java.util.Map;
import ru.naumen.common.shared.Snapshotable;
import ru.naumen.metainfo.shared.ClassFqn;

public interface HasAggrComplexAttrGroups extends Snapshotable {
    Map<ClassFqn, String> getComplexRelationAttrGroups();

    void setComplexRelationAttrGroups(Map<ClassFqn, String> groups);
}
