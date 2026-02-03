
package ru.naumen.metainfo.shared.elements;

import java.util.Collection;
import ru.naumen.common.shared.Snapshotable;

public interface HasExportNDAP extends Snapshotable {

    Collection<String> getRelatedAttrsToExport();

    Boolean isExportNDAP();

    void setExportNDAP(boolean exportNDAP);

    void setRelatedAttrsToExport(Collection<String> relatedAttrsToExport);
}
