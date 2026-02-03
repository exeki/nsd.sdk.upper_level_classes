package ru.naumen.core.server.script.api;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import ru.naumen.core.server.script.api.metainfo.IAttributeTypeWrapper;
import ru.naumen.core.server.script.api.metainfo.IMetaClassWrapper;
import ru.naumen.core.server.script.api.metainfo.IServiceCallParameters;
import ru.naumen.core.server.script.spi.IScriptDtObject;
import ru.naumen.metainfo.server.MetainfoService;
import ru.naumen.metainfo.shared.IClassFqn;


abstract public class MetainfoApi implements IMetainfoApi {
    MetainfoService metainfoService;

    abstract public void addAttrGroup(String fqn, String code, String title, List<String> attrCodes);

    abstract public void addCase(String code, String parentFqn, String title, String desc);

    abstract public void addCase(String code, String parentFqn, String title, String desc, Map<String, String> metaClassProps);

    abstract public void addClass(String code, String title, String desc);

    abstract public void addClass(String code, String title, String desc, String parentRelFqn, boolean hasLifecycle, boolean hasResponsibility);

    abstract public String analyzeScripts();

    abstract public boolean areScriptsValid();

    abstract public String checkAttributeExisting(Object object, String attributeCode);

    abstract public String checkAttrsExisting(Object object, List<String> attributeCodes);

    abstract public String checkAttributeType(Object object, String attributeCode, List<String> possibleTypes);

    abstract public String checkAttrsType(Object object, Map<String, List<String>> possibleTypes);

    abstract public boolean checkTagEnabled(String tagCode);

    abstract public boolean checkRestrictions(IScriptDtObject object, boolean skipRequired, boolean skipUnique);

    abstract public boolean compareTargetClassForObjectAttrTypes(IAttributeTypeWrapper attributeType1, IAttributeTypeWrapper attributeType2);

    abstract public boolean compileAll();

    abstract public String clearCache(String cacheRegion);

    abstract public void recompileAllModules();

    abstract public void copyToRepository(String uri, String username, String password, String branch, String commitHash);

    abstract public void editStateSetting(String fqn, String stateCode, String attrCode, boolean canView, boolean canEdit, int preFill, int postFill);

    abstract public void exportToRemote(String branch, String commitMessage, String exportMode);

    abstract public void exportToRemote(String branch, String commitMessage);

    abstract public void exportToRemote(String branch);

    abstract public String fixEmptyFieldsInSearchSettings();

    abstract public IServiceCallParameters getServiceCallParameters();

    abstract public IClassFqn getDefaultServiceCallCase(String uuid);

    abstract public IMetaClassWrapper getMetaClass(Object fqn);

    abstract public String getMetaClassTitle(Object fqn);

    abstract public String getMetaClassTitle(Object fqn, String locale);

    abstract public IClassFqn getParentFqn(Object fqn);

    abstract public String getStateTitle(IScriptDtObject obj);

    abstract public String getStateTitle(IScriptDtObject obj, String lang);

    abstract public String getStateTitle(Object fqn, String stateCode);

    abstract public String getStateTitle(Object fqn, String stateCode, String lang);

    abstract public String getSystemName();

    abstract public Collection<IMetaClassWrapper> getTypes(IClassFqn fqn);

    abstract public Collection<IMetaClassWrapper> getTypes(String fqn);

    abstract public void importFromRemote(String branch);

    abstract public void importFromRemote(String branch, boolean isFullReload);

    abstract public IMetaClassWrapper metaClass(Object fqn);

    abstract public boolean metaClassExists(Object fqn);

    abstract public void resetExternalTitleTables();

    abstract public void resetFullExternalTitleTables();

    abstract public void setSystemName(String systemName);

    abstract public void useNotificationLocalized(boolean value);

    abstract public void setDefaultServiceCallParams(Object targetFqn, Object scFqn, Object agreement, Object service);
}
