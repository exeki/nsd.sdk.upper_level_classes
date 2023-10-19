package ru.naumen.metainfo.shared;

import ru.naumen.core.shared.HasClone;

import java.io.Serializable;

public interface IClassFqn extends IClassFqnWrapper, Cloneable, Serializable, Fqn, HasClone {
    IClassFqn fqnOfClass();

    boolean isCase();

    boolean isCaseOf(IClassFqn var1);

    boolean isClass();

    boolean isClassOf(IClassFqn var1);

    /**
     * @deprecated
     */
    @Deprecated
    boolean isSomeClass(IClassFqn var1);

    boolean isSameClass(IClassFqn var1);
}
