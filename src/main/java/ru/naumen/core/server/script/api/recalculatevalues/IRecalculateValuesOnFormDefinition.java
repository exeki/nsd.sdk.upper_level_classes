
package ru.naumen.core.server.script.api.recalculatevalues;

import java.util.Collection;
import java.util.Map;

public interface IRecalculateValuesOnFormDefinition {
    String getChangedAttributeCode();

    Map<String, Object> getSubject();

    Collection<String> getAttributeCodes();

    Map<String, Collection<String>> getDependencyMap();

    Map<String, Collection<String>> getFiltrationDependencyMap();

    IRecalculateValuesOnFormDefinition changedAttributeCode(String var1);

    IRecalculateValuesOnFormDefinition subject(Map<String, Object> var1);

    IRecalculateValuesOnFormDefinition attributeCodes(Collection<String> var1);

    IRecalculateValuesOnFormDefinition dependencyMap(Map<String, Collection<String>> var1);

    IRecalculateValuesOnFormDefinition filtrationDependencyMap(Map<String, Collection<String>> var1);
}
