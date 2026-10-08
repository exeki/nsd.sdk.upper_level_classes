package ru.naumen.core.server.script.modules.storage;

import ru.naumen.metainfo.shared.embeddedapplication.EmbeddedApplication;

import java.util.Collection;
import java.util.Optional;

public interface ScriptModulesStorageService {
    Collection<ScriptModule> getAllModules();

    Collection<ScriptModule> getUserModules();

    Collection<ScriptModule> getUserModules(EmbeddedApplication application);

    Collection<ScriptModule> getCompilableModules();

    Optional<SystemScriptModule> getSystemModule(String code);

    Optional<ScriptModule> getModule(String code);

    boolean isModuleExists(String code);
}
