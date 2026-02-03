package ru.naumen.metainfo.shared;

import com.google.gwt.user.client.rpc.IsSerializable;

import java.io.Serializable;

import ru.naumen.core.shared.HasCode;


abstract public class AttributeFqn implements IsSerializable, Serializable, IAttributeFqn, HasCode {

    public static AttributeFqn create(ClassFqn classFqn, String code) {
        return null;
    }

    public static ClassFqn getClassFqn(String attributeFqn) {
        return null;
    }

    public static String getCode(String attributeFqn) {
        return null;
    }

    public static boolean isAttributeFqn(String str) {
        return false;
    }

    public static AttributeFqn parse(String str) {
        return null;
    }

    public static String toString(ClassFqn classFqn, String code) {
        return null;
    }

    abstract public boolean equals(Object obj);

    abstract public ClassFqn getClassFqn();

    abstract public String getCode();

    abstract public String getPropertyFqn();

    abstract public int hashCode();

    abstract public String toString();
}
