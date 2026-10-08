package ru.naumen.metainfo.shared.embeddedapplication;

import java.util.ArrayList;
import java.util.Collection;
import ru.naumen.core.shared.HasClone;
import ru.naumen.core.shared.IHasI18nDescription;
import ru.naumen.core.shared.IHasI18nTitle;
import ru.naumen.core.shared.IUUIDIdentifiable;
import ru.naumen.core.shared.dto.DtObject;
import ru.naumen.metainfo.shared.elements.HasCodeIdentityBase;
import ru.naumen.metainfo.shared.permissioncheck.HasAdminPermissionCategory;
import ru.naumen.metainfo.shared.sets.HasSettingsSet;
import ru.naumen.metainfo.shared.ui.LocalizedString;

public abstract class EmbeddedApplication extends HasCodeIdentityBase implements IHasI18nTitle, IHasI18nDescription, HasClone, IUUIDIdentifiable, HasApplicationAddress, HasSettingsSet, HasAdminPermissionCategory, CoreEmbeddedApplication {

    public abstract EmbeddedApplication clone();

    public EmbeddedApplicationType getApplicationType() {
        return null;
    }

    public DtObject getClientApplicationFile() {
        return null;
    }

    public String getCode() {
        return "";
    }

    public ArrayList<LocalizedString> getDescription() {
        return new ArrayList<>();
    }

    public String getFileUuid() {
        return "";
    }

    public int getInitialHeight() {
        return 1;
    }

    public Long getMobileHeight() {
        return 1L;
    }

    public String getScript() {
        return "";
    }

    public ArrayList<LocalizedString> getTitle() {
        return new ArrayList<>();
    }

    public String getUUID() {
        return "";
    }

    public Collection<Object> getUsagePoints() {
        return new ArrayList<>();
    }

    public String getElementType() {
        return "";
    }

    public boolean isFullscreenAllowed() {
        return false;
    }

    public boolean isOn() {
        return false;
    }

    public void setApplicationType(EmbeddedApplicationType applicationType) {

    }

    public void setClientApplicationFile( DtObject clientApplicationFile) {
    }

    public void setCode(String code) {
    }

    public void setFileUuid( String fileUuid) {
    }

    public void setFullscreenAllowed(final boolean fullscreenAllowed) {
    }

    public void setInitialHeight(int initialHeight) {
    }

    public void setMobileHeight( Long mobileHeight) {
    }

    public void setOn(boolean on) {
    }

    public void setScript( String script) {
    }

    public void setTitle(ArrayList<LocalizedString> newTitle) {
    }

    public void setDescription(ArrayList<LocalizedString> description) {
    }

    public String getSettingsSet() {
        return "";
    }

    public void setSettingsSet( String settingsSet) {
    }

    public String getLibraryName() {
        return "";

    }

    public void setLibraryName( String libraryName) {
    }

    public void setUsagePoints(ArrayList<Object> usagePoints) {
    }

    public String getAdminPermissionCategory() {
        return "";
    }
}
