package ru.naumen.metainfo.server;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import ru.naumen.core.server.cache.ClusterCacheService;
import ru.naumen.core.server.escalation.EscalationSchemeValue;
import ru.naumen.core.shared.IHasMetaInfo;
import ru.naumen.core.shared.personalsettings.Theme;
import ru.naumen.metainfo.shared.AttributeFqn;
import ru.naumen.metainfo.shared.ClassFqn;
import ru.naumen.metainfo.shared.CoreClassFqn;
import ru.naumen.metainfo.shared.IClassFqn;
import ru.naumen.metainfo.shared.ProvidesMetaClasses;
import ru.naumen.metainfo.shared.elements.Attribute;
import ru.naumen.metainfo.shared.elements.Catalog;
import ru.naumen.metainfo.shared.elements.MetaClass;
import ru.naumen.metainfo.shared.elements.MetaclassSortingCriteria;
import ru.naumen.metainfo.shared.elements.Relation;


/**
 * WARNING
 * SOME CLASSES NOT REALISED
 */

public interface MetainfoService extends ProvidesMetaClasses, ClusterCacheService {
    void addEscalationScheme(EscalationSchemeValue paramEscalationSchemeValue);

    void addTheme(Theme paramTheme);

    void addTimerDefinition(Object paramTimerDefinition);

    void addWorkflowProfile(Object paramWfProfile);

    void addWorkflowProfileFolder(Object paramWfProfileFolder);

    void assertMetaClassExists(ClassFqn paramClassFqn);

    void deleteTheme(String paramString);

    boolean equalOrSubClass(ClassFqn paramClassFqn1, ClassFqn paramClassFqn2);

    Object getAdvListProperties();

    Attribute getAttribute(AttributeFqn paramAttributeFqn);

    Catalog getCatalog(String paramString);

    Set<String> getCatalogCodes();

    Collection<Catalog> getCatalogs(Collection<String> paramCollection);

    ClassFqn getClassFqn( Object paramObject);

    boolean hasClassFqn(Object paramObject);

    Collection<MetaClass> getClassTypes(IClassFqn paramIClassFqn);

    List<Object> getDeclaredNullableCustomForms(ClassFqn paramClassFqn, String paramString);

    List<Object> getCustomFormsWithRelatedClasses(ClassFqn paramClassFqn, String... paramVarArgs);

    Object getDeclaredNullableUiForm(ClassFqn paramClassFqn, String paramString);

    String getDropDownSettings();

    String getEntityName(ClassFqn paramClassFqn);

    String getEntityName(IHasMetaInfo paramIHasMetaInfo);

    String getEntityName(MetaClass paramMetaClass);

    Class<?> getEntityJavaClass(ClassFqn paramClassFqn);

    String getEntityJavaClassName(ClassFqn paramClassFqn);

    EscalationSchemeValue getEscalationScheme(String paramString);

    Collection<EscalationSchemeValue> getEscalationSchemes();

    Object getEventCleanerJobSettings();

    String getFullEntityName(ClassFqn paramClassFqn);

    String getFullEntityName(MetaClass paramMetaClass);

    Collection<MetaClass> getHasResponsibleAndWFClasses();

    Collection<MetaClass> getHasResponsibleClasses();

    String getInputmaskExtension();

    Object getInterfaceSettings();

    Class<?> getJavaClass(ClassFqn paramClassFqn);

    String getJavaClassName(ClassFqn paramClassFqn);

    MetaClass getMetaClass(ClassFqn paramClassFqn);

    MetaClass getMetaClass( Object paramObject);

    Collection<ClassFqn> getMetaClassDescendants(CoreClassFqn paramCoreClassFqn, boolean paramBoolean);

    Collection<ClassFqn> getMetaClassDescendantsWithUiOverride(ClassFqn paramClassFqn, String paramString);

    String getMetaClassTitle(ClassFqn paramClassFqn);

    Collection<MetaClass> getMetaClasses();

    List<MetaClass> getMetaClasses( ClassFqn paramClassFqn, List<ClassFqn> paramList);

    List<MetaClass> getMetaClasses(Collection<ClassFqn> paramCollection);

    Collection<ClassFqn> getMetaClassesFqns();

    Collection<ClassFqn> getMetaClassesFqns(ClassFqn paramClassFqn);

    Optional<MetaclassSortingCriteria> getMetaclassSortingCriteria(ClassFqn paramClassFqn);

    Optional<MetaclassSortingCriteria> getMetaclassSortingCriteria(String paramString);

    long getMetainfoVersion();

    Object getMobileSettings();

    Object getNavigationSettings();

    Object getPlannedVersionsSettings();

    Object getNullableUiForm(CoreClassFqn paramCoreClassFqn, String paramString);

    ClassFqn getParentClassFqn(ClassFqn paramClassFqn);

    List<ClassFqn> getParentClassesFqn( ClassFqn paramClassFqn);

    String getProductName();

    Collection<Relation> getRelations();

    Collection<Object> getSimpleSearchMetainfo();

    Object getSimpleSearchMetainfo(ClassFqn paramClassFqn);

    Collection<Object> getSimpleSearchMetainfos(ClassFqn paramClassFqn);

    Theme getTheme(String paramString);

    Collection<Theme> getThemes();

    Object getTimerDefinition(String paramString);

    Collection<Object> getTimerDefinitions();

    Object getUiForm(CoreClassFqn paramCoreClassFqn, String paramString);

    Collection<Object> getUiForms();

    Object getWorkflowProfile(String paramString1,  String paramString2);

    Object getWorkflowProfileFolder(String paramString);

    Collection<Object> getWorkflowProfileFolders();

    boolean isInitialized();

    boolean isMetaclassExists(ClassFqn paramClassFqn);

    Collection<Relation> queryRelations(ClassFqn paramClassFqn1, ClassFqn paramClassFqn2);

    void saveAdvListProperties(Object paramAdvListProperties);

    void saveDropDownSettings(String paramString);

    void saveEventCleanerJobSettings(Object paramEventCleanerJobSettings);

    void saveInterfaceSettings(Object paramInterfaceSettings);

    void saveNavigationSettings(Object paramNavigationSettingsValue);

    void setInputmaskExtension(String paramString);

    void setBasicJavaClassName(ClassFqn paramClassFqn, String paramString);

    void setJavaClassName(ClassFqn paramClassFqn, String paramString);

    void setMobileSettings(Object paramMobileSettings);

    void setPlannedVersionsSettings(Object paramPlannedVersionsSettings);

    void reInitCache(String paramString);
}
