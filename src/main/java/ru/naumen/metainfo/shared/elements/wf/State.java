package ru.naumen.metainfo.shared.elements.wf;

import com.google.gwt.user.client.rpc.IsSerializable;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import ru.naumen.metainfo.shared.ClassFqn;
import ru.naumen.metainfo.shared.elements.HasDeclaredMetaClass;
import ru.naumen.metainfo.shared.elements.HasDescription;
import ru.naumen.metainfo.shared.elements.HasHardcoded;
import ru.naumen.metainfo.shared.elements.workflow.CoreState;

public interface State extends HasDescription, HasHardcoded, HasDeclaredMetaClass, StateLite, CoreState {

    Set<Action> getActions(boolean isPreActions);

    List<String> getActionsOrder(boolean isPreActions);

    Boolean getChangeResponsibleButtonVisible();

    Set<Condition> getConditions(boolean isPreConditions);

    Set<Action> getDeclaredActions(boolean isPreActions);

    Set<Condition> getDeclaredConditions(boolean isPreConditions);

    String getDescription();

    ClassFqn getMetaClass();

    Set<Action> getPostActions();

    List<String> getPostActionsOrder();

    Set<Condition> getPostConditions();

    Set<Action> getPreActions();

    List<String> getPreActionsOrder();

    Set<Condition> getPreConditions();

    StateResponsible getResponsible();

    ResponsibleType getResponsibleType();

    Boolean getShowAttributesDescription();

    Boolean isEndState();

    Boolean isDisableEditableEndState();

    List<Action> getSortedActions(boolean isPreActions);

    StateSetting getStateSetting(String settingCode);

    List<StateSetting> getStateSettings();

    Map<String, StateSetting> getStateSettings(Collection<String> attrCodes);

    boolean isInherits();

    public static enum ResponsibleType implements IsSerializable {
        EMPLOYEE,
        EMPLOYEE_AND_TEAM,
        TEAM;

        public boolean isAllowed(Object team, Object employee) {
            return false;
        }

        public boolean isEmployeeAllowed() {
            return false;
        }

        public boolean isTeamAllowed() {
            return false;
        }
    }
}
