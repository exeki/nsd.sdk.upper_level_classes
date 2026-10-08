package ru.naumen.core.server.script.storage;

import java.util.Collection;
import ru.naumen.metainfo.shared.script.Script;

public interface ScriptStorageService {
    void deleteScript(String code);

    void deleteScripts(Collection<String> scriptCodes);

    Script getScript();

    String getScriptBody();

    Collection<Script> getScripts();

    void saveScript(Script script);

    void saveScripts(Collection<Script> scripts);
}
