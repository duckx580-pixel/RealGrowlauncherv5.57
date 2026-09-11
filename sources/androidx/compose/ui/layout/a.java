package androidx.compose.ui.layout;

import a1.n;
import eh.c;
import eh.f;
import t1.g0;
import t1.r;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final Object a(g0 g0Var) {
        Object objU = g0Var.u();
        r rVar = objU instanceof r ? (r) objU : null;
        if (rVar != null) {
            return rVar.v();
        }
        return null;
    }

    public static final n b(n nVar, f fVar) {
        return nVar.j(new LayoutElement(fVar));
    }

    public static final n c(n nVar, Object obj) {
        return nVar.j(new LayoutIdElement(obj));
    }

    public static final n d(n nVar, c cVar) {
        return nVar.j(new OnGloballyPositionedElement(cVar));
    }
}
