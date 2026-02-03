package ru.naumen.metainfo.shared.elements;

import ru.naumen.common.shared.Snapshotable;
import ru.naumen.core.shared.HasCode;
import ru.naumen.core.shared.HasLocalizedTitle;
import ru.naumen.core.shared.ITitled;

public interface Catalog extends HasCode, ITitled, HasDescription, HasHardcoded, Snapshotable, HasLocalizedTitle {
    MetaClassLite getItemMetaClass();

    boolean isFlat();

    boolean isWithFolders();
}
