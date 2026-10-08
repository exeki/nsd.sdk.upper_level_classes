package ru.naumen.metainfo.shared.embeddedapplication;

import com.google.gwt.user.client.rpc.IsSerializable;
import ru.naumen.core.shared.HasTitleCode;

public enum EmbeddedApplicationType implements HasTitleCode, IsSerializable {
    ExternalApplication("Application.ExternalApplication"),
    InternalApplication("Application.InternalApplication"),
    ClientSideApplication("Application.ClientSideApplication"),
    CustomLoginFormApplication("Application.CustomLoginFormApplication");

    private String titleCode;

    EmbeddedApplicationType(String titleCode) {
        this.titleCode = titleCode;
    }

    public String getTitleCode() {
        return this.titleCode;
    }
}