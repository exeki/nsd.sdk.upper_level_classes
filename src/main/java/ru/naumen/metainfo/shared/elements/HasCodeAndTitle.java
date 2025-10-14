package ru.naumen.metainfo.shared.elements;

import java.util.Comparator;
import java.util.function.Function;
import ru.naumen.core.shared.HasCode;
import ru.naumen.core.shared.ITitled;

public interface HasCodeAndTitle extends HasCode, ITitled {
    Function<HasCodeAndTitle, String> TITLE_AND_CODE_FORMATTER = (hasCodeAndTitle) -> {
        return "";
    };
    Comparator<HasCodeAndTitle> TITLE_CODE_COMPARATOR = null;

    default String formattedTitle() {
        return "";
    }
}
