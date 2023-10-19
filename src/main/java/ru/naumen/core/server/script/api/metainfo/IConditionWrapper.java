package ru.naumen.core.server.script.api.metainfo;

public interface IConditionWrapper {
    String getCode();

    IMetaClassWrapper getDeclaredMetaClass();

    String getTitle();

    Boolean isPre();
}
