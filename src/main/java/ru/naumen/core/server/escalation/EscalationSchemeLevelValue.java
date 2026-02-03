package ru.naumen.core.server.escalation;

import com.google.gwt.user.client.rpc.IsSerializable;

import java.io.Serializable;
import java.util.ArrayList;


import ru.naumen.core.shared.escalation.EscalationSchemeLevelCondition;


abstract public class EscalationSchemeLevelValue implements Serializable, IsSerializable {

    abstract public ArrayList<String> getActions();

    abstract public EscalationSchemeLevelCondition getCondition();

    abstract public int getLevel();

    abstract public boolean isActionExecuted();

    abstract public void setActionExecuted(boolean actionExecuted);

    abstract public void setCondition(EscalationSchemeLevelCondition condition);

    abstract public void setEventActions(ArrayList<String> actions);

    abstract public void setLevel(int level);
}
