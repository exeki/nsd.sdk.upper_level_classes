package ru.naumen.metainfo.shared.elements.wf;

import com.google.gwt.user.client.rpc.IsSerializable;

public interface Action extends WfActionCondition {
    ActionType getType();

    public static enum ActionType implements IsSerializable {
        SCRIPT;

        private ActionType() {
        }
    }
}
