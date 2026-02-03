package ru.naumen.metainfo.shared.elements;

import java.util.List;
import ru.naumen.common.shared.Snapshotable;
import ru.naumen.metainfo.shared.AttributeFqn;
import ru.naumen.metainfo.shared.ClassFqn;

public interface RelatedObjectAttribute extends Snapshotable {
    List<AttributeFqn> getAttrChain();

    String getRelatedObjectAttribute();

    int getRelatedObjectHierarchyLevel();

    ClassFqn getRelatedObjectMetaClass();

    boolean isAttributeOfRelatedObject();

    boolean isSingleObjectLink();

    void setAttrChain(List<AttributeFqn> attrChain);

    void setRelatedObjectAttribute(String relatedObjectAttribute);

    void setRelatedObjectHierarchyLevel(int level);

    void setRelatedObjectMetaClass(ClassFqn fqn);

    void setSingleObjectLink(boolean isSingleObjectLink);
}
