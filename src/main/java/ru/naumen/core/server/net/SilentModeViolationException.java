package ru.naumen.core.server.net;

import ru.naumen.commons.shared.FxException;

abstract public class SilentModeViolationException extends FxException {

    public SilentModeViolationException() {
    }

    public SilentModeViolationException(String msg) {
        super(msg);
    }

    public SilentModeViolationException(String msg, boolean readable) {
        super(msg, readable);
    }
}
