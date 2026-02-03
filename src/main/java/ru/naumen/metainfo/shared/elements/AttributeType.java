package ru.naumen.metainfo.shared.elements;


import java.util.Set;

import ru.naumen.common.shared.Snapshotable;
import ru.naumen.common.shared.utils.IProperties;
import ru.naumen.core.shared.HasCode;
import ru.naumen.metainfo.shared.ClassFqn;


public interface AttributeType extends IProperties, HasCode, Snapshotable, RelatedObjectAttribute, HasComplexRelation, HasComplexAttrGroup, HasComplexStructuredObjectsView, HasAggrComplexAttrGroups, HasQuickForms, CoreAttributeType {

    <T extends AttributeType> T cast();

    Attribute getAttribute();

    Set<ClassFqn> getPermittedTypes();
}
