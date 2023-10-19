package ru.naumen.common.shared.utils;

import javax.annotation.Nullable;
import java.util.Collection;

abstract public class DateTimeInterval implements IDateTimeInterval {
    abstract public long calculateLengthAndInterval(@Nullable Collection<String> intervalAvailableUnits);

    abstract public boolean equals(Object obj);

    abstract public String getIntervalName();

    @Nullable
    abstract public Long getLength();

    /** @deprecated */
    @Deprecated
    abstract public Long getMiliseconds();
    abstract public Long getMs();
    abstract public int hashCode();

    abstract public DateTimeInterval multiply(double multiplier);

    abstract public DateTimeInterval multiply(long multiplier) ;

    abstract public void setIntervalName(@Nullable String intervalName) ;

    abstract public void setMs(Long ms);

    abstract public Long toMiliseconds();

    abstract public int toCalendarField();

    abstract public String toString();
}
