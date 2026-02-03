
package ru.naumen.core.shared;

import com.google.gwt.user.client.rpc.IsSerializable;

import java.io.Serializable;
import java.util.List;


abstract public class ScriptInfo implements IsSerializable, Serializable {

    abstract public String getDescription();

    abstract public int getNumber();

    abstract public List<String> getUsedModules();

    abstract public void setDescription(String description);

    abstract public void setNumber(int number);

    abstract public void setUsedModules(List<String> usedModules);


}
