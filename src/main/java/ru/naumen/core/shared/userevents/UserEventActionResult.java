package ru.naumen.core.shared.userevents;

public class UserEventActionResult {
    public ru.naumen.core.shared.userevents.IUserEventActionResult executeJavaScript(java.lang.String javascript) {return null;}
    public java.lang.String getEventActionUuid() {return null;}
    public java.lang.String getEventTitle() {return null;}
    public java.util.ArrayList getProcessedSubjects() {return null;}
    public ru.naumen.core.shared.userevents.EventSyncType getEventSyncType() {return null;}
    public ru.naumen.core.shared.userevents.IUserEventActionResult goToExternal(java.lang.String url) {return null;}
    public ru.naumen.core.shared.userevents.IUserEventActionResult goToExternal(java.lang.String url, java.util.Map attributes) {return null;}
    public ru.naumen.core.shared.userevents.IUserEventActionResult goToMobileAddForm(java.lang.String formCode, java.util.Map attributes) {return null;}
    public ru.naumen.core.shared.userevents.IUserEventActionResult goToMobileEditForm(java.lang.Object subject, java.lang.String formCode, java.util.Map attributes) {return null;}
    public ru.naumen.core.shared.userevents.IUserEventActionResult goToMobileEditForm(java.lang.Object subject, java.util.Map attributes) {return null;}
    public ru.naumen.core.shared.userevents.IUserEventActionResult goToMobileObjectCard(java.lang.Object subject) {return null;}
    public ru.naumen.core.shared.userevents.IUserEventActionResult goToUrl(java.lang.String url) {return null;}
    public ru.naumen.core.shared.userevents.IUserEventActionResult goToUrl(java.lang.String url, boolean newTab) {return null;}
    public ru.naumen.core.shared.userevents.IUserEventActionResult downloadFile(ru.naumen.core.shared.IUUIDIdentifiable file, java.lang.String title) {return null;}
    public ru.naumen.core.shared.userevents.IUserEventActionResult downloadFile(java.lang.String uuid) {return null;}
    public ru.naumen.core.shared.userevents.IUserEventActionResult downloadFile(ru.naumen.core.shared.IUUIDIdentifiable file) {return null;}
    public ru.naumen.core.shared.userevents.IUserEventActionResult downloadFile(java.lang.String uuid, java.lang.String title) {return null;}
    public void setContent(ru.naumen.metainfo.shared.ui.Content content) {}
    public void setPermissions(ru.naumen.metainfo.shared.PermissionHolder permissions) {}
    public ru.naumen.core.shared.userevents.IUserEventActionResult reload(boolean needReload) {return null;}
    public java.lang.String getErrorMessage() {return null;}
    public ru.naumen.metainfo.shared.ui.Content getContent() {return null;}
    public ru.naumen.core.shared.userevents.ResultAction getAction() {return null;}
    public void setErrorMessage(java.lang.String message) {}
    public ru.naumen.core.shared.userevents.IUserEventActionResult showMessage(java.lang.String message) {return null;}
    public ru.naumen.core.shared.userevents.IUserEventActionResult showMessage(java.lang.String title, java.lang.String message) {return null;}
    public boolean needReload() {return false;}
    public void setProcessedSubjects(java.util.ArrayList processedSubjects) {}
    public ru.naumen.metainfo.shared.PermissionHolder getPermissions() {return null;}
}
