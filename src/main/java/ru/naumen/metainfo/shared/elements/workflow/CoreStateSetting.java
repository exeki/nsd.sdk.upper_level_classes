package ru.naumen.metainfo.shared.elements.workflow;

public interface CoreStateSetting {
    boolean isCanView();

    boolean isCanEdit();

    int getPreFill();

    int getPostFill();

    boolean isRequiredInState();

    String getStateCode();

    String getCode();
}
