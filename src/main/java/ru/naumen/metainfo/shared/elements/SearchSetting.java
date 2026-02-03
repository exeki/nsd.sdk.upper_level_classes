package ru.naumen.metainfo.shared.elements;

import java.util.Map;
import ru.naumen.core.shared.HasCode;
import ru.naumen.core.shared.ITitled;
import ru.naumen.metainfo.shared.ClassFqn;

public interface SearchSetting extends HasSearchable, ITitled, HasCode, HasDeclaredMetaClass {
    String getAttrCode();

    String getAttrTypeCode();

    ClassFqn getMetaClass();

    Map<String, String> getSearchAliasMap();

    void setCode(String code);

    void setMetaClass(ClassFqn fqn);
}
