package ru.naumen.core.server.cache;

import java.util.Set;

public interface ClusterCacheService {
    void clearCache();

    void clearCache(Set<String> keys);

    void reloadCache();

    void reloadCache(Set<String> keys);

    boolean isClearAndReloadInSameOperation();

    String getMetaRegion();
}
