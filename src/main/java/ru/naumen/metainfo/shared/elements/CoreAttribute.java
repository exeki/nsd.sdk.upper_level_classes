package ru.naumen.metainfo.shared.elements;

import ru.naumen.metainfo.shared.CoreAttributeFqn;
import ru.naumen.metainfo.shared.CoreClassFqn;
import ru.naumen.metainfo.shared.CoreHasCode;
import ru.naumen.metainfo.shared.CoreTitled;

public interface CoreAttribute extends CoreHasCode, CoreTitled, CoreHasFqn, CoreHasComputable {
    CoreAttributeFqn getFqn();

    CoreAttributeType getType();

    CoreClassFqn getDeclaredMetaClass();
}
