package ru.naumen.common.shared.utils;

import java.io.Serializable;

public interface ISourceCode extends Serializable {
    String getLang();

    String getText();
}
