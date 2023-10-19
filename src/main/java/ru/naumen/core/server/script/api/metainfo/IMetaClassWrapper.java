package ru.naumen.core.server.script.api.metainfo;

import ru.naumen.metainfo.shared.IClassFqn;

import java.util.Collection;
import java.util.List;

public interface IMetaClassWrapper {
    IAttributeWrapper getAttribute(String var1);

    Collection<String> getAttributeCodes();

    IAttributeGroupWrapper getAttributeGroup(String var1);

    Collection<String> getAttributeGroupCodes();

    Collection<IAttributeGroupWrapper> getAttributeGroups();

    Collection<IAttributeWrapper> getAttributes();

    Collection<IMetaClassWrapper> getChildren();

    String getCode();

    String getDescription();

    IClassFqn getFqn();

    String getFqnCase();

    Collection<IRelationWrapper> getIncomingRelations();

    Collection<IRelationWrapper> getOutgoingRelation();

    IMetaClassWrapper getParent();

    Object getProperty(String var1);

    List<ITagWrapper> getTags();

    String getTitle();

    IWorkflowWrapper getWorkflow();

    boolean hasAttribute(String var1);

    boolean isAbstract();

    boolean isHardcoded();

    boolean isHasCases();

    boolean isHasResponsible();

    boolean isHasWorkflow();

    boolean isSingleton();
}
