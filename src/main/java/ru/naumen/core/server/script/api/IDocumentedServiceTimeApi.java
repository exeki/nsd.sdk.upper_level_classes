package ru.naumen.core.server.script.api;

import java.util.Date;
import java.util.List;
import ru.naumen.core.server.script.api.servicetime.IServiceTimeExclusion;

public interface IDocumentedServiceTimeApi extends IDocumentedApi {
    void activateDraft(String serviceTimeUuid);

    IServiceTimeExclusion createExclusion(String serviceTimeUuid, Date exclusionDate);

    IServiceTimeExclusion createExclusion(String serviceTimeUuid, Date exclusionDate, Long startTime, Long endTime);

    IServiceTimeExclusion createExclusionApproved(String serviceTimeUuid, Date exclusionDate);

    IServiceTimeExclusion createExclusionApproved(String serviceTimeUuid, Date exclusionDate, Long startTime, Long endTime);

    IServiceTimeExclusion editExclusion(String exclusionUuid, Long startTime, Long endTime);

    IServiceTimeExclusion editExclusionApproved(String exclusionUuid, Long startTime, Long endTime);

    List<IServiceTimeExclusion> getExclusions(String serviceTimeUuid);
}
