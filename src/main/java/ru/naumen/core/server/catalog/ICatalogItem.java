
package ru.naumen.core.server.catalog;

import ru.naumen.common.shared.SnapshotTransient;
import ru.naumen.core.server.IDisplayableTitled;
import ru.naumen.core.server.objectloader.IPrefixObjectLoaderUUIDIdentifiable;
import ru.naumen.core.shared.IChild;
import ru.naumen.core.shared.ICoreRemovable;
import ru.naumen.core.shared.IHasMetaInfo;
import ru.naumen.core.shared.ILocalizedTitle;
import ru.naumen.core.shared.IUUIDIdentifiable;
import ru.naumen.metainfo.shared.elements.HasCodeAndTitle;

public interface ICatalogItem<T extends ICatalogItem<T>> extends IUUIDIdentifiable, IDisplayableTitled, HasCodeAndTitle, ILocalizedTitle, ICoreRemovable, IPrefixObjectLoaderUUIDIdentifiable, IHasMetaInfo, IChild<T>, SnapshotTransient {
    T getParent();

    long getPosition();

    boolean isFolder();

    void setCode(String code);

    void setFolder(boolean folder);

    void setParent(T parent);

    void setPosition(long position);
}
