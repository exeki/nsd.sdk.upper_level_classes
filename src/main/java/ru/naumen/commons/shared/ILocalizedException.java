package ru.naumen.commons.shared;

import java.util.Map;

public interface ILocalizedException {
    Map<String, String> getLocalizedMessages();

    void setLocalizedMessages(Map<String, String> var1);

    String getLocalizedMessage(String var1);

    void setLocalizedMessage(String var1, String var2);

    boolean isLocalized();
}
