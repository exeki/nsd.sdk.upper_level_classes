
package ru.naumen.metainfo.shared.elements;

public interface Dependence {
    Class getAction();

    Class getCondition();

    String getOpertaionId();
}
