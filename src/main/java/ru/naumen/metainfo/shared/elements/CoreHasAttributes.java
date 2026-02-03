package ru.naumen.metainfo.shared.elements;

import java.util.List;

public interface CoreHasAttributes {
    CoreAttribute getAttribute(String code);

    List<? extends CoreAttribute> getAttributes();
}
