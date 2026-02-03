package ru.naumen.metainfo.shared.elements;

import com.google.common.base.Function;

import java.util.Collection;
import java.util.List;
import java.util.Set;

import ru.naumen.common.shared.utils.IProperties;
import ru.naumen.core.shared.IUUIDIdentifiable;
import ru.naumen.metainfo.shared.AttributeFqn;
import ru.naumen.metainfo.shared.ClassFqn;
import ru.naumen.metainfo.shared.elements.wf.Workflow;
import ru.naumen.metainfo.shared.tags.HasTags;

import javax.management.relation.Relation;


public interface MetaClass extends MetaClassLite, HasAttributes, HasTags, CoreMetaClass {

    public static final Function<MetaClass, Workflow> WORKFLOW_EXTRACTOR = MetaClass::getWorkflow;

    boolean canCopy();

    Collection<SearchSetting> getAllSearchSettings();

    Collection<String> getAttributeCodes();

    Set<AttributeFqn> getAttributeFqns();

    AttributeGroup getAttributeGroup(String paramString);

    Collection<String> getAttributeGroupCodes();

    Collection<AttributeGroup> getAttributeGroups();

    List<Attribute> getAttributes();

    Collection<Relation> getEditAttrRelations();

    List<Attribute> getGroupAttributes(String paramString);

    Collection<Relation> getIncomingRelations();

    Collection<Relation> getOutgoingRelation();

    IProperties getProperties();

    Collection<ResponsibilityTransferItem> getResponsibilityTransferTable();

    SearchSetting getSearchSetting(String paramString);

    Collection<SearchSetting> getSearchSettings();

    MetaclassSortingCriteria getSortingCriteria();

    String getTabTitleAttribute();

    Workflow getWorkflow();

    boolean hasAttribute(String paramString);

    boolean hasResponsibilityTransfer(IUUIDIdentifiable paramIUUIDIdentifiable1, IUUIDIdentifiable paramIUUIDIdentifiable2);

    boolean isChildForClassFqn(ClassFqn paramClassFqn);

    boolean isParentForClassFqn(ClassFqn paramClassFqn);

    boolean isResponsibilityTransferTableEnabled();

    boolean isSystemCase();

    boolean isTabTitleAttributeOverridden();
}


