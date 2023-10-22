package ru.naumen.core.server.script.api.possiblevalues;

import java.util.Map;
import javax.annotation.Nullable;

public interface IPossibleValuesDefinition {
    @Nullable
    Object getParent();

    @Nullable
    String getSearchString();

    @Nullable
    Integer getLimit();

    @Nullable
    Integer getOffset();

    @Nullable
    Map<String, Integer> getTypeOffsets();

    IPossibleValuesDefinition parent(@Nullable Object var1);

    IPossibleValuesDefinition searchString(@Nullable String var1);

    IPossibleValuesDefinition limit(int var1);

    IPossibleValuesDefinition offset(int var1);

    IPossibleValuesDefinition typeOffsets(@Nullable Map<String, Integer> var1);
}
