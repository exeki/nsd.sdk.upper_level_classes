package ru.naumen.core.server.flex;

import ru.naumen.common.shared.utils.IProperties;
import ru.naumen.core.shared.IHasMetaInfo;

public interface HasFlexes extends IHasMetaInfo {
    IProperties getFlexes();
}
