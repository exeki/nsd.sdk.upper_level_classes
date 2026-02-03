package ru.naumen.metainfo.shared.elements;

import ru.naumen.common.shared.Snapshotable;

public interface HasGenarationRule extends Snapshotable {
    String getGenerationRule();

    Boolean isUseGenerationRule();
}
