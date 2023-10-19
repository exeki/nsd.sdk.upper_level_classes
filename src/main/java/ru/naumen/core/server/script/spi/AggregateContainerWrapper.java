package ru.naumen.core.server.script.spi;

import javax.annotation.CheckForNull;
import javax.annotation.Nullable;
import ru.naumen.core.shared.IHasMetaInfo;
import ru.naumen.core.shared.ITitled;
import ru.naumen.core.shared.IUUIDIdentifiable;
import ru.naumen.metainfo.shared.IClassFqn;

abstract public class AggregateContainerWrapper implements IUUIDIdentifiable, IHasMetaInfo, ITitled {

    public AggregateContainerWrapper(@Nullable IScriptDtObject employee, @Nullable IScriptDtObject ou, @Nullable IScriptDtObject team) {}

    abstract public IScriptDtObject get(int index);

    abstract public Object get(String key);

    @CheckForNull
    abstract public IScriptDtObject getEmployee() ;

    abstract public IClassFqn getMetaClass();
    @CheckForNull
    abstract public IScriptDtObject getOu();

    @CheckForNull
    abstract public IScriptDtObject getTeam();

    abstract public String getTitle();

    abstract public String getUUID() ;

}
