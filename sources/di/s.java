package di;

import bi.f1;
import bi.g1;
import bi.h1;
import bi.i1;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f5161a = rg.k.M0(new zh.g[]{g1.f2970a, h1.f2973a, f1.f2965a, i1.f2978a});

    public static final boolean a(zh.g gVar) {
        kotlin.jvm.internal.l.f("<this>", gVar);
        return gVar.isInline() && f5161a.contains(gVar);
    }
}
