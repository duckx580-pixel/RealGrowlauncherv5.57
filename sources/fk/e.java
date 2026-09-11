package fk;

import io.github.rosemoe.sora.langs.textmate.registry.model.GrammarDefinition;
import java.util.LinkedHashMap;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6766b;

    public /* synthetic */ e(int i10, Object obj) {
        this.f6765a = i10;
        this.f6766b = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f6765a) {
            case 0:
                return ((g) this.f6766b).b((String) obj);
            default:
                mf.c cVar = (mf.c) this.f6766b;
                GrammarDefinition grammarDefinition = (GrammarDefinition) obj;
                synchronized (cVar) {
                    String name = grammarDefinition.getName();
                    if (((LinkedHashMap) cVar.f11704t).containsKey(name) && grammarDefinition.getScopeName() != null) {
                        return ((ik.c) cVar.f11702r).a(grammarDefinition.getScopeName(), null, null);
                    }
                    sj.a aVarN = cVar.n(grammarDefinition);
                    if (grammarDefinition.getScopeName() != null) {
                        ((LinkedHashMap) cVar.f11704t).put(name, grammarDefinition.getScopeName());
                        ((LinkedHashMap) cVar.f11705u).put(((tj.e) aVarN).f17346a, grammarDefinition);
                    }
                    return aVarN;
                }
        }
    }
}
