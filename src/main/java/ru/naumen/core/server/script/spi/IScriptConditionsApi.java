package ru.naumen.core.server.script.spi;

import ru.naumen.core.server.script.ScriptApi;

import java.util.Collection;

public interface IScriptConditionsApi extends ScriptApi {
    Object between(Object var1, Object var2);

    Object eq(Object var1);

    Object gt(Object var1);

    Object in(Collection<Object> var1);

    Object in(Object... var1);

    Object isNotNull();

    Object isNull();

    Object like(String var1);

    Object lt(Object var1);

    Object not(Object... var1);

    Object orEq(Object... var1);
}
