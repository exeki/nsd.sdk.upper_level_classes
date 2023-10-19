package ru.naumen.core.server.script.api;

import ru.naumen.core.server.content.IContentLinkDefinition;
import ru.naumen.core.server.content.IHierarchyGridLinkDefinition;
import ru.naumen.core.server.script.IListLinkDefinition;
import ru.naumen.core.server.script.ScriptApi;
import ru.naumen.core.server.script.api.accesskeys.IAccessKeyWrapper;
import ru.naumen.core.shared.IUUIDIdentifiable;
import ru.naumen.metainfo.shared.IClassFqn;

import javax.annotation.Nullable;
import java.util.Collection;
import java.util.Map;

public interface IWebApi extends ScriptApi {
    String add(@Nullable Collection<Object> var1);

    String add(@Nullable Collection<Object> var1, @Nullable IUUIDIdentifiable var2, Map<String, Object> var3);

    String add(@Nullable Collection<Object> var1, @Nullable String var2, @Nullable IUUIDIdentifiable var3, Map<String, Object> var4);

    String add(@Nullable Collection<Object> var1, @Nullable String var2, Map<String, Object> var3);

    String add(@Nullable Collection<Object> var1, @Nullable String var2, @Nullable String var3, Map<String, Object> var4);

    String add(@Nullable IClassFqn var1);

    String add(@Nullable IClassFqn var1, @Nullable IUUIDIdentifiable var2, @Nullable Map<String, Object> var3);

    String add(@Nullable IClassFqn var1, @Nullable String var2, @Nullable IUUIDIdentifiable var3, @Nullable Map<String, Object> var4);

    String add(@Nullable IClassFqn var1, @Nullable IUUIDIdentifiable var2, @Nullable Map<String, Object> var3, boolean var4);

    String add(@Nullable IClassFqn var1, String var2, @Nullable IUUIDIdentifiable var3, @Nullable Map<String, Object> var4, boolean var5);

    String add(@Nullable IClassFqn var1, @Nullable String var2, @Nullable Map<String, Object> var3);

    String add(@Nullable IClassFqn var1, @Nullable String var2, @Nullable String var3, @Nullable Map<String, Object> var4);

    String add(@Nullable IClassFqn var1, @Nullable String var2, @Nullable Map<String, Object> var3, boolean var4);

    String add(@Nullable IClassFqn var1, @Nullable String var2, @Nullable String var3, @Nullable Map<String, Object> var4, boolean var5);

    String add(@Nullable String var1);

    String add(@Nullable String var1, @Nullable IUUIDIdentifiable var2, @Nullable Map<String, Object> var3);

    String add(@Nullable String var1, @Nullable String var2, @Nullable IUUIDIdentifiable var3, @Nullable Map<String, Object> var4);

    String add(@Nullable String var1, @Nullable IUUIDIdentifiable var2, @Nullable Map<String, Object> var3, boolean var4);

    String add(@Nullable String var1, @Nullable String var2, @Nullable IUUIDIdentifiable var3, @Nullable Map<String, Object> var4, boolean var5);

    String add(@Nullable String var1, @Nullable String var2, @Nullable Map<String, Object> var3);

    String add(@Nullable String var1, @Nullable String var2, @Nullable String var3, @Nullable Map<String, Object> var4);

    String add(@Nullable String var1, @Nullable String var2, @Nullable Map<String, Object> var3, boolean var4);

    String add(@Nullable String var1, @Nullable String var2, @Nullable String var3, @Nullable Map<String, Object> var4, boolean var5);

    String asLink(String var1);

    String asLink(String var1, String var2);

    String changeState(IUUIDIdentifiable var1);

    String changeState(IUUIDIdentifiable var1, IAccessKeyWrapper var2);

    String changeState(IUUIDIdentifiable var1, IAccessKeyWrapper var2, Map<String, Object> var3);

    String changeState(IUUIDIdentifiable var1, Map<String, Object> var2);

    String content(IContentLinkDefinition<?> var1);

    IHierarchyGridLinkDefinition defineHierarchyGridLink();

    IListLinkDefinition defineListLink(boolean var1);

    IEditLinkDefinition defineEditLink();

    String edit(Object var1, IEditLinkDefinition var2);

    String edit(@Nullable IUUIDIdentifiable var1);

    String edit(@Nullable IUUIDIdentifiable var1, @Nullable IAccessKeyWrapper var2);

    String edit(@Nullable IUUIDIdentifiable var1, @Nullable IAccessKeyWrapper var2, @Nullable String var3);

    String edit(@Nullable IUUIDIdentifiable var1, @Nullable String var2);

    String edit(@Nullable IUUIDIdentifiable var1, @Nullable String var2, @Nullable String var3);

    String edit(String var1);

    String edit(String var1, @Nullable IAccessKeyWrapper var2);

    String edit(String var1, @Nullable IAccessKeyWrapper var2, @Nullable String var3);

    String edit(String var1, @Nullable String var2);

    String edit(@Nullable String var1, @Nullable String var2, @Nullable String var3);

    String editWithUserUUID(IUUIDIdentifiable var1, String var2);

    String editWithUserUUID(@Nullable IUUIDIdentifiable var1, @Nullable String var2, @Nullable String var3);

    String editWithUserUUID(String var1, String var2);

    String editWithUserUUID(String var1, String var2, @Nullable String var3);

    String encodeUrl(String var1);

    String getBaseUrl();

    String getPlace(String var1);

    String list(Object var1, String var2);

    String list(String var1, String var2, String var3);

    String list(IListLinkDefinition var1);

    String open(IUUIDIdentifiable var1);

    String open(IUUIDIdentifiable var1, IAccessKeyWrapper var2);

    String open(IUUIDIdentifiable var1, String var2);

    String open(String var1);

    String open(String var1, IAccessKeyWrapper var2);

    String open(String var1, String var2);

    String openCommentInList(String var1, String var2);

    String openFileInList(String var1, String var2);

    String openObjectInList(String var1, String var2);

    String openTab(String var1, String var2);

    String openTab(String var1, String var2, String var3);

    String openTab(String var1, String var2, IAccessKeyWrapper var3);

    String openContent(String var1, String var2, @Nullable String var3);

    String openContent(String var1, String var2, @Nullable String var3, String var4);

    String openContent(String var1, String var2, @Nullable String var3, @Nullable IAccessKeyWrapper var4);

    String openSearch(Object var1, Map<String, Object> var2, String var3, @Nullable IAccessKeyWrapper var4);

    String openSearch(Object var1, Map<String, Object> var2, @Nullable IAccessKeyWrapper var3);

    String openSearch(Object var1, Map<String, Object> var2);

    String openSearch(Object var1, Map<String, Object> var2, String var3, String var4);

    String openSearch(Object var1, Map<String, Object> var2, String var3);

    String openWithUserUUID(IUUIDIdentifiable var1, String var2);

    String openWithUserUUID(String var1, String var2);

    String toAnchor(String var1);

    String toParameter(IAccessKeyWrapper var1);
}
