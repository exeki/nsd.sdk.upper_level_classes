
package ru.naumen.metainfo.shared.elements.wf;

import java.io.Serializable;

import ru.naumen.core.shared.HasClone;
import ru.naumen.metainfo.shared.elements.HasCodeIdentityBase;

abstract public class TransitionItem extends HasCodeIdentityBase implements Serializable, HasClone {


    abstract public String getCode();

    abstract public ViewItem getView();

    abstract public String getTitle();

    abstract public boolean isRequired();

    abstract public boolean isRequiredEditable();

    abstract public boolean isHide();

    abstract public void setCode(String code);

    abstract public TransitionItem setView(ViewItem view);

    abstract public TransitionItem setRequired(boolean required);

    abstract public void setRequiredEditable(boolean requiredEditable);

    abstract public TransitionItem setTitle(String title);

    abstract public boolean isInherited();

    abstract public TransitionItem setInherited(boolean inherited);

    abstract public void setHide(boolean hide);

    public String getSegmentID() {
        return "";
    }

    public String getSegmentType() {
        return "";
    }

    public boolean isDetachableSegment() {
        return false;
    }

    public Object clone() {
        return null;
    }
}
