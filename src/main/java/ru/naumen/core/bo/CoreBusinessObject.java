package ru.naumen.core.bo;

import ru.naumen.core.shared.CoreHasMetaInfo;
import ru.naumen.core.shared.HasId;
import ru.naumen.core.shared.IUUIDIdentifiable;
import ru.naumen.metainfo.shared.CoreTitled;

public interface CoreBusinessObject extends IUUIDIdentifiable, CoreHasMetaInfo, CoreTitled, HasId {
}
