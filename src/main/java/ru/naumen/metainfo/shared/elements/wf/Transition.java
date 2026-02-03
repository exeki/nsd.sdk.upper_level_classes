package ru.naumen.metainfo.shared.elements.wf;

import java.io.Serializable;
import java.util.List;
import java.util.Set;
import ru.naumen.metainfo.shared.elements.HasDeclaredMetaClass;
import ru.naumen.metainfo.shared.elements.HasEnabled;

public interface Transition extends TransitionLite, HasEnabled, HasDeclaredMetaClass, Serializable {
    boolean isChangeStateWithoutOpenForm();

    Boolean isShowAttributesDescription();

    Set<TransitionItem> getItems();

    List<String> getItemsOrder();

    List<TransitionItem> getOrderedItems();

    Set<String> getDeletedItems();

    boolean isInherited();
}
