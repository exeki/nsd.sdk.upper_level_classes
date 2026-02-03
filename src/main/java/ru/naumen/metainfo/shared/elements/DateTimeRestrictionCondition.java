package ru.naumen.metainfo.shared.elements;

import com.google.gwt.user.client.rpc.IsSerializable;

public enum DateTimeRestrictionCondition implements IsSerializable {
    NO,
    GTE,
    GT,
    LT,
    LTE;

    private DateTimeRestrictionCondition() {
    }
}
