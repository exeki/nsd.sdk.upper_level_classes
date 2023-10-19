package ru.naumen.core.server.script.api.metainfo;

import java.util.Collection;

public interface IWorkflowWrapper {
    IActionWrapper getAction(String var1, String var2);

    IConditionWrapper getCondition(String var1, String var2);

    IStateWrapper getEndState();

    IStateWrapper getOriginalState();

    IStateWrapper getState(String var1);

    Collection<IStateWrapper> getStates();

    ITransitionWrapper getTransition(String var1, String var2);

    Collection<ITransitionWrapper> getTransitions();

    boolean isInherit();

    boolean isTransitionExists(IStateWrapper var1, IStateWrapper var2);

    boolean isTransitionExists(String var1, String var2);
}
