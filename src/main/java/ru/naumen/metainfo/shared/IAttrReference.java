package ru.naumen.metainfo.shared;

import java.io.Serializable;

public interface IAttrReference extends Serializable {
    String getAttrCode();

    IClassFqnWrapper getClassFqn();
}
