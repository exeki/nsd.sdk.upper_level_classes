
package ru.naumen.metainfo.shared.elements;


import java.util.Collection;


import ru.naumen.common.shared.Snapshotable;
import ru.naumen.metainfo.shared.AttributeFqn;
import ru.naumen.metainfo.shared.ClassFqn;
import ru.naumen.metainfo.shared.tags.HasTags;

public interface Attribute extends HasCodeAndTitle, HasAttributeType, HasDescription, HasEditable, HasEditableInLists, HasRequired, HasRequiredInInterface, HasSystemRequired, HasExample, HasHardcoded, HasViewPresentation, HasEditPresentation, HasMetaClass, HasGenarationRule, HasDefaultValue, HasAccessor, HasDeclaredMetaClass, HasSystemEditable, HasUnique, HasSystemUnique, HasComputable, HasPermissionChecker, HasSearchable, HasScript, HasFilteredByScript, HasFqn, HasDefaultByScript, HasDeterminable, HasSearchSetting, Snapshotable, HasAttributeStringTemplate, HasComputableOnForm, HasExportNDAP, MayBeHiddenWhenEmpty, HasDateTimeRestriction, HasTags, HasComputeAnyCatalogElementsScript, HasAdvlistSemanticFiltering, HasHideAttrCaption, HasSystemComputable, MayEditOnComplexFormOnly, HasHideArchived, CoreAttribute {

    ClassFqn getDeclaredConcretMetaClass();

    String getDescription();

    Collection<Filter> getFilters();

    Collection<SystemFilter> getSystemFilters();

    AttributeFqn getFqn();

    AttributeFqn getHierarchicalFqn();

    String getPropertyFqn();

    boolean isOverrided();
}
