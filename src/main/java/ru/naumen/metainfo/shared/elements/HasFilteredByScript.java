package ru.naumen.metainfo.shared.elements;

import java.util.List;
import ru.naumen.common.shared.Snapshotable;
import ru.naumen.core.shared.ScriptInfo;

public interface HasFilteredByScript extends Snapshotable {
    List<String> getAttrsUsedInScript();

    String getScriptForFiltration();

    ScriptInfo getScriptForFiltrationInfo();

    Boolean isFilteredByScript();
}
