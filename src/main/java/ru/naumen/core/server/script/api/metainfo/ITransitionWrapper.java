package ru.naumen.core.server.script.api.metainfo;

public interface ITransitionWrapper {
    String getBeginState();

    String getEndState();

    String getTitle();

    boolean isEnabled();
}
