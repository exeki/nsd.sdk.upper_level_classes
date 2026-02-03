package ru.naumen.metainfo.shared.elements;

import ru.naumen.core.shared.HasCode;
import ru.naumen.metainfo.shared.segment.MetainfoSegment;

public abstract class HasCodeIdentityBase extends MetainfoSegment implements HasCode {

    abstract public String getSegmentID();

    abstract public String getSegmentType();

    abstract public boolean isDetachableSegment();
}
