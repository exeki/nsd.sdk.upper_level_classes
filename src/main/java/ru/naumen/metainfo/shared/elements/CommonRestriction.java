package ru.naumen.metainfo.shared.elements;

import ru.naumen.core.shared.HasCode;

public enum CommonRestriction implements HasCode {
    PAST,
    FUTURE;

    private CommonRestriction() {
    }

    public String getCode() {
        return this.name();
    }
}
