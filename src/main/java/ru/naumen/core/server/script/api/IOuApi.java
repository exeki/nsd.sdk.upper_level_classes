package ru.naumen.core.server.script.api;

import ru.naumen.core.server.bo.ou.ISOU;
import ru.naumen.core.server.script.ScriptApi;
import ru.naumen.core.server.script.spi.IScriptDtObject;
import ru.naumen.core.server.script.spi.IScriptObjectBase;
import ru.naumen.core.shared.IUUIDIdentifiable;

import javax.annotation.Nullable;
import java.util.Collection;

public interface IOuApi extends ScriptApi {
    void assignAgreementToEmployee(IUUIDIdentifiable var1, IUUIDIdentifiable var2);

    void distributeAgreements(Object var1, Collection<String> var2);

    void distributeAgreements(Object var1, Collection<String> var2, boolean var3);

    void distributeAgreements(Object var1, String var2);

    void distributeAgreements(Object var1, String var2, boolean var3);

    Collection<IScriptObjectBase<ISOU>> listNestedOUs(@Nullable String var1);

    Collection<IScriptObjectBase<ISOU>> listNestedOUs(@Nullable String var1, boolean var2);

    Collection<IScriptDtObject> nestedEmployees(Object var1);

    Collection<IScriptDtObject> nestedEmployees(Object var1, boolean var2);

    Collection<String> nestedEmployeeUuids(Object var1, boolean var2);

    Collection<String> nestedEmployeeUuids(Object var1);

    Collection<IScriptDtObject> nestedOUs(Object var1);

    Collection<IScriptDtObject> nestedOUs(Object var1, boolean var2);

    Collection<String> nestedOUUuids(Object var1);

    Collection<String> nestedOUUuids(Object var1, boolean var2);

    void removeAgreements(Object var1, Collection<String> var2);

    void removeAgreements(Object var1, String var2);

    void removeAgreements(Object var1, Collection<String> var2, String var3);

    void removeAgreements(Object var1, String var2, String var3);
}
