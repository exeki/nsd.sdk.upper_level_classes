package ru.naumen.common.shared.utils;

import com.google.gwt.user.client.rpc.IsSerializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LocalizedText implements ILocalizedText, IsSerializable, Map<String, String> {

    private static  long serialVersionUID = -8420718718833464078L;
    private  transient Map<String, String> values;

    public LocalizedText() {
        this.values = new HashMap();
    }

    public LocalizedText(ILocalizedText localizedText) {
        return;
    }

    public LocalizedText(Map<String, String> map) {
    }

    public LocalizedText(String locale, String value) {
    }

    public Map<String, String> asMap() {
        return this;
    }

    public void clear() {
    }

    public boolean containsKey(Object locale) {
        return false;
    }

    public boolean containsValue(Object locale) {
        return false;
    }

    public Set<Map.Entry<String, String>> entrySet() {
        return null;
    }

    public boolean equals(Object obj) {
        return false;
    }

    public String get(Object locale) {
        return "";
    }

    public String getClient() {
        return "";
    }

    public String getEn() {
        return "";
    }

    public String getRu() {
        return "";
    }

    public String getDe() {
        return "";
    }

    public String getUk() {
        return "";
    }

    public String getPl() {
        return "";
    }

    public String getText(String locale) {
        return "";
    }

    public int hashCode() {
        return 1;
    }

    public boolean isEmpty() {
        return false;
    }

    public Set<String> keySet() {
        return null;
    }


    public String put(String locale, String value) {
        return "";
    }

    public void putAll(Map<? extends String, ? extends String> localizedStrings) {
    }

    public String remove(Object object) {
        return "";
    }

    public void setClient(String value) {
    }

    public void setEn(String value) {
    }

    public void setFromMap(Map<String, String> localizedText) {
    }

    public void setRu(String value) {
    }

    public void setDe(String value) {
    }

    public void setUk(String value) {
    }

    public void setPl(String value) {
    }

    public void setText(String locale, String value) {
    }

    public int size() {
        return 1;
    }

    public String toString() {
        return "";
    }

    public Collection<String> values() {
        return null;
    }

    private boolean equalsOnLocale(LocalizedText localizedText, String locale) {
        return false;
    }

    private String getWithoutDefault(String locale) {
        return "";
    }
}
