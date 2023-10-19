package ru.naumen.core.server.rest;

import java.util.Collection;

public interface IRestFindOptions {
    IRestFindOptions limit(Integer var1);

    IRestFindOptions offset(Integer var1);

    IRestFindOptions attributes(Collection<String> var1);

    Collection<String> getResultAttributes();

    Integer getOffset();

    Integer getLimit();
}
