package ru.naumen.metainfo.shared.elements;

import com.google.gwt.user.client.rpc.IsSerializable;

import java.io.Serializable;

import ru.naumen.core.shared.HasClone;

abstract public class ResponsibilityTransferItem implements IsSerializable, Serializable, Cloneable, HasClone {


    abstract public String getFrom();

    abstract public String getTo();

    abstract public boolean isActive();

    abstract public boolean isInherit();

    abstract public void setInherit(boolean inherit);

    abstract public void setTo(String to);

    abstract public String toString();

    abstract public Object clone();
}
