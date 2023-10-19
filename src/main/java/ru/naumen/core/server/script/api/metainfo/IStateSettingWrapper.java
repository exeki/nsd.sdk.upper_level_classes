package ru.naumen.core.server.script.api.metainfo;

public interface IStateSettingWrapper {
    IFillMode getPostFill();

    IFillMode getPreFill();

    boolean isCanEdit();

    boolean isCanView();

    boolean isRequiredInState();

    /**
     * имя для скачивания ru.naumen.core.server.script.api.metainfo.IStateSettingWrapper$IFillMode
     * класс в скачанном файле IStateSettingWrapper$IFillMode
     */
    public interface IFillMode {
        boolean isNoAsk();

        boolean isAsk();

        boolean isRequired();
    }
}
