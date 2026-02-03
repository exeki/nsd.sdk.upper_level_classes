package ru.naumen.metainfo.shared.elements;


import ru.naumen.common.shared.Snapshotable;

public interface HasRequiredInInterface extends Snapshotable {

    Boolean isRequiredInInterface();

    void setRequiredInInterface(Boolean isRequiredInInterface);
}
