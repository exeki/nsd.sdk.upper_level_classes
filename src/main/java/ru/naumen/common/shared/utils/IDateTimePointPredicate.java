package ru.naumen.common.shared.utils;

public interface IDateTimePointPredicate {
    DateTimePart getName();

    Integer getValue();

    DateTimeComparisonOperator getComparisonOperator();
}
