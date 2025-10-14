package ru.naumen.core.shared;

public interface IChild<T extends IUUIDIdentifiable> extends IUUIDIdentifiable {
    T getParent();

    void setParent(T parent);
}
