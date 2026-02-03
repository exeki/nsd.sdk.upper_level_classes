package ru.naumen.metainfo.shared.elements;

import ru.naumen.common.shared.Snapshotable;

public interface HasSearchSetting extends Snapshotable {
    Object getSearchSetting();

    Object getSearchSettingWithoutAdding();

    void setSearchSetting(Object ss);
}
