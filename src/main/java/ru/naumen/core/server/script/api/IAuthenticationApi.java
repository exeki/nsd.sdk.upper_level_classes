package ru.naumen.core.server.script.api;

import ru.naumen.core.server.script.ScriptApi;
import ru.naumen.core.server.script.api.accesskeys.IAccessKeyWrapper;

import javax.annotation.Nonnull;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

public interface IAuthenticationApi extends ScriptApi {
    <T> T callAs(Object var1, Callable<T> var2);

    void activateAccessKey(@Nonnull String var1);

    void deactivateAccessKey(@Nonnull String var1);

    Collection<String> findAccessKeysByEmployeeLogin(String var1);

    Collection<String> findAccessKeysByEmployeeUUID(String var1);

    IAccessKeyWrapper getAccessKey(@Nonnull String var1);

    IAccessKeyWrapper getAccessKey(@Nonnull String var1, int var2);

    IAccessKeyWrapper getAccessKeyByUUID(@Nonnull String var1);

    IAccessKeyWrapper getAccessKeyByUUID(@Nonnull String var1, int var2);

    Map<String, Object> getAccessKeyInfo(@Nonnull String var1);

    Collection<Object> getAllAccessKeysInfo(int var1, int var2);

    Collection<Object> getEmployeeAccessKeysInfoByLogin(String var1);

    Collection<Object> getEmployeeAccessKeysInfoByLogin(String var1, int var2, int var3);

    Collection<Object> getEmployeeAccessKeysInfoByUUID(String var1);

    Collection<Object> getEmployeeAccessKeysInfoByUUID(String var1, int var2, int var3);

    void logoutAllUsers();

    void logoutUser(String var1);

    List<String> removeAccessKeys(@Nonnull String var1);

    List<String> removeAccessKeysByUUID(@Nonnull String var1);

    void revokeAllJwtTokens();

    void revokeJwtTokensForEmployee(Object var1);

    void revokeJwtToken(String var1);
}
