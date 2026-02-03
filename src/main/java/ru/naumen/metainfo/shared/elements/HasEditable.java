package ru.naumen.metainfo.shared.elements;

import com.google.common.base.Predicate;
import ru.naumen.common.shared.Snapshotable;

public interface HasEditable extends Snapshotable {

    Boolean isEditable();
}
