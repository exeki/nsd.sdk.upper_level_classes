package ru.naumen.metainfo.shared.segment;

public abstract class MetainfoSegment {

    public abstract String getSegmentID();

    public abstract String getSegmentType();

    public abstract boolean isDetachableSegment();

}
