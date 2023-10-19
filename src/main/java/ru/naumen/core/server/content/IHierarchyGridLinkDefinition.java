package ru.naumen.core.server.content;

public interface IHierarchyGridLinkDefinition extends IContextContentLinkDefinition<IHierarchyGridLinkDefinition> {
    default String getContentType() {
        return "HierarchyGrid";
    }

    String getObjectFocusMode();

    IHierarchyGridLinkDefinition setObjectFocusMode(String var1);

    String getStructureCode();

    IHierarchyGridLinkDefinition setStructureCode(String var1);

    boolean isBuildHierarchyFromCurrentObject();

    IHierarchyGridLinkDefinition setBuildHierarchyFromCurrentObject(boolean var1);
}
