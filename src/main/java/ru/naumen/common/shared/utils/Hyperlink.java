package ru.naumen.common.shared.utils;

import com.google.gwt.user.client.rpc.IsSerializable;
import ru.naumen.core.shared.CoreHyperLink;

public class Hyperlink implements IHyperlink, IsSerializable, CoreHyperLink {
    private String text;
    private String url;

    public Hyperlink() {
    }

    public Hyperlink(String text,String url) {
    }

    public boolean equals(Object obj) {
        return false;
    }

    public String getText() {
        return null;
    }

    public String getURL() {
        return null;
    }

    public String getUrl() {
        return null;
    }

    public void setUrl(String url) {
    }

    public void setText(String text) {
    }

    public int hashCode() {
        return 1;
    }

    public String toString() {
        return null;
    }
}
