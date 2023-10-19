package ru.naumen.core.shared.datetime;

import javax.annotation.Nullable;
import java.util.Date;

public interface IRestriction<T> {
    @Nullable
    T getData();

    boolean validate(@Nullable Date var1, boolean var2);
}
