package ru.naumen.metainfo.shared.elements;

import com.google.gwt.user.client.rpc.IsSerializable;

import java.io.Serializable;

import ru.naumen.metainfo.shared.ClassFqn;

abstract public class Filter implements IsSerializable, Serializable {

    abstract public String getAttribute();

    abstract public ClassFqn getMetaClass();

    abstract public String getMsgCode();

    abstract public String getValue();
}
