package ru.naumen.metainfo.shared.elements;

public interface HasSystemEditable extends HasEditable {
    Boolean isSystemEditable();

    Boolean isWithDefaultValue();
}
