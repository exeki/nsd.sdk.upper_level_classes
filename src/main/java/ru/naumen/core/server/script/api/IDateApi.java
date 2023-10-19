package ru.naumen.core.server.script.api;

import ru.naumen.common.shared.utils.IDateTimePointPredicate;
import ru.naumen.common.shared.utils.IDateTimePointPredicates;
import ru.naumen.core.server.script.ScriptApi;
import ru.naumen.core.shared.datetime.IDatePredicate;

import javax.annotation.Nullable;
import java.util.Date;
import java.util.List;

public interface IDateApi extends ScriptApi {
    Date addDays(@Nullable Date var1, int var2);

    Date addMonths(@Nullable Date var1, int var2);

    Date addYears(@Nullable Date var1, int var2);

    IDatePredicate filter();

    int getNumberOfDayOfMonth(Date var1);

    int getNumberOfDayOfMonth(Date var1, @Nullable String var2);

    int getNumberOfDayOfWeek(Date var1);

    int getNumberOfDayOfWeek(Date var1, @Nullable String var2);

    int getNumberOfMonth(Date var1);

    int getNumberOfMonth(Date var1, @Nullable String var2);

    int getNumberOfWeekOfMonth(Date var1);

    int getNumberOfWeekOfMonth(Date var1, @Nullable String var2);

    IDateTimePointPredicates createDateTimePointPredicates(List<IDateTimePointPredicate> var1);

    IDateTimePointPredicate createDateTimePointPredicate(String var1, Integer var2, String var3);

    IDateTimePointPredicates createDateTimePointPredicates(List<Object>... var1);
}
