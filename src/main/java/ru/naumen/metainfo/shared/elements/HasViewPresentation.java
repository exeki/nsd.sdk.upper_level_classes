package ru.naumen.metainfo.shared.elements;


import ru.naumen.common.shared.Snapshotable;

public interface HasViewPresentation extends Snapshotable {

    Presentation getViewPresentation();
}
