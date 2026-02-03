package ru.naumen.metainfo.shared.elements.workflow;

import java.util.Collection;
import java.util.Map;
import ru.naumen.core.shared.CoreColor;

public interface CoreState {
    CoreColor getColor();

    String getCode();

    String getTitle();

    Map<String, ? extends CoreStateSetting> getStateSettings(Collection<String> attrCodes);
}
