package ru.naumen.core.server.script.api;

import ru.naumen.core.server.script.ScriptApi;

public interface IEncrytionApi extends ScriptApi {
    void decryptAllPasswords();

    void encryptAllPasswords();

    String encryptString(String var1);
}
