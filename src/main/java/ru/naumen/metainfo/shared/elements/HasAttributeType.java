package ru.naumen.metainfo.shared.elements;

import ru.naumen.common.shared.Snapshotable;

public interface HasAttributeType extends Snapshotable {

    AttributeType getType();
}
