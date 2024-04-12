package ru.naumen.common.shared.utils;

import javax.annotation.CheckForNull;
abstract public class SourceCode implements ISourceCode {
    private String lang;
    private String text;

    abstract public void setLang(String lang);

    abstract public void setText(String text);

    public SourceCode() {}

    public SourceCode(String text) {}

    public SourceCode(@CheckForNull String text, @CheckForNull String lang) {}

    abstract public boolean equals(Object obj);

    abstract public String getLang();

    abstract public String getText();

    abstract public int hashCode();

    abstract public String toString();
}
