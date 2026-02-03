package ru.naumen.metainfo.shared.elements;

import ru.naumen.common.shared.Snapshotable;
import ru.naumen.core.shared.ScriptInfo;

public interface HasDefaultByScript extends Snapshotable {
    String getScriptForDefault();

    ScriptInfo getScriptForDefaultInfo();

    Boolean isDefaultByScript();
}
