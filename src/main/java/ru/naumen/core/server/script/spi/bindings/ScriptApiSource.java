package ru.naumen.core.server.script.spi.bindings;

@FunctionalInterface
public interface ScriptApiSource {
    Object get(String var1);
}
