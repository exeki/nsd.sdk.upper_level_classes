package ru.naumen.core.server.script.api.metainfo;

import java.util.List;

public interface IAttributeGroupWrapper {
    List<String> getAttributeCodes();

    List<IAttributeWrapper> getAttributes();

    String getCode();

    IMetaClassWrapper getMetaClass();

    String getTitle();

    boolean isHardcoded();
}
