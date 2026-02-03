package ru.naumen.metainfo.shared.elements.wf;

import java.io.Serializable;
import ru.naumen.common.shared.Snapshotable;
import ru.naumen.core.shared.HasCode;
import ru.naumen.core.shared.ITitled;
import ru.naumen.metainfo.shared.elements.HasDeclaredMetaClass;
import ru.naumen.metainfo.shared.elements.workflow.CoreStateSetting;

public interface StateSetting extends ITitled, HasCode, HasDeclaredMetaClass, Snapshotable, Serializable, CoreStateSetting {
    int getPostFill();

    int getPreFill();

    String getStateCode();

    String getTitle();

    boolean isCanEdit();

    boolean isCanView();

    boolean isRequiredInState();


}
