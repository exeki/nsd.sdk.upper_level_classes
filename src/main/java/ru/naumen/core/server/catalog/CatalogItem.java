package ru.naumen.core.server.catalog;

import java.util.Date;
import java.util.List;
import java.util.Map;

import ru.naumen.common.shared.utils.Color;
import ru.naumen.common.shared.utils.ILocalizedText;
import ru.naumen.common.shared.utils.LocalizedText;
import ru.naumen.core.bo.CoreCatalogItem;
import ru.naumen.core.server.bo.AbstractSystemObject;
import ru.naumen.core.shared.HasClone;

public abstract class CatalogItem<T extends CatalogItem<T>> extends AbstractSystemObject implements ICatalogItem<T>, HasClone, CoreCatalogItem {
    public static final String CLASS_ID = "catalogItem";
    private static final long serialVersionUID = -324137814154989169L;
    private Date removalDate;
    private boolean removed;
    private LocalizedText title;
    private String code;
    private boolean folder = false;
    private T parent;
    private long position = 0L;
    private Color color;
    private List<T> children;

    public CatalogItem() {
    }

    public CatalogItem<T> clone() {
        return null;
    }

    public List<T> getChildren() {
        return this.children;
    }

    public String getCode() {
        return this.code;
    }

    public Color getColor() {
        return this.color;
    }

    public String getDisplayableTitle() {
        return "";
    }

    public ILocalizedText getLocalizedTitle() {
        return this.title;
    }

    public T getParent() {
        return this.parent;
    }

    public long getPosition() {
        return this.position;
    }

    public Date getRemovalDate() {
        return this.removalDate;
    }

    public String getTitle() {
        return "";
    }

    public boolean isFolder() {
        return this.folder;
    }

    public boolean isRemoved() {
        return this.removed;
    }

    public void setChildren(List<T> children) {
    }

    public void setCode(String code) {
    }

    public void setColor(Color color) {
    }

    public void setFolder(boolean folder) {
    }

    public void setLocalizedTitle(ILocalizedText title) {
    }

    public void setLocalizedTitle(Map<String, String> titles) {
    }

    public void setLocalizedTitle(String locale, String title) {
    }

    public void setParent(T parent) {
    }

    public void setPosition(long position) {
    }

    public void setRemovalDate(Date removalDate) {
    }

    public void setRemoved(boolean removed) {
    }

    public void setTitle(String title) {
    }
}
