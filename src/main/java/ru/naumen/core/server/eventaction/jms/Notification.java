package ru.naumen.core.server.eventaction.jms;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import ru.naumen.core.server.script.api.ICalendarEventApi;
import ru.naumen.core.shared.dto.DtObject;
import ru.naumen.metainfo.shared.elements.mail.ISendMailParameters;

public class Notification extends ScriptParametersSimple {
    ISendMailParameters parameters;
    Map<String, String> to;
    Map<String, String> cc;
    Set<Object> ccEmployee;
    Map<String, String> bcc;
    Set<Object> bccEmployee;
    Map<String, String> headers;
    String subject;
    boolean propagate = true;
    List<DtObject> attachments = Lists.newArrayList();
    List<ICalendarEventApi.ICalendarEvent> calendarEvents = new ArrayList<>();
    boolean useUpperCase = false;

    public Notification(ISendMailParameters parameters, Map<String, String> to, String subject, boolean useUpperCase) {}

    public List<DtObject> getAttachments() {
        return this.attachments;
    }

    public Map<String, String> getBcc() {
        return this.bcc;
    }

    public List<ICalendarEventApi.ICalendarEvent> getCalendarEvents() {
        return this.calendarEvents;
    }

    public Set<Object> getBccEmployee() {
        return this.bccEmployee;
    }

    public Map<String, String> getCc() {
        return this.cc;
    }

    public Set<Object> getCcEmployee() {
        return this.ccEmployee;
    }

    public Map<String, String> getHeaders() {
        return this.headers;
    }

    public ISendMailParameters getParameters() {
        return this.parameters;
    }

    public String getSubject() {
        return this.subject;
    }

    public Map<String, String> getTo() {
        return this.to;
    }

    public void setHeader(String name, String value) {
        this.headers.put(name, value);
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void addCalendarEvent(ICalendarEventApi.ICalendarEvent event) {
        this.calendarEvents.add(event);
    }

    public boolean isPropagate() {
        return this.propagate;
    }

    public void setPropagate(boolean propagate) {
        this.propagate = propagate;
    }

    public String toString() {
        return "";
    }
}
