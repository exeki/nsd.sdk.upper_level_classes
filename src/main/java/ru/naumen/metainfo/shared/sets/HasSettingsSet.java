package ru.naumen.metainfo.shared.sets;

import ru.naumen.common.shared.Snapshotable;

public interface HasSettingsSet extends Snapshotable {
    String getSettingsSet();

    void setSettingsSet( String settingsSet);
}