package ru.naumen.core.shared;

import java.util.List;
import java.util.function.Function;
import ru.naumen.metainfo.shared.ui.LocalizedString;

public interface IHasI18nDescription {
    Function<IHasI18nDescription, List<LocalizedString>> EXTRACTOR = IHasI18nDescription::getDescription;

    List<LocalizedString> getDescription();
}
