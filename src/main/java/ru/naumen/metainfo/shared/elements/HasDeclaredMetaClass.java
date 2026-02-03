package ru.naumen.metainfo.shared.elements;


import ru.naumen.common.shared.Snapshotable;
import ru.naumen.metainfo.shared.ClassFqn;

public interface HasDeclaredMetaClass extends Snapshotable {

    ClassFqn getDeclaredMetaClass();
}
