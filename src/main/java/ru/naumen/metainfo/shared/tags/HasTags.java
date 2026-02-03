package ru.naumen.metainfo.shared.tags;

import java.util.List;
import ru.naumen.common.shared.Snapshotable;

public interface HasTags extends Snapshotable {
    List<String> getTags();
}
