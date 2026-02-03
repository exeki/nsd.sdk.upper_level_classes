package ru.naumen.metainfo.shared.elements;

import java.util.List;
import ru.naumen.common.shared.Snapshotable;
import ru.naumen.core.shared.ScriptInfo;

public interface HasComputableOnForm extends Snapshotable {
    List<String> getAttrsUsedInCompOnFormScript();

    String getComputableOnFormScript();

    ScriptInfo getComputableOnFormScriptInfo();

    Boolean isComputableOnForm();
}
