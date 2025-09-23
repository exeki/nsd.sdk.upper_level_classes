package ru.naumen.core.server.eventaction.jms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ScriptParametersSimple implements EventActionNotificationScriptParameters {
    Map<String, Object> scriptParams = new HashMap<>();
    Set<Object> toEmployee = new HashSet<>();
    Set<Object> toRemoveEmployee = new HashSet<>();

    public ScriptParametersSimple() {
    }

    public Map<String, Object> getScriptParams() {
        return this.scriptParams;
    }

    public Set<Object> getToEmployee() {
        return this.toEmployee;
    }

    public Set<Object> getToRemoveEmployee() {
        return this.toRemoveEmployee;
    }

    public void setScriptParams(Map<String, Object> scriptParams) {
        this.scriptParams = scriptParams;
    }

    public void setToEmployee(Set<Object> toEmployee) {
        this.toEmployee = toEmployee;
    }

    public void setToRemoveEmployee(Set<Object> toRemoveEmployee) {
        this.toRemoveEmployee = toRemoveEmployee;
    }
}
