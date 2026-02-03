package ru.naumen.metainfo.shared.elements.wf;

import ru.naumen.core.shared.HasCode;

public enum ViewItem implements HasCode {
    STATE(),
    ATTRIBUTE(),
    COMMENT(),
    HEADER(),
    COMMENT_ATTR();

    public String getCode() {
        return "";
    }

    public static boolean isComment(String code) {
        return false;
    }
}
