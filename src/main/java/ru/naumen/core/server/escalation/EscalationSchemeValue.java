
package ru.naumen.core.server.escalation;

import com.google.gwt.user.client.rpc.IsSerializable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import ru.naumen.core.shared.HasCode;
import ru.naumen.core.shared.IHasI18nDescription;
import ru.naumen.core.shared.IHasI18nTitle;
import ru.naumen.metainfo.shared.ClassFqn;
import ru.naumen.metainfo.shared.segment.MetainfoSegment;
import ru.naumen.metainfo.shared.ui.LocalizedString;


abstract public class EscalationSchemeValue extends MetainfoSegment implements IsSerializable, Serializable, HasCode, IHasI18nTitle, IHasI18nDescription {


    abstract public String getCode();

    abstract public List<LocalizedString> getDescription();

    abstract public String getSegmentID();

    abstract public String getSegmentType();

    abstract public boolean isDetachableSegment();


    abstract public ArrayList<EscalationSchemeLevelValue> getLevels();


    abstract public String getSingleDescription();


    abstract public String getState();


    abstract public ArrayList<ClassFqn> getTargetTypes();


    abstract public String getTimerCode();


    abstract public ArrayList<LocalizedString> getTitle();

    abstract public void setCode(String code);

    abstract public void setLevels(ArrayList<EscalationSchemeLevelValue> levels);

    @Deprecated
    abstract public void setSingleDescription(String description);

    abstract public void setState(String state);

    abstract public void setTargetTypes(ArrayList<ClassFqn> targetTypes);

    abstract public void setTimerCode(String timerCode);

    abstract public void setTitle(ArrayList<LocalizedString> title);
}
