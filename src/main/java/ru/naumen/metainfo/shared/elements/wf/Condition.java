package ru.naumen.metainfo.shared.elements.wf;

import com.google.gwt.user.client.rpc.IsSerializable;

public interface Condition extends WfActionCondition {
    ConditionType getType();

    public static enum ConditionType implements IsSerializable {
        SCRIPT;

        private ConditionType() {
        }
    }
}
