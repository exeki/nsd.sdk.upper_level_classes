package ru.naumen.core.shared;

import java.util.Date;

public interface ICoreRemovable extends IUUIDIdentifiable {
    Date getRemovalDate();

    boolean isRemoved();

    void setRemovalDate(Date removalDate);

    void setRemoved(boolean removed);
}
