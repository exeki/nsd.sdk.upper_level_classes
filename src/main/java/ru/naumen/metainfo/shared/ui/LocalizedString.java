//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package ru.naumen.metainfo.shared.ui;

import com.google.gwt.user.client.rpc.IsSerializable;

import java.io.Serializable;

import ru.naumen.core.shared.HasClone;
import ru.naumen.metainfo.shared.CoreLocalizedString;

public abstract class LocalizedString implements IsSerializable, Serializable, HasClone, CoreLocalizedString {

    abstract public Object clone();

    abstract public boolean equals(Object obj);

    abstract public String getLang();

    abstract public String getValue();

    abstract public int hashCode();

    abstract public void setLang(String value);

    abstract public void setValue(String value);

    abstract public String toString();
}
