package ru.naumen.core.server.rest;

import java.util.List;

public interface IFormBuilder {
    IFormBuilder ask(List<String> var1);

    IFormBuilder ask(String var1);

    String build();

    IFormBuilder caption(String var1);

    IFormBuilder submit(String var1);
}
