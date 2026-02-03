package ru.naumen.metainfo.shared.elements;

import java.util.List;

public interface HasAttributes extends CoreHasAttributes {
    Attribute getAttribute(String code);

    List<? extends Attribute> getAttributes();
}
