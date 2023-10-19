package ru.naumen.core.server.script.api;

import ru.naumen.core.server.script.ScriptApi;

public interface IBarcodeApi extends ScriptApi {
    byte[] getBarCode(String var1, String var2, String var3, int var4, int var5);
}
