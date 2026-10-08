package ru.naumen.core.server.script;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.naumen.commons.shared.FxException;

public class ScriptServiceException extends FxException {
    public static final Logger LOG = LoggerFactory.getLogger((Class<?>) ScriptServiceException.class);

    public ScriptServiceException() {
    }

    public ScriptServiceException(String msg, boolean readable) {
        super(msg, readable);
    }

    public ScriptServiceException(String msg, boolean readable, String uiMessage) {
        super(msg, readable, uiMessage);
    }

    public ScriptServiceException(String msg, boolean readable, Throwable cause) {
        super(msg, readable, cause);
    }

    public ScriptServiceException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public ScriptServiceException(Throwable cause) {
        super(cause);
    }
}
