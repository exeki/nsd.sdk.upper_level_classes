package ru.naumen.core.shared.timer;

import java.util.Date;

abstract public class BackTimerDto extends AbstractTimerDto {

    abstract public Long getAllowance();

    abstract public Date getAllowanceStart();

    abstract public Date getDeadLineTime();

    abstract public Long getElapsedFromOverdue();

    abstract public String toString();
}
