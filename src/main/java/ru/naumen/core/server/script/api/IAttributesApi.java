package ru.naumen.core.server.script.api;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import ru.naumen.core.server.script.ScriptApi;
import ru.naumen.core.server.script.api.possiblevalues.IPossibleValuesContainer;
import ru.naumen.core.server.script.api.possiblevalues.IPossibleValuesDefinition;
import ru.naumen.core.server.script.api.recalculatevalues.IRecalculateValuesOnFormContainer;
import ru.naumen.core.server.script.api.recalculatevalues.IRecalculateValuesOnFormDefinition;

public interface IAttributesApi extends ScriptApi {
    void recalculateCompositeAttributeValue(String var1, String var2);

    void recalculateCompositeAttributeValuesOfMetaClass(Object var1, String var2);

    void recalculateRulesSettingsValue(Object var1, List<String> var2);

    void recalculateRulesSettingsValueOfMetaClass(Object var1, List<String> var2);

    void updateAllBackTimerStates();

    boolean updateAllSemanticFiltrationIndex();

    boolean updateSemanticFiltrationIndex(Object var1, String var2);

    Object getDefaultValue(String var1, Map<String, Object> var2);

    IPossibleValuesDefinition definePossibleValues();

    IPossibleValuesContainer listPossibleValues(String var1, Map<String, Object> var2);

    IPossibleValuesContainer listPossibleValues(String var1, Map<String, Object> var2, IPossibleValuesDefinition var3);

    IRecalculateValuesOnFormDefinition defineRecalculateValuesOnForm();

    IRecalculateValuesOnFormContainer recalculateValuesOnForm(IRecalculateValuesOnFormDefinition var1);

    Map<String, Collection<String>> getDependencyMap(Object var1, Collection<String> var2);

    Map<String, Collection<String>> getFiltrationDependencyMap(Object var1, Collection<String> var2);
}
