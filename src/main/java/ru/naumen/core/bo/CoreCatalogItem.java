package ru.naumen.core.bo;

import ru.naumen.core.shared.CoreColor;

public interface CoreCatalogItem extends CoreBusinessObject {
    String getCode();

    CoreColor getColor();

    String getTitle();

    CoreCatalogItem getParent();
}
