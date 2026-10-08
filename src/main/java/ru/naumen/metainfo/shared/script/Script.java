package ru.naumen.metainfo.shared.script;

import com.google.gwt.user.client.rpc.IsSerializable;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import ru.naumen.core.shared.HasClone;
import ru.naumen.core.shared.HasCode;
import ru.naumen.core.shared.IHasI18nTitle;
import ru.naumen.metainfo.shared.elements.HasCodeIdentityBase;
import ru.naumen.metainfo.shared.ui.LocalizedString;


abstract public class Script extends HasCodeIdentityBase implements IsSerializable, Serializable, IHasI18nTitle, HasClone, HasCode {


    abstract public Script clone();

    abstract public boolean equals(Object obj);

    abstract public List<LocalizedString> getDocumentation();

    abstract public String getScriptClass();

    abstract public void setDocumentation(List<LocalizedString> documentation);

    abstract public String getBody();

    abstract  public String getCode();

    abstract public HashSet<String> getDefaultCategories();

    abstract  public String getMimeType();

    abstract public HashSet<String> getSubjectDependencies();

    abstract public ArrayList<LocalizedString> getTitle();

    abstract public ArrayList<ScriptUsagePoint> getUsagePoints();

    abstract public int hashCode();

    abstract public boolean isEditable();

    abstract public void setBody(String body);

    abstract  public void setCode(String code);

    abstract  public void setDefaultCategories(HashSet<String> defaultCategories);

    abstract  public void setEditable(boolean editable);

    abstract public void setMimeType(String mimeType);

    abstract public void setScriptClass(String scriptClass);

    abstract public void setSubjectDependencies(HashSet<String> subjectDependencies);

    abstract public void setTitle(ArrayList<LocalizedString> title);

    abstract  public void setUsagePoints(ArrayList<ScriptUsagePoint> usagePoints);

    abstract public String toString();

    abstract public String getSegmentID();

    abstract public String getSegmentType();

    abstract  public boolean isDetachableSegment();
}
