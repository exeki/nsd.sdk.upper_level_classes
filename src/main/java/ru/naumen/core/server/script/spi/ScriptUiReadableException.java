package ru.naumen.core.server.script.spi;

public class ScriptUiReadableException extends ScriptReadableException {
    public ScriptUiReadableException(String uiMessage) {
        super(uiMessage, uiMessage);
    }
}