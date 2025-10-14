package ru.naumen.metainfo.shared;

public interface CoreClassFqn extends CoreFqn {
    char DELIMITER = '$';

    String getCase();

    String getId();

    CoreClassFqn fqnOfClass();

    default boolean isClass() {
        return false;
    }

    default boolean isSameClass( CoreClassFqn other) {
        return false;
    }

    String asString();
}
