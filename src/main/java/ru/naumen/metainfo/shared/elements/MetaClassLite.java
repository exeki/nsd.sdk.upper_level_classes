package ru.naumen.metainfo.shared.elements;

import java.io.Serializable;
import java.util.Collection;
import java.util.Set;

import com.google.gwt.user.client.rpc.IsSerializable;
import ru.naumen.common.shared.Snapshotable;
import ru.naumen.metainfo.shared.AttributeFqn;
import ru.naumen.metainfo.shared.ClassFqn;
import ru.naumen.metainfo.shared.elements.wf.WorkflowLite;

public interface MetaClassLite extends HasCodeAndTitle, HasDescription, HasHardcoded, HasFqn, HasHidden, MayHasPlannedVersion, Snapshotable, Serializable {
    Set<AttributeFqn> getAttributeFqns();

    Collection<ClassFqn> getChildren();

    String getDescription();

    ClassFqn getFqn();

    Integer getMaxSearchResults();

    ClassFqn getParent();

    ClassFqn getParentVisible();

    Integer getSearchOrder();

    Status getStatus();

    WorkflowLite getWorkflowLite();

    boolean hasAttribute(AttributeFqn code);

    boolean isAbstract();

    boolean isCatalogItem();

    boolean isFolder();

    boolean isForbidUserClasses();

    boolean isHasCases();

    boolean isHasFolders();

    boolean isHasParentRelation();

    boolean isHasResponsible();

    boolean isHasUserClasses();

    boolean isHasWorkflow();

    boolean isSingleton();

    boolean isHasSecDomain();

    public static enum Status implements IsSerializable {
        DEFAULT,
        REMOVED;

        private Status() {
        }
    }
}
