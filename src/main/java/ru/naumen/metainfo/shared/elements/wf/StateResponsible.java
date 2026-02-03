package ru.naumen.metainfo.shared.elements.wf;

import com.google.gwt.user.client.rpc.IsSerializable;

import java.io.Serializable;

abstract public class StateResponsible implements IsSerializable, Serializable {

    abstract public String getBean();

    abstract public StateResponsibleParam getParam();

    abstract public void setBean(String value);

    abstract public void setParam(StateResponsibleParam param);

}
