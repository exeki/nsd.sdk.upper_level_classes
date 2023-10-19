package ru.naumen.core.shared.timer;

import java.io.Serializable;

public abstract class AbstractTimerDto implements Serializable {
    private Status status;

    protected AbstractTimerDto() {
    }

    protected AbstractTimerDto(Status status) {
        this.status = status;
    }

    public Status getStatus() {
        return this.status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
