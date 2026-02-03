package ru.naumen.metainfo.shared.elements.wf;

import java.io.Serializable;
import ru.naumen.common.shared.utils.Color;
import ru.naumen.core.shared.HasCode;
import ru.naumen.core.shared.ITitled;
import ru.naumen.metainfo.shared.elements.HasEnabled;
import ru.naumen.metainfo.shared.tags.HasTags;

public interface StateLite extends ITitled, HasCode, HasEnabled, HasTags, Serializable {
    Color getColor();

    Boolean isEndState();
}
