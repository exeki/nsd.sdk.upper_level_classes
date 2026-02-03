package ru.naumen.metainfo.shared;

import java.util.Collection;
import ru.naumen.metainfo.shared.elements.MetaClass;

public interface ProvidesMetaClasses {
    MetaClass getMetaClass(ClassFqn paramClassFqn);

    Collection<ClassFqn> getDescendantClassesForShared(ClassFqn paramClassFqn, boolean paramBoolean);
}
