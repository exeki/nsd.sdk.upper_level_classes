package ru.naumen.core.server.script.modules.storage;

import java.io.Serializable;
import java.util.List;
import ru.naumen.core.shared.HasCode;
import ru.naumen.core.shared.IHasI18nDocumentation;
import ru.naumen.metainfo.shared.elements.HasElementId;
import ru.naumen.metainfo.shared.permissioncheck.HasAdminPermissionCategory;
import ru.naumen.metainfo.shared.segment.MetainfoSegment;
import ru.naumen.metainfo.shared.sets.HasSettingsSet;
import ru.naumen.metainfo.shared.ui.LocalizedString;

public class ScriptModule extends MetainfoSegment implements HasCode, Serializable, IHasI18nDocumentation, HasSettingsSet, HasElementId, HasAdminPermissionCategory {

    public ScriptModule() {

    }

    public ScriptModule(ScriptModule module) {

    }

    public boolean equals(Object obj) {
        return false;
    }


    public String getAdminPermissionCategory() {
        return getSegmentID();
    }

    public String getAuthor() {
        return "";
    }

    @Override // ru.naumen.core.shared.HasCode, ru.naumen.metainfo.shared.CoreHasCode
    public String getCode() {
        return "";
    }

    public String getCodeWithoutEmbeddedApplication() {
        return "";
    }

    @Deprecated(since = "4.0.1")
    public String getCodeOld() {
        return "";
    }

    public String getDescription() {
        return "";
    }

    public String getEmbeddedApplicationCode() {
        return "";
    }

    public String getModuleVersion() {
        return "";
    }

    public String getProductVersion() {
        return "";
    }

    public String getScript() {
        return "";
    }

    public String getScriptClass() {
        return "";
    }

    public void setScriptClass(String scriptClass) {

    }

    public boolean isModifiable() {
        return false;
    }

    public void setModifiable(boolean modifiable) {

    }

    public ScriptContainer getScriptElement() {
        return null;
    }

    public int hashCode() {
        return 1;
    }

    public boolean isActive() {
        return false;
    }

    @Override
    public String getSegmentID() {
        return "";
    }

    @Override
    public String getSegmentType() {
        return "";
    }

    @Override // ru.naumen.metainfo.shared.segment.MetainfoSegment
    public boolean isDetachableSegment() {
        return true;
    }

    public boolean isEmbeddedApplicationModule() {
        return false;
    }

    public boolean isSuperUserReadable() {
        return false;
    }

    public boolean isSuperUserWritable() {
        return false;
    }

    public boolean isRestAllowed() {
        return false;
    }

    public boolean isHidden() {
        return false;
    }

    public void setActive(boolean active) {

    }

    public void setAuthor( String author) {

    }

    public void setCode(String code) {

    }

    @Deprecated(since = "4.0.1")
    public void setCodeOld(String code) {

    }

    public void setDescription(String description) {

    }

    public void setEmbeddedApplicationCode(String embeddedApplicationCode) {

    }

    public void setModuleVersion(String moduleVersion) {

    }

    public void setProductVersion(String productVersion) {

    }

    public void setScriptElement(ScriptContainer script) {

    }

    public void setSuperUserReadable(boolean superUserReadable) {

    }

    public void setSuperUserWritable(boolean superUserWritable) {

    }

    public void setHidden(boolean hidden) {

    }

    public void setDocumentation( List<LocalizedString> documentation) {

    }

    public void setRestAllowed(boolean restAllowed) {
    }

    public String toString() {
        return "";
    }

    public String getSettingsSet() {
        return "";
    }

    public void setSettingsSet( String settingsSet) {

    }

    public String getElementType() {
        return "";
    }

    public String getElementCode() {
        return "";
    }

    @Override
    public List<LocalizedString> getDocumentation() {
        return List.of();
    }
}
