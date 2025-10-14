package ru.naumen.core.server.bo;

import ru.naumen.common.shared.utils.IProperties;
import ru.naumen.core.server.UUIDIdentifiableBase;
import ru.naumen.core.server.flex.HasFlexes;
import ru.naumen.metainfo.shared.ClassFqn;

public abstract class AbstractSystemObject extends UUIDIdentifiableBase implements ISimpleBO, HasFlexes {
    IProperties flexes;

    public AbstractSystemObject() {
    }

    public IProperties getFlexes() {
        return this.flexes;
    }

    public abstract ClassFqn getMetaClass();

    public String toString() {
        return "";
    }
}
