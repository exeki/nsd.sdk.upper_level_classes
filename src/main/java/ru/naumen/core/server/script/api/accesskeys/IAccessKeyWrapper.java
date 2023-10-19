package ru.naumen.core.server.script.api.accesskeys;

import java.util.Date;

public interface IAccessKeyWrapper {
    Date getCreationDate();

    Date getDeadline();

    IAccessKeyWrapper setDeadline(Date var1);

    String getDescription();

    IAccessKeyWrapper setDescription(String var1);

    Date getLastUsageDate();

    AccessKeyType getType();

    String getUsername();

    String getUuid();

    boolean isActive();

    IAccessKeyWrapper setActive(boolean var1);

    IAccessKeyWrapper setDeadlineDays(int var1);

    IAccessKeyWrapper setDeadlineHours(int var1);

    IAccessKeyWrapper setDeadlineMinutes(int var1);

    IAccessKeyWrapper setDisposable();

    IAccessKeyWrapper setReusable();
}
