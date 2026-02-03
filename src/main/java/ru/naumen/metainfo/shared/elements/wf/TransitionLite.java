package ru.naumen.metainfo.shared.elements.wf;

import com.google.gwt.user.client.rpc.IsSerializable;
import java.io.Serializable;
import ru.naumen.common.shared.Snapshotable;
import ru.naumen.core.shared.ITitled;

public interface TransitionLite extends Serializable, IsSerializable, Snapshotable, ITitled {

    String getBeginState();

    String getEndState();
}
