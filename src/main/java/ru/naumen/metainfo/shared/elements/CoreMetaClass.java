
package ru.naumen.metainfo.shared.elements;

import java.util.Collection;
import ru.naumen.metainfo.shared.CoreClassFqn;
import ru.naumen.metainfo.shared.CoreHasCode;
import ru.naumen.metainfo.shared.CoreTitled;
import ru.naumen.metainfo.shared.elements.workflow.CoreWorkflow;

import javax.management.relation.Relation;

public interface CoreMetaClass extends CoreHasFqn, CoreHasCode, CoreTitled {
    CoreClassFqn getFqn();

    CoreAttributeGroup getAttributeGroup(String code);

    CoreAttribute getAttribute(String code);

    boolean hasAttribute(String code);

    CoreWorkflow getWorkflow();

    Collection<Relation> getOutgoingRelation();
}
