package ru.naumen.metainfo.shared.elements;

import java.util.Map;
import ru.naumen.common.shared.Snapshotable;

public interface HasSearchable extends Snapshotable {
    String getSearchAlias();

    String getSearchAnalyzer();

    Float getSearchBoost();

    Boolean isExtendedSearchableForLicensed();

    Boolean isExtendedSearchableForNotLicensed();

    Map<String, String> getSearchAnalyzers();

    Boolean isSimpleSearchableForLicensed();

    Boolean isSimpleSearchableForNotLicensed();

}
