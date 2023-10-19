package ru.naumen.core.shared.dto;

import ru.naumen.common.shared.utils.IProperties;
import ru.naumen.core.shared.IHasMetaInfo;
import ru.naumen.core.shared.ITitled;
import ru.naumen.metainfo.shared.IClassFqn;


public interface DtObject extends ITitled, IProperties, IHasMetaInfo, ISDtObject, IHasHierarchyLevel {

    IClassFqn getMetainfo();

    void setMetainfo(IClassFqn var1);
}
