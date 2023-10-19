package ru.naumen.core.server.script.api.metainfo;

import ru.naumen.metainfo.shared.IClassFqn;

public interface IAttributeTypeWrapper {
    String getCode();

    IClassFqn getRelatedMetaClass();
}
