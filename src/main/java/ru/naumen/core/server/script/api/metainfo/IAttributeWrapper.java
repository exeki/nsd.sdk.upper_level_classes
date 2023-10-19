package ru.naumen.core.server.script.api.metainfo;

import java.util.Collection;
import java.util.List;

public interface IAttributeWrapper {
    String getCode();

    IMetaClassWrapper getDeclaredMetaClass();

    <T> T getDefaultValue();

    String getDescription();

    IPresentationWrapper getEditPresentation();

    boolean getHasDefaultValue();

    IMetaClassWrapper getMetaClass();

    Collection<String> getRelatedAttrsToExport();

    String getSearchAlias();

    String getSearchAnalyzer();

    Float getSearchBoost();

    List<ITagWrapper> getTags();

    String getTitle();

    IAttributeTypeWrapper getType();

    IPresentationWrapper getViewPresentation();

    Boolean isComputable();

    Boolean isEditable();

    Boolean isExportNDAP();

    Boolean isExtendedSearchableForLicensed();

    Boolean isExtendedSearchableForNotLicensed();

    Boolean isFilteredByScript();

    boolean isHardcoded();

    boolean isOverrided();

    Boolean isRequired();

    Boolean isRequiredInInterface();

    Boolean isSimpleSearchableForLicensed();

    Boolean isSimpleSearchableForNotLicensed();

    Boolean isSystemEditable();

    Boolean isUnique();

    Boolean isWithDefaultValue();
}
