package io.github.rosemoe.sora.langs.textmate.registry.reader;

import com.google.gson.k;
import io.github.rosemoe.sora.langs.textmate.registry.model.GrammarDefinition;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static List a() {
        InputStream inputStreamT = mf.a.n().t("textmate/language.json");
        if (inputStreamT == null) {
            return Collections.EMPTY_LIST;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamT));
        k kVar = new k();
        kVar.b(GrammarDefinition.class, new a(0));
        return ((b) kVar.a().b(bufferedReader, new qb.a(b.class))).f8408a;
    }
}
