
package ru.naumen.core.shared.personalsettings;

import com.google.gwt.user.client.rpc.IsSerializable;

import java.io.Serializable;
import java.util.List;

import ru.naumen.core.shared.HasCode;
import ru.naumen.core.shared.IHasI18nTitle;
import ru.naumen.metainfo.shared.ui.LocalizedString;

abstract public class Theme implements Serializable, IsSerializable, HasCode, IHasI18nTitle {


    public static final Theme createUser(String themeCode) {
        return null;
    }


    abstract public String getCode();

    abstract public String getImage();

    abstract public String getParamsFile();

    abstract public List<LocalizedString> getTitle();

    abstract public Boolean isDisplayedInAdminMode();

    abstract public boolean isSystem();

    abstract public void setCode(String code);

    abstract public void setDisplayedInAdminMode(Boolean displayedInAdminMode);

    abstract public void setImage(String image);

    abstract public void setParamsFile(String paramsFile);

    abstract public void setSystem(boolean system);
}
