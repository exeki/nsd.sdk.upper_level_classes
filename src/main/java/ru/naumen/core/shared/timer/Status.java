package ru.naumen.core.shared.timer;

import javax.annotation.Nullable;

public enum Status {
    ACTIVE("a"),
    EXCEED("e"),
    NOTSTARTED("n"),
    PAUSED("p"),
    STOPED("s");

    private String code;

    public static Status getByCode(@Nullable String code) {
        if ("s".equals(code)) {
            return STOPED;
        } else if ("a".equals(code)) {
            return ACTIVE;
        } else if ("p".equals(code)) {
            return PAUSED;
        } else {
            return "e".equals(code) ? EXCEED : NOTSTARTED;
        }
    }

    private Status(String code) {
        this.code = code;
    }

    public String getCode() {
        return this.code;
    }
}
