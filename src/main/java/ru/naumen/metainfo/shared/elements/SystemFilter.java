
package ru.naumen.metainfo.shared.elements;

import com.google.gwt.user.client.rpc.IsSerializable;

import java.io.Serializable;
import java.util.Set;

abstract public class SystemFilter implements Serializable, IsSerializable {

    abstract public String getFilterName();

    abstract public Set<String> getAttributesForFilter();

    abstract public void setFilterName(String filterName);
}
