package ru.naumen.metainfo.shared.elements;

import ru.naumen.common.shared.Snapshotable;

public interface HasEditPresentation extends Snapshotable {
    Presentation getEditPresentation();
}
