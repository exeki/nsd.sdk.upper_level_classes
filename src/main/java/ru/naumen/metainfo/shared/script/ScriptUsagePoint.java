package ru.naumen.metainfo.shared.script;

import com.google.gwt.user.client.rpc.IsSerializable;

import java.io.Serializable;
import java.util.Collection;

import ru.naumen.core.shared.HasClone;
import ru.naumen.core.shared.script.places.ScriptCategory;
import ru.naumen.core.shared.script.places.ScriptHolders;
import ru.naumen.metainfo.shared.ClassFqn;

abstract public class ScriptUsagePoint implements Serializable, IsSerializable, HasClone {

    abstract public ScriptUsagePoint clone();

    abstract public ScriptCategory getCategory();

    abstract public Collection<ClassFqn> getClassFqns();

    abstract public ScriptHolders getHolderType();

    abstract public String getLocation();

    abstract public Collection<ClassFqn> getRelatedMetaClassFqns();

    abstract public void setCategory(ScriptCategory category);

    abstract public void setHolderType(ScriptHolders holderType);

    abstract public void setLocation(String location);

    abstract public void setRelatedMetaClassFqns(Collection<ClassFqn> relatedMetaClassFqns);


}