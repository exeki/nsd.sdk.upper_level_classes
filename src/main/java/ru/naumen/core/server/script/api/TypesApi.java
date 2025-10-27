package ru.naumen.core.server.script.api;

import java.util.Map;
import javax.annotation.Nullable;
import ru.naumen.common.shared.utils.Color;
import ru.naumen.common.shared.utils.DateTimeInterval;
import ru.naumen.common.shared.utils.Hyperlink;
import ru.naumen.common.shared.utils.ILocalizedText;
import ru.naumen.common.shared.utils.LocalizedText;
import ru.naumen.common.shared.utils.SourceCode;
import ru.naumen.core.shared.IUUIDIdentifiable;
import ru.naumen.core.shared.dto.DtObject;
import ru.naumen.metainfo.shared.ClassFqn;
import ru.naumen.metainfo.shared.IAttrReference;

public class TypesApi implements ITypesApi {

    public TypesApi() {

    }

    public IAttrReference newAttrReference(String fqn, String code) {
        return null;
    }

    public ClassFqn newClassFqn(String code) {
        return null;
    }

    public ClassFqn newClassFqn(String id, String caseCode) {
        return null;
    }

    public Color newColor(int intValue) {
        return null;
    }

    public Color newColor(String value) {
        return null;
    }

    public DateTimeInterval newDateTimeInterval(long length, String intervalName) {
        return null;
    }

    public Hyperlink newHyperlink(String url) {
        return null;
    }

    public Hyperlink newHyperlink(String text, String url) {
        return null;
    }

    public ILocalizedText newLocalizedText(Map<String, String> localizedStrings) {
        return new LocalizedText(localizedStrings);
    }

    public ILocalizedText newLocalizedText(String locale, String text) {
        return null;
    }

    public SourceCode newSourceCode(String text) {
        return null;
    }

    public SourceCode newSourceCode(String text, String lang) {
        return null;
    }

    public IUUIDIdentifiable newTreeDtObject(Object parent) {
        return null;
    }

    public IUUIDIdentifiable newTreeDtObject(Object parent, Object employee) {
        return null;
    }

    @Nullable
    private DtObject convertToDtObject(@Nullable Object value) {
        return null;
    }
}
