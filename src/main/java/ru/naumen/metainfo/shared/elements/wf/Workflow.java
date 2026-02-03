
package ru.naumen.metainfo.shared.elements.wf;

import java.util.Collection;
import java.util.List;

import ru.naumen.metainfo.shared.elements.workflow.CoreWorkflow;

public interface Workflow extends WorkflowLite, CoreWorkflow {


    Action getAction(String stateCode, String actCode);

    Collection<Transition> getActiveTransitions();

    Condition getCondition(String stateCode, String conditionCode);

    State getEndState();

    String getEndStateCode();

    State getOriginalState();

    String getOriginalStateCode();

    State getState(String code);

    List<State> getStates();

    void checkStateExists(String from, Collection<String> states);

    Transition getTransition(String from, String to);

    Collection<Transition> getTransitions();

    boolean isInherit();
}
