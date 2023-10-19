package ru.naumen.core.server.script.api.metainfo;

public interface IActionWrapper {
    String getCode();

    IMetaClassWrapper getDeclaredMetaClass();

    String getTitle();

    Boolean isPre();
}
