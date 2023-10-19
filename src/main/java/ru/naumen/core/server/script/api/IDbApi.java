package ru.naumen.core.server.script.api;

import ru.naumen.core.server.script.ScriptApi;
import ru.naumen.core.server.script.api.criteria.IApiCriteria;
import ru.naumen.core.server.script.spi.IScriptDtObject;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public interface IDbApi extends ScriptApi {
    IApiCriteria createCriteria();

    int deleteComments(String var1, String var2, String var3, Collection<String> var4);

    String getDBName();

    IQuery query(String var1);

    IQuery queryForEvent(String var1);

    IQuery query(IApiCriteria var1);

    IQuery queryForEvent(IApiCriteria var1);

    void removedFromSystemFlushWorkaround();

    void clear();

    void detach(IScriptDtObject var1);

    void lock(String var1);

    boolean isReadOnly();

    public interface IQuery {
        int executeUpdate();

        List<Object> list();

        IQuery set(Map<String, Object> var1);

        IQuery set(String var1, Collection<?> var2);

        IQuery set(String var1, Object var2);

        IQuery setFirstResult(int var1);

        /**
         * @deprecated
         */
        @Deprecated
        IQuery setMaxResult(int var1);

        IQuery setMaxResults(int var1);

        boolean isCachable();

        IQuery setCachable(boolean var1);
    }
}
