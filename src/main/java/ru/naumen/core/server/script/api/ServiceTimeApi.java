package ru.naumen.core.server.script.api;

import java.util.Date;
import java.util.List;
import ru.naumen.core.server.script.api.servicetime.IServiceTimeExclusion;
import ru.naumen.core.server.script.spi.IScriptDtObject;

public class ServiceTimeApi implements IServiceTimeApi {


    public void activateDraft(String serviceTimeUuid) {

    }

    public IServiceTimeExclusion createExclusion(String serviceTimeUuid, Date exclusionDate) {
        return null;
    }

    public IServiceTimeExclusion createExclusion(String serviceTimeUuid, Date exclusionDate, Long startTime, Long endTime) {
        return null;
    }

    public IServiceTimeExclusion createExclusionApproved(String serviceTimeUuid, Date exclusionDate) {
        return null;
    }

    public IServiceTimeExclusion createExclusionApproved(String serviceTimeUuid, Date exclusionDate, Long startTime, Long endTime) {
        return null;
    }

    public IServiceTimeExclusion editExclusion(String exclusionUuid, Long startTime, Long endTime) {
        return null;
    }

    public IServiceTimeExclusion editExclusionApproved(String exclusionUuid, Long startTime, Long endTime) {
        return null;
    }

    public List<IServiceTimeExclusion> getExclusions(String serviceTimeUuid) {
        return null;
    }

    public IScriptDtObject createPersonalServiceTime(String code, Object serviceTime, Object employee, boolean copyExclusionsAndPeriods) {
        return null;
    }

    public IScriptDtObject createPersonalServiceTime(Object serviceTime, Object employee, boolean copyExclusionsAndPeriods) {
        return null;
    }

    public IScriptDtObject getPersonalServiceTime(Object employee) {
        return null;
    }

    public boolean deletePersonalServiceTime(Object employee) {
        return false;
    }
}
