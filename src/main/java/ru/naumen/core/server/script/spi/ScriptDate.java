package ru.naumen.core.server.script.spi;

import java.util.Date;

abstract public class ScriptDate extends Date {

    abstract public boolean equals(Object obj);

    abstract public int hashCode();

    abstract public void setDate(int date);
    abstract public void setHours(int hours);

    abstract public void setMinutes(int minutes);

    abstract public void setMonth(int month);

    abstract public void setSeconds(int seconds);

    abstract public void setTime(long time);

    abstract public void setYear(int year);

    abstract public String toString();
}