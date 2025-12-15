package ru.naumen.core.server.script.api;

import ru.naumen.core.server.script.ScriptApi;

public interface IStringApi extends ScriptApi, IDocumentedStringApi {
    String[] splitByDelimiters(String str, String delimiters);

    public static enum FindFormats {
        NUMBER,
        WORD,
        STRING;

        private FindFormats() {
        }
    }
}
