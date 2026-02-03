package ru.naumen.metainfo.shared.elements;

import java.util.Set;
import ru.naumen.metainfo.shared.CoreClassFqn;

public interface CoreAttributeType {
    String getCode();

    <T> T getProperty(String propertyCode);

    <T extends CoreClassFqn> Set<T> getPermittedTypes();

    boolean isSingleObjectLink();
}
