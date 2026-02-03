package ru.naumen.metainfo.shared.elements;

import ru.naumen.common.shared.Snapshotable;
import ru.naumen.metainfo.shared.Fqn;

public interface HasFqn extends Snapshotable, CoreHasFqn {

    Fqn getFqn();

}
