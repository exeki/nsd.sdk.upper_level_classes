package ru.naumen.core.server.content;

import ru.naumen.common.shared.utils.ISProperties;

import javax.annotation.Nullable;
import java.util.List;

public interface IContentLinkDefinition<B extends IContentLinkDefinition<B>> {
    ISProperties buildProperties();

    @Nullable
    String getBranch();

    B setBranch(@Nullable Object var1);

    String getContentType();

    Integer getDaysToLive();

    B setDaysToLive(int var1);

    String getTemplate();

    B setTemplate(String var1);

    String getTitle();

    B setTitle(String var1);

    List<String> getUsers();

    B setUsers(List<Object> var1);
}
