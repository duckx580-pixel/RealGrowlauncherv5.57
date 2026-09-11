package io.github.rosemoe.sora.langs.textmate.registry.model;

import ik.a;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public interface GrammarDefinition {
    default Map<String, String> getEmbeddedLanguages() {
        return Collections.EMPTY_MAP;
    }

    a getGrammar();

    String getLanguageConfiguration();

    String getName();

    String getScopeName();
}
