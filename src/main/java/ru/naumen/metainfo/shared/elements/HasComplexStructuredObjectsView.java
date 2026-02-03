package ru.naumen.metainfo.shared.elements;

import ru.naumen.common.shared.Snapshotable;

public interface HasComplexStructuredObjectsView extends Snapshotable {
    String getComplexStructuredObjectsViewCode();

    void setComplexStructuredObjectsViewCode( String complexStructuredObjectsViewCode);
}
