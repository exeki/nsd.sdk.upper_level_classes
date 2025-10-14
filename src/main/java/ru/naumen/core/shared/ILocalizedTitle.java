package ru.naumen.core.shared;

import java.util.Map;
import ru.naumen.common.shared.utils.ILocalizedText;

public interface ILocalizedTitle extends ITitled {
    ILocalizedText getLocalizedTitle();

    void setLocalizedTitle(String locale, String title);

    void setLocalizedTitle(Map<String, String> titles);

    void setLocalizedTitle( ILocalizedText title);
}
