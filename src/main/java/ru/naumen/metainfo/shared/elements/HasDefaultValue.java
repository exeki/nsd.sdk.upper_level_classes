package ru.naumen.metainfo.shared.elements;


import ru.naumen.common.shared.Snapshotable;

public interface HasDefaultValue extends Snapshotable {

    <T> T getDefaultValue();

    boolean getHasDefaultValue();
}
