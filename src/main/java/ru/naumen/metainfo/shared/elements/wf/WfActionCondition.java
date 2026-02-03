package ru.naumen.metainfo.shared.elements.wf;

import ru.naumen.common.shared.Snapshotable;
import ru.naumen.common.shared.utils.IProperties;
import ru.naumen.core.shared.ScriptInfo;
import ru.naumen.metainfo.shared.elements.HasCodeAndTitle;
import ru.naumen.metainfo.shared.elements.HasDeclaredMetaClass;

public interface WfActionCondition extends HasCodeAndTitle, HasDeclaredMetaClass, Snapshotable {
    IProperties getProperties();

    ScriptInfo getScriptInfo();

    Enum<?> getType();

    Boolean isPre();

    void setProperties(IProperties properties);
}
