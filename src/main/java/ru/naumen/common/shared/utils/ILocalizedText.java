
package ru.naumen.common.shared.utils;

import java.io.Serializable;
import java.util.Map;

public interface ILocalizedText extends Serializable {
    String getText(String locale);

    void setText(String locale, String value);

    Map<String, String> asMap();

    void setFromMap(Map<String, String> localizedText);
}
