package ru.naumen.core.shared.script.places;

import com.google.gwt.user.client.rpc.IsSerializable;

import java.io.Serializable;

import ru.naumen.core.shared.HasTitleCode;

public interface ScriptCategory extends HasTitleCode, Serializable, IsSerializable {
    boolean isCatalogCategory();

    String name();
}
