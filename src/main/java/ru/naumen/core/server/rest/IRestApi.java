package ru.naumen.core.server.rest;

import ru.naumen.core.server.script.ScriptApi;
import ru.naumen.core.server.script.api.accesskeys.IAccessKeyWrapper;
import ru.naumen.core.shared.IUUIDIdentifiable;

import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

public interface IRestApi extends ScriptApi {
    IRestFindOptions defineFindOptions();

    String create(String var1, Map<String, Object> var2);

    String create(String var1, Map<String, Object> var2, IAccessKeyWrapper var3);

    String create(String var1, Map<String, Object> var2, String var3);

    String createMultiple(ArrayList<Map<String, Object>> var1, String var2);

    String createMultiple(ArrayList<Map<String, Object>> var1, IAccessKeyWrapper var2);

    ILinkBuilder createA(String var1, Map<String, Object> var2, String var3);

    ILinkBuilder createAWithUserUUID(String var1, Map<String, Object> var2, String var3);

    String createExcl(@Nonnull String var1, @Nonnull Map<String, Object> var2, String var3);

    String createExcl(@Nonnull String var1, @Nonnull String var2, Long var3, Long var4, String var5);

    String createM2M(String var1, Map<String, Object> var2);

    String createM2M(String var1, Map<String, Object> var2, Collection<String> var3);

    String createM2M(String var1, Map<String, Object> var2, IAccessKeyWrapper var3);

    String createM2M(String var1, Map<String, Object> var2, IAccessKeyWrapper var3, Collection<String> var4);

    String createWithRedirect(String var1, Map<String, Object> var2);

    String createWithRedirect(String var1, Map<String, Object> var2, IAccessKeyWrapper var3);

    String createWithRedirect(String var1, String var2, Map<String, Object> var3, String var4, String var5, String var6, String var7, String var8);

    String createWithRedirect(String var1, String var2, Map<String, Object> var3, String var4, String var5, String var6, String var7, String var8, IAccessKeyWrapper var9);

    String createWithUserUUID(String var1, Map<String, Object> var2, String var3);

    String delete(IUUIDIdentifiable var1);

    String delete(IUUIDIdentifiable var1, IAccessKeyWrapper var2);

    String delete(IUUIDIdentifiable var1, String var2);

    ILinkBuilder deleteA(IUUIDIdentifiable var1, String var2);

    ILinkBuilder deleteAWithUserUUID(IUUIDIdentifiable var1, String var2);

    String deleteWithRedirect(String var1, IUUIDIdentifiable var2, String var3, String var4, String var5, String var6, String var7);

    String deleteWithRedirect(String var1, IUUIDIdentifiable var2, String var3, String var4, String var5, String var6, String var7, IAccessKeyWrapper var8);

    String deleteWithUserUUID(IUUIDIdentifiable var1, String var2);

    String edit(IUUIDIdentifiable var1, Map<String, Object> var2);

    String edit(IUUIDIdentifiable var1, Map<String, Object> var2, IAccessKeyWrapper var3);

    String edit(IUUIDIdentifiable var1, Map<String, Object> var2, String var3);

    ILinkBuilder editA(IUUIDIdentifiable var1, Map<String, Object> var2, String var3);

    ILinkBuilder editAWithUserUUID(IUUIDIdentifiable var1, Map<String, Object> var2, String var3);

    String editExcl(@Nonnull String var1, Long var2, Long var3, String var4);

    String editExcl(@Nonnull String var1, Map<String, Object> var2, String var3);

    IFormBuilder editForm(IUUIDIdentifiable var1, Map<String, Object> var2, String var3);

    IFormBuilder editFormWithUserUUID(IUUIDIdentifiable var1, Map<String, Object> var2, String var3);

    String editM2M(IUUIDIdentifiable var1, Map<String, Object> var2);

    String editM2M(IUUIDIdentifiable var1, Map<String, Object> var2, Collection<String> var3);

    String editM2M(IUUIDIdentifiable var1, Map<String, Object> var2, IAccessKeyWrapper var3);

    String editM2M(IUUIDIdentifiable var1, Map<String, Object> var2, IAccessKeyWrapper var3, Collection<String> var4);

    String editWithRedirect(IUUIDIdentifiable var1, Map<String, Object> var2);

    String editWithRedirect(IUUIDIdentifiable var1, Map<String, Object> var2, IAccessKeyWrapper var3);

    String editWithRedirect(IUUIDIdentifiable var1, Map<String, Object> var2, String var3);

    String editWithRedirect(IUUIDIdentifiable var1, Map<String, Object> var2, String var3, IAccessKeyWrapper var4);

    String editWithRedirect(String var1, IUUIDIdentifiable var2, Map<String, Object> var3, String var4, String var5, String var6, String var7, String var8);

    String editWithRedirect(String var1, IUUIDIdentifiable var2, Map<String, Object> var3, String var4, String var5, String var6, String var7, String var8, IAccessKeyWrapper var9);

    String editWithUserUUID(IUUIDIdentifiable var1, Map<String, Object> var2, String var3);

    String encryptAllPasswords(IAccessKeyWrapper var1);

    String find(String var1, Map<String, Object> var2);

    String find(String var1, Map<String, Object> var2, IRestFindOptions var3);

    String find(String var1, Map<String, Object> var2, IAccessKeyWrapper var3);

    String find(String var1, Map<String, Object> var2, IAccessKeyWrapper var3, IRestFindOptions var4);

    String find(String var1, Map<String, Object> var2, String var3);

    String find(String var1, Map<String, Object> var2, String var3, IRestFindOptions var4);

    String findWithUserUUID(String var1, Map<String, Object> var2, String var3);

    String findWithUserUUID(String var1, Map<String, Object> var2, String var3, IRestFindOptions var4);

    String get(IUUIDIdentifiable var1);

    String get(IUUIDIdentifiable var1, Collection<String> var2);

    String get(IUUIDIdentifiable var1, IAccessKeyWrapper var2);

    String get(IUUIDIdentifiable var1, IAccessKeyWrapper var2, Collection<String> var3);

    String get(IUUIDIdentifiable var1, String var2);

    String get(IUUIDIdentifiable var1, String var2, Collection<String> var3);

    String getBaseUrl();

    String getFile(Object var1);

    String getFile(Object var1, IAccessKeyWrapper var2);

    String getFile(Object var1, String var2);

    String getFileWithUserUUID(Object var1, String var2);

    String getWithUserUUID(IUUIDIdentifiable var1, String var2);

    String getWithUserUUID(IUUIDIdentifiable var1, String var2, Collection<String> var3);
}
