package ru.naumen.core.shared;

import ru.naumen.metainfo.shared.ui.LocalizedString;
import java.util.List;

public interface IHasI18nDocumentation {

    List<LocalizedString> getDocumentation();
}
