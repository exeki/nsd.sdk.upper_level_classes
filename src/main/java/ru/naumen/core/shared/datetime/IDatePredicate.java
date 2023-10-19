package ru.naumen.core.shared.datetime;

import java.util.Date;
import java.util.List;

public interface IDatePredicate {
    <D extends Date> IRestriction after(D var1);

    <D extends Date> IRestriction after(D var1, boolean var2);

    IRestriction and(IRestriction... var1);

    IRestriction and(List<IRestriction> var1);

    <D extends Date> IRestriction before(D var1);

    <D extends Date> IRestriction before(D var1, boolean var2);

    <D extends Date> IRestriction between(D var1, D var2);

    <D extends Date> IRestriction between(D var1, D var2, boolean var3);

    IRestriction dayOfWeek(int var1);

    <D extends Date> IRestriction equals(D var1);

    <D extends Date> IRestriction equals(D var1, boolean var2);

    <D extends Date> IRestriction in(List<D> var1);

    <D extends Date> IRestriction in(List<D> var1, boolean var2);

    IRestriction inServiceTime(String var1);

    IRestriction inServiceTime(String var1, boolean var2);

    IRestriction inTime(long var1, long var3);

    IRestriction isNull();

    <D extends Date> IRestriction isNull(D var1);

    IRestriction not(IRestriction var1);

    IRestriction notNull();

    <D extends Date> IRestriction notNull(D var1);

    IRestriction or(IRestriction... var1);

    IRestriction or(List<IRestriction> var1);
}
