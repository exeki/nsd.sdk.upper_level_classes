package ru.naumen.core.server.eventaction.jms;

import java.util.Map;
import java.util.Set;

public interface EventActionNotificationScriptParameters {
    Map<String, Object> getScriptParams();

    Set<Object> getToEmployee();

    Set<Object> getToRemoveEmployee();
}
