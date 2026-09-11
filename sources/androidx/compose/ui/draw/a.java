package androidx.compose.ui.draw;

import a1.n;
import eh.c;
import g1.l;
import j1.b;
import t1.k0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final n a(n nVar, c cVar) {
        return nVar.j(new DrawBehindElement(cVar));
    }

    public static final n b(n nVar, c cVar) {
        return nVar.j(new DrawWithCacheElement(cVar));
    }

    public static final n c(n nVar, c cVar) {
        return nVar.j(new DrawWithContentElement(cVar));
    }

    public static n d(n nVar, b bVar, k0 k0Var, l lVar, int i10) {
        return nVar.j(new PainterElement(bVar, a1.a.f179t, k0Var, 1.0f, lVar));
    }
}
