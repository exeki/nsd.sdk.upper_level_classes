package ru.naumen.common.shared.utils;

import java.io.Serializable;

public interface IDateTimeInterval extends Serializable {
    IInterval getInterval();

    Long getLength();

    @Deprecated
    Long getMiliseconds();

    IDateTimeInterval multiply(double var1);

    IDateTimeInterval multiply(long var1);

    Long toMiliseconds();

    interface IInterval extends Serializable {
        int getCode();

        long getFactor();

        String name();
    }
}
