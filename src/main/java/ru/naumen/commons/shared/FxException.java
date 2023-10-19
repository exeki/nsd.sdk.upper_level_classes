package ru.naumen.commons.shared;

import java.util.Map;

abstract public class FxException extends RuntimeException implements IReadableException, ILocalizedException {

    public FxException() {
        super("text");
    }

    public FxException(String msg) {
        super("text");
    }

    public FxException(String msg, boolean readable) {
        super("text");
    }

    public FxException(String msg, boolean readable, String uiMessage) {
        super("text");
    }

    public FxException(String msg, boolean readable, String uiMessage, Throwable cause) {
        super("text");
    }

    public FxException(String msg, boolean readable, Throwable cause) {
        super("text");
    }

    public FxException(String msg, String details) {
        super("text");
    }

    public FxException(String msg, String details, String uiMessage) {
        super("text");
    }

    public FxException(String msg, Throwable cause) {
        super("text");
    }

    public FxException(Throwable cause) {
        super("text");
    }

    public FxException(Map<String, String> localizedMessages) {
        super("text");
    }

    public FxException(Map<String, String> localizedMessages, boolean readable) {
        super("text");
    }

    public FxException(Map<String, String> localizedMessages, Throwable cause) {
        super("text");
    }

    abstract public String getDetails();

    abstract public String getUiMessage();

    abstract public boolean isAlreadyLogged();

    abstract public boolean isReadable();

    abstract public void setAlreadyLogged();

    abstract public Map<String, String> getLocalizedMessages();

    abstract public void setLocalizedMessages(Map<String, String> localizedMessages);

    abstract public String getLocalizedMessage(String locale) ;

    abstract public void setLocalizedMessage(String locale, String message);

    abstract public boolean isLocalized();
}
