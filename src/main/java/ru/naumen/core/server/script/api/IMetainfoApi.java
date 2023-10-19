package ru.naumen.core.server.script.api;

import ru.naumen.core.server.script.ScriptApi;
import ru.naumen.core.server.script.api.metainfo.IAttributeTypeWrapper;
import ru.naumen.core.server.script.api.metainfo.IMetaClassWrapper;
import ru.naumen.core.server.script.api.metainfo.IServiceCallParameters;
import ru.naumen.core.server.script.spi.IScriptDtObject;
import ru.naumen.metainfo.shared.IClassFqn;

import javax.annotation.CheckForNull;
import javax.annotation.Nullable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public interface IMetainfoApi extends ScriptApi {
    void addAttrGroup(String var1, String var2, String var3, List<String> var4);

    void addCase(String var1, String var2, String var3, String var4);

    void addCase(String var1, String var2, String var3, String var4, Map<String, String> var5);

    void addClass(String var1, String var2, String var3);

    void addClass(String var1, String var2, String var3, String var4, boolean var5, boolean var6);

    String analyzeScripts();

    boolean areScriptsValid();

    String checkAttributeExisting(Object var1, String var2);

    String checkAttributeType(Object var1, String var2, List<String> var3);

    String checkAttrsExisting(Object var1, List<String> var2);

    String checkAttrsType(Object var1, Map<String, List<String>> var2);

    boolean checkTagEnabled(String var1);

    boolean compareTargetClassForObjectAttrTypes(IAttributeTypeWrapper var1, IAttributeTypeWrapper var2);

    boolean compileAll();//throws CompilationFailedException;

    String clearCache(String var1);

    void editStateSetting(String var1, String var2, String var3, boolean var4, boolean var5, int var6, int var7);

    String fixEmptyFieldsInSearchSettings();

    IServiceCallParameters getServiceCallParameters();

    IClassFqn getDefaultServiceCallCase(String var1);

    IMetaClassWrapper getMetaClass(Object var1);

    String getMetaClassTitle(Object var1);

    String getMetaClassTitle(Object var1, String var2);

    IClassFqn getParentFqn(Object var1);

    String getStateTitle(IScriptDtObject var1);

    String getStateTitle(IScriptDtObject var1, String var2);

    String getStateTitle(Object var1, String var2);

    String getStateTitle(Object var1, String var2, String var3);

    String getSystemName();

    void setSystemName(String var1);

    Collection<? extends IMetaClassWrapper> getTypes(IClassFqn var1);

    Collection<? extends IMetaClassWrapper> getTypes(String var1);

    IMetaClassWrapper metaClass(Object var1);

    boolean metaClassExists(Object var1);

    void resetExternalTitleTables();

    void resetFullExternalTitleTables();

    void exportToRemote(@CheckForNull String var1, @Nullable String var2, @Nullable String var3);

    void exportToRemote(@CheckForNull String var1, @Nullable String var2);

    void exportToRemote(@CheckForNull String var1);

    void importFromRemote(@CheckForNull String var1);

    void importFromRemote(@CheckForNull String var1, boolean var2);

    void copyToRepository(@CheckForNull String var1, @CheckForNull String var2, @CheckForNull String var3, @CheckForNull String var4, @CheckForNull String var5);

    void useNotificationLocalized(boolean var1);
}
