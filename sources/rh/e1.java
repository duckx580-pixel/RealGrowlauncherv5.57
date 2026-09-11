package rh;

import m0.g5;
import m0.t2;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class e1 implements a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14714a;

    public e1(long j) {
        this.f14714a = j;
        if (j >= 0) {
            return;
        }
        throw new IllegalArgumentException(("stopTimeout(" + j + " ms) cannot be negative").toString());
    }

    @Override // rh.a1
    public final h a(sh.a0 a0Var) {
        d1 d1Var = new d1(this, null);
        int i10 = c0.f14693a;
        sh.k kVar = new sh.k(d1Var, a0Var, ug.i.f17989i, -2, 1);
        int i11 = 2;
        return w0.k(new t2(kVar, new g5(i11, null, i11), 1));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e1) {
            return this.f14714a == ((e1) obj).f14714a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(Long.MAX_VALUE) + (Long.hashCode(this.f14714a) * 31);
    }

    public final String toString() {
        sg.c cVar = new sg.c(2);
        long j = this.f14714a;
        if (j > 0) {
            cVar.add("stopTimeout=" + j + "ms");
        }
        return k0.g.k(new StringBuilder("SharingStarted.WhileSubscribed("), rg.l.j0(sb.c.i(cVar), null, null, null, null, 63), ')');
    }
}
