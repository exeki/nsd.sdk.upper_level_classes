package ru.naumen.core.server.script.api;

import ru.naumen.common.shared.utils.IDateTimeInterval;
import ru.naumen.common.shared.utils.IHyperlink;
import ru.naumen.common.shared.utils.ISourceCode;
import ru.naumen.metainfo.shared.IAttrReference;
import ru.naumen.metainfo.shared.IClassFqn;

public interface IDocumentedTypesApi extends IDocumentedApi {
    IAttrReference newAttrReference(String fqn, String code);

    IClassFqn newClassFqn(String code);

    IDateTimeInterval newDateTimeInterval(long length, String intervalName);

    IHyperlink newHyperlink(String url);

    IHyperlink newHyperlink(String text, String url);

    ISourceCode newSourceCode(String text);

    ISourceCode newSourceCode(String text, String lang);
}
