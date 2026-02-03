package ru.naumen.metainfo.shared.elements;

import ru.naumen.common.shared.Snapshotable;
import ru.naumen.core.shared.ScriptInfo;

public interface HasScript extends Snapshotable {
    String getScript();


    default ScriptInfo getScriptInfo() {
        return null;
    }
}
