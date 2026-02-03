
package ru.naumen.metainfo.shared.elements;

import com.google.gwt.user.client.rpc.IsSerializable;
import java.io.Serializable;
import ru.naumen.core.shared.HasCode;
import ru.naumen.metainfo.shared.ClassFqn;

public interface Relation extends HasDepends, HasHardcoded, IsSerializable, Serializable, HasCode, CoreRelation {
    ClassFqn getLeft();

    ClassFqn getRight();

    String getType();

}
