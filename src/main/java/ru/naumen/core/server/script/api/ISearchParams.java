package ru.naumen.core.server.script.api;

public interface ISearchParams {
    boolean getIgnoreCase();

    int getLimit();

    int getOffset();

    ISearchParams ignoreCase();

    ISearchParams limit(int var1);

    ISearchParams offset(int var1);
}
