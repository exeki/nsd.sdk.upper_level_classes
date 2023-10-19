package ru.naumen.core.server.script.spi;

import ru.naumen.core.server.script.IFormattersWrapper;
import ru.naumen.core.server.script.ScriptApi;
import ru.naumen.core.server.script.api.ISearchParams;
import ru.naumen.core.shared.IUUIDIdentifiable;
import ru.naumen.core.shared.dto.ISDtObject;
import ru.naumen.metainfo.shared.IClassFqn;

import javax.activation.DataSource;
import javax.annotation.Nullable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public interface IScriptUtils extends ScriptApi {
    List<ISDtObject> allFiles(Object var1);

    Collection<?> asCollection(Object var1);

    String asJson(Object var1, Collection<String> var2);

    String asJson(Object var1);

    String asRTF(ISDtObject var1, String var2);

    String asString(ISDtObject var1, String var2);

    String asText(ISDtObject var1, String var2);

    ISDtObject attachFile(IScriptDtObject var1, IUUIDIdentifiable var2);

    ISDtObject attachFile(IScriptDtObject var1, String var2, IUUIDIdentifiable var3);

    ISDtObject attachFile(IScriptDtObject var1, String var2, String var3, String var4, byte[] var5);

    ISDtObject attachFile(IScriptDtObject var1, String var2, String var3, String var4, String var5, byte[] var6);

    ISDtObject attachFileFromDisk(IScriptDtObject var1, String var2, String var3, String var4, String var5);

    ISDtObject attachFileFromDisk(IScriptDtObject var1, String var2, String var3, String var4, String var5, String var6);

    ISDtObject attachFileFromExternal(IScriptDtObject var1, String var2, String var3, String var4, String var5);

    ISDtObject attachFileFromExternal(IScriptDtObject var1, String var2, String var3, String var4, String var5, String var6);

    void base64ImgsToFiles(Object var1, String var2);

    boolean checkRestrictions(IScriptDtObject var1, boolean var2, boolean var3);

    void clearAttribute(IScriptDtObject var1, String var2);

    List<ISDtObject> comments(IUUIDIdentifiable var1);

    boolean containsAttribute(IUUIDIdentifiable var1, String var2);

    String convertFilesToBase64(String var1);

    String convertFilesToBase64(String var1, boolean var2);

    void copyAttrsToAttr(List<String> var1, String var2, String var3, List<String> var4);

    void copyFromRelated(ISDtObject var1, String var2, String var3, String var4);

    void copyManyLinks(ISDtObject var1, String var2, String var3, List<String> var4);

    void copyToChilds(ISDtObject var1, String var2, String var3, String var4, List<String> var5);

    void copyToNested(ISDtObject var1, String var2);

    void copyToRelated(ISDtObject var1, String var2, String var3, String var4);

    long count(IClassFqn var1, Map<String, Object> var2);

    long count(String var1, Map<String, Object> var2);

    ISDtObject create(IClassFqn var1, Map<String, Object> var2);

    ISDtObject create(String var1, Map<String, Object> var2);

    ISDtObject createWithoutEventActions(IClassFqn var1, Map<String, Object> var2);

    ISDtObject createWithoutEventActions(String var1, Map<String, Object> var2);

    void delete(Object var1);

    ISDtObject edit(Object var1, Map<String, Object> var2);

    ISDtObject edit(Object var1, Map<String, Object> var2, boolean var3);

    ISDtObject editValueMapRow(Object var1, long var2, Map<String, Object> var4);

    ISDtObject editValueMapRow(Object var1, Map<String, Object> var2, Map<String, Object> var3);

    ISDtObject editWithoutEventActions(Object var1, Map<String, Object> var2);

    ISDtObject editWithoutEventActions(Object var1, Map<String, Object> var2, boolean var3);

    boolean equal(Object var1, Object var2);

    boolean equalsDefaultValue(IUUIDIdentifiable var1, String var2);

    void event(IUUIDIdentifiable var1, String var2);

    Object executeScript(String var1);

    Object executeScript(String var1, Map<String, Object> var2);

    Object executeScript(String var1, String var2);

    Object executeScript(String var1, @Nullable Map<String, Object> var2, @Nullable String var3);

    String exportObjectsToXls(IClassFqn var1, Map<String, Object> var2);

    String exportObjectsToXls(String var1, Map<String, Object> var2);

    String exportObjectsToXlsWithAllAttrs(IClassFqn var1, Map<String, Object> var2);

    String exportObjectsToXlsWithAllAttrs(String var1, Map<String, Object> var2);

    List<ISDtObject> files(Object var1);

    List<ISDtObject> filesFromRtf(Object var1);

    List<ISDtObject> filesFromRtf(Object var1, boolean var2);

    List<ISDtObject> filesFromRtf(Object var1, String var2);

    List<ISDtObject> filesFromRtf(Object var1, String var2, boolean var3);

    Collection<String> filterUUIDs(Collection<String> var1, Map<String, Object> var2);

    Collection<ISDtObject> find(IClassFqn var1, Map<String, Object> var2);

    Collection<ISDtObject> find(IClassFqn var1, Map<String, Object> var2, boolean var3);

    Collection<ISDtObject> find(IClassFqn var1, Map<String, Object> var2, boolean var3, int var4);

    Collection<ISDtObject> find(IClassFqn var1, Map<String, Object> var2, ISearchParams var3);

    Collection<ISDtObject> find(String var1, Map<String, Object> var2);

    Collection<ISDtObject> find(String var1, Map<String, Object> var2, ISearchParams var3);

    ISDtObject findFirst(Object var1, Map<String, Object> var2);

    ISDtObject findUnique(Map<String, Object> var1);

    ISDtObject findUnique(Map<String, Object> var1, Object var2);

    ISDtObject findUnique(Map<String, Object> var1, Object var2, boolean var3);

    String formatToHtml(String var1);

    <T extends Serializable> T fromBase64(String var1);

    ISDtObject get(String var1);

    ISDtObject get(String var1, Map<String, Object> var2);

    ISDtObject get(String var1, Map<String, Object> var2, boolean var3);

    Map<String, Object> getAggrValueMap(Object var1, String var2);

    Collection<String> getChildUuids(Object var1);

    Collection<String> getChildUuids(Object var1, String var2);

    Collection<String> getExistsUUIDs(Collection<String> var1);

    DataSource getFileDataSource(IScriptDtObject var1);

    IFormattersWrapper getFormatters();

    Object getFromValueMap(String var1, Object var2, Object var3);

    <T> T getIterableElement(Iterable<? extends T> var1, int var2, T var3);

    <T extends IUUIDIdentifiable> Collection<T> getNested(IScriptDtObject var1);

    <T extends IUUIDIdentifiable> Collection<T> getNested(IScriptDtObject var1, String var2);

    <T extends IScriptDtObject> Collection<T> getNestedSubTree(IScriptDtObject var1);

    <T extends IScriptDtObject> Collection<T> getNestedSubTree(IScriptDtObject var1, String var2);

    Collection<ISDtObject> getObjects(Collection<String> var1);

    Collection<String> getParentUuids(Object var1);

    Collection<String> getParentUuids(Object var1, String var2);

    String getUserIP();

    String imageForHtml(String var1);

    boolean isFilled(IUUIDIdentifiable var1, String var2);

    boolean isFolder(IScriptDtObject var1);

    <T extends IUUIDIdentifiable> boolean isUpper(IScriptDtObject var1, IScriptDtObject var2);

    ISDtObject lastComment(IUUIDIdentifiable var1);

    ISDtObject lastResponsible(IUUIDIdentifiable var1);

    ISDtObject lastState(IUUIDIdentifiable var1);

    ISDtObject load(String var1);

    byte[] processTemplate(ISDtObject var1, Map<String, Object> var2);

    Object processTemplate(String var1, Map<String, Object> var2);

    byte[] readFileContent(IScriptDtObject var1) throws IOException;

    Collection<ISDtObject> responsibleHistory(IUUIDIdentifiable var1);

    void rtfAttrsFromBase64ToFiles(Map<String, Collection<String>> var1);

    String sanitizeHtml(String var1);

    String setResponsible(IScriptDtObject var1, @Nullable IScriptDtObject var2, @Nullable IScriptDtObject var3);

    Collection<ISDtObject> stateHistory(IUUIDIdentifiable var1);

    <T> Collection<T> subtract(Collection<T> var1, Collection<T> var2);

    void throwReadableException(String var1, Object... var2);

    void throwReadableException(String var1, @Nullable Object[] var2, String var3, @Nullable Object[] var4);

    void throwUiReadableException(String var1, Object... var2);

    <T extends Serializable> String toBase64(T var1);

    void setFileCacheControl(String var1, @Nullable String var2);

    @Nullable
    String getFileCacheControl(String var1);

    void moveFileToLocalBucketFileStorage(String var1, String var2, String var3);

    OutputStream imageToPdf(InputStream var1, String var2);
}
