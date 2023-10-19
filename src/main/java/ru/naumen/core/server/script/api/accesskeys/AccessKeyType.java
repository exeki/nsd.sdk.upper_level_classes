package ru.naumen.core.server.script.api.accesskeys;

public enum AccessKeyType {
    DISPOSABLE,
    REUSABLE,
    RELATED_TO_SESSION;

    private AccessKeyType() {
    }
}
