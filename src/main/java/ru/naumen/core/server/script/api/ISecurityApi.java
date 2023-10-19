package ru.naumen.core.server.script.api;

import ru.naumen.core.server.script.ScriptApi;
import ru.naumen.core.shared.IUUIDIdentifiable;
import ru.naumen.metainfo.shared.IClassFqn;
import ru.naumen.metainfo.shared.elements.sec.ISGroup;

import java.util.Collection;
import java.util.Set;

public interface ISecurityApi extends ScriptApi {
    void addEmployeeToGroup(String var1, IUUIDIdentifiable var2);

    void addMembersToGroup(String var1, Collection<String> var2);

    void addMemberToGroup(String var1, String var2);

    void forceGlobalPasswordChange();

    void forcePasswordChange(IUUIDIdentifiable var1);

    void forcePasswordChange(String var1);

    String generatePassword();

    Set<String> getAllEmployees(Collection<ISGroup> var1);

    Set<String> getAllEmployees(ISGroup var1);

    ISGroup getGroup(String var1);

    Set<? extends ISGroup> getGroups();

    Set<String> getGroupEmployees(String var1);

    Collection<IClassFqn> hasAddServiceCallPermission(Collection<Object> var1, Object var2, Object var3);

    /**
     * @deprecated
     */
    @Deprecated
    boolean hasEditPermission(IUUIDIdentifiable var1, String var2);

    boolean hasViewAttrPermission(Object var1, String var2);

    boolean hasEditAttrPermission(Object var1, String var2);

    boolean hasPermission(Object var1, String var2);

    boolean hasChangeStatePermission(Object var1, Object var2);

    boolean hasProfile(IClassFqn var1, String var2);

    boolean hasProfile(IUUIDIdentifiable var1, String var2);

    boolean hasProfile(String var1, String var2);

    void removeMemberFromGroup(String var1, String var2);

    void removeMembersFromGroup(String var1, Collection<String> var2);

    String showNewPermissionsForUnlicensedUser(String... var1);
}
