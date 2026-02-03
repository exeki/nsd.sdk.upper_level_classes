package ru.naumen.metainfo.shared.elements;

import com.google.gwt.user.client.rpc.IsSerializable;

import java.io.Serializable;

import ru.naumen.core.shared.HasCode;
import ru.naumen.metainfo.shared.AttributeFqn;
import ru.naumen.metainfo.shared.ClassFqn;


abstract public class MetaclassSortingCriteria implements Serializable, IsSerializable, HasCode {

    abstract public AttributeFqn getAttributeFqn();

    abstract public TYPE getType();

    abstract public ClassFqn getClassFqn();

    abstract public String getAttributeTitle();

    abstract public void setAttributeFqn(AttributeFqn attributeFqn);

    abstract public void setType(TYPE type);

    abstract public void setClassFqn(ClassFqn classFqn);

    abstract public void setAttributeTitle(String attributeTitle);

    abstract public String getCode();

    public static enum TYPE implements Serializable, IsSerializable {
        BY_ATTR_WEIGHT,
        BY_ATTR_VALUE;

        private TYPE() {
        }
    }
}
