package ru.naumen.core.server.script.api.metainfo;

import ru.naumen.metainfo.shared.IClassFqn;

public interface IRelationWrapper {
    IClassFqn getLeft();

    IClassFqn getRight();

    String getType();

    boolean isHardcoded();
}
