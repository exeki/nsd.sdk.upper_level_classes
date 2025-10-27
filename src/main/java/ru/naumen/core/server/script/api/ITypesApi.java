package ru.naumen.core.server.script.api;

import java.util.Map;
import ru.naumen.common.shared.utils.IColor;
import ru.naumen.common.shared.utils.ILocalizedText;
import ru.naumen.core.server.script.ScriptApi;
import ru.naumen.core.shared.IUUIDIdentifiable;
import ru.naumen.metainfo.shared.IClassFqn;

public interface ITypesApi extends ScriptApi, IDocumentedTypesApi {
    IClassFqn newClassFqn(String id, String caseCode);

    IColor newColor(int intValue);

    IColor newColor(String value);

    ILocalizedText newLocalizedText(String locale, String text);

    ILocalizedText newLocalizedText(Map<String, String> localizedStrings);

    IUUIDIdentifiable newTreeDtObject(Object parent);

    IUUIDIdentifiable newTreeDtObject(Object parent, Object employee);
}
