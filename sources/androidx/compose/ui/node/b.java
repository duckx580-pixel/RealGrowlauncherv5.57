package androidx.compose.ui.node;

import a1.l;
import androidx.work.v;
import v1.q0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q0 f1252a;

    static {
        q0 q0Var = new q0();
        q0Var.f200t = -1;
        f1252a = q0Var;
    }

    public static final int a(l lVar, l lVar2) {
        if (kotlin.jvm.internal.l.a(lVar, lVar2)) {
            return 2;
        }
        if (v.f(lVar, lVar2)) {
            return 1;
        }
        return ((lVar instanceof ForceUpdateElement) && v.f(((ForceUpdateElement) lVar).f1241a, lVar2)) ? 1 : 0;
    }
}
