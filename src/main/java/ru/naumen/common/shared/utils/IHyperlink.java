package ru.naumen.common.shared.utils;

import java.io.Serializable;

public interface IHyperlink extends Serializable {
    String getText();

    String getURL();
}
