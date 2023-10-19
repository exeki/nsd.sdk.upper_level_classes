package ru.naumen.common.shared.utils;

import javax.annotation.Nullable;
import java.util.Set;

public interface ISProperties {
    @Nullable
    <T> T getProperty(String var1);

    <T> T getProperty(String var1, @Nullable T var2);

    boolean hasProperty(String var1);

    Set<String> propertyNames();

    void removeProperty(String var1) throws UnsupportedOperationException;

    void setAll(ISProperties var1);

    <T> void setProperty(String var1, @Nullable T var2) throws UnsupportedOperationException;
}
