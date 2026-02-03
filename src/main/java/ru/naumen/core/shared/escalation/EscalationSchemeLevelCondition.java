package ru.naumen.core.shared.escalation;

import com.google.gwt.user.client.rpc.IsSerializable;
import java.io.Serializable;

import ru.naumen.common.shared.utils.DateTimeInterval;
import ru.naumen.common.shared.utils.IProperties;
import ru.naumen.core.shared.common.Formatters;

abstract public class EscalationSchemeLevelCondition implements Serializable, IsSerializable {

    abstract public String getCondition();

    abstract public String getFormattedValue(Formatters formatters);

    abstract public boolean isExpired(long elapsed, DateTimeInterval resolutionTime);

    abstract public void setCondition(String condition);

    abstract public void setValueToProperties(IProperties properties, String code);

    public interface EscalationSchemeLevelConditionCode {
        String TIME_PART_EXCEEDED = "timePartExceeded";
        String TIME_EXCEEDED = "timeExceeded";
    }
}
