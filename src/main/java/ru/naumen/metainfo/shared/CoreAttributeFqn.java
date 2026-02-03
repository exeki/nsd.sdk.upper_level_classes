package ru.naumen.metainfo.shared;

public interface CoreAttributeFqn extends CoreFqn {
    CoreClassFqn getClassFqn();

    String getCode();
}
