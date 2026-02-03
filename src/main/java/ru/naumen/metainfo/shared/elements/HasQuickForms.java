package ru.naumen.metainfo.shared.elements;

import ru.naumen.common.shared.Snapshotable;

public interface HasQuickForms extends Snapshotable {
    String getQuickAddFormCode();

    String getQuickEditFormCode();

    void setQuickAddFormCode(String formCode);

    void setQuickEditFormCode(String formCode);
}
