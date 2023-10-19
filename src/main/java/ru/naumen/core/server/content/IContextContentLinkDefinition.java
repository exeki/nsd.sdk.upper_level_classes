package ru.naumen.core.server.content;

import ru.naumen.metainfo.shared.IClassFqn;

import javax.annotation.Nullable;
import java.util.List;

public interface IContextContentLinkDefinition<B extends IContextContentLinkDefinition<B>> extends IContentLinkDefinition<B> {
    @Nullable
    IClassFqn getContextFqn();

    B setContextFqn(Object var1);

    @Nullable
    String getObject();

    B setObject(@Nullable Object var1);

    List<String> getProfiles();

    B setProfiles(List<String> var1);
}
