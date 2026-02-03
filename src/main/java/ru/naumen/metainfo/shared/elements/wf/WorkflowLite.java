package ru.naumen.metainfo.shared.elements.wf;

import com.google.gwt.user.client.rpc.IsSerializable;
import java.io.Serializable;
import java.util.List;

import ru.naumen.common.shared.Snapshotable;

public interface WorkflowLite extends Snapshotable, IsSerializable, Serializable {
    StateLite getState( String code);

    List<? extends StateLite> getStates();
}
