package ru.naumen.core.server;

import ru.naumen.core.shared.IHasMetaInfo;
import ru.naumen.core.shared.IUUIDIdentifiable;
import ru.naumen.metainfo.shared.ClassFqn;

public interface HasCase extends IHasMetaInfo, IUUIDIdentifiable {
    void setMetaClass(ClassFqn fqn);
}
