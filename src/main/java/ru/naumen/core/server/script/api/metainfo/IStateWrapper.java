package ru.naumen.core.server.script.api.metainfo;

import ru.naumen.common.shared.utils.IColor;

import javax.annotation.Nullable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public interface IStateWrapper {
    Set<IActionWrapper> getActions(boolean var1);

    List<String> getActionsOrder(boolean var1);

    String getCode();

    IColor getColor();

    Set<IActionWrapper> getDeclaredActions(boolean var1);

    Set<IConditionWrapper> getDeclaredConditions(boolean var1);

    String getDescription();

    IMetaClassWrapper getMetaClass();

    List<IActionWrapper> getPostActions();

    Set<IConditionWrapper> getPostConditions();

    List<IActionWrapper> getPreActions();

    Set<IConditionWrapper> getPreConditions();

    List<ITagWrapper> getTags();

    String getTitle();

    boolean isEnabled();

    boolean isHardcoded();

    @Nullable
    IStateSettingWrapper getStateSetting(String var1);

    List<IStateSettingWrapper> getStateSettings();

    Map<String, IStateSettingWrapper> getStateSettings(Collection<String> var1);

    boolean isInherits();
}
