package ru.naumen.metainfo.shared;

import java.io.Serializable;

import ru.naumen.core.shared.HasClone;

public interface IClassFqn extends IClassFqnWrapper, CoreClassFqn, Cloneable, Serializable, Fqn, HasClone {
    IClassFqn fqnOfClass();

    default boolean isCase() {
        return !this.isClass();
    }

    boolean isCaseOf(CoreClassFqn other);

    boolean isClassOf(CoreClassFqn other);

    /**
     * @deprecated
     */
    @Deprecated
    boolean isSomeClass(IClassFqn other);

    boolean isSameClass(CoreClassFqn other);
}
