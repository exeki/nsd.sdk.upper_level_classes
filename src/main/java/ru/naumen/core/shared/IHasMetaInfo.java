package ru.naumen.core.shared;

//import com.google.common.base.Function;

import ru.naumen.metainfo.shared.IClassFqn;

public interface IHasMetaInfo extends ISHasMetainfo {

    IClassFqn getMetaClass();
}
