package v1;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k0 extends t1.q0 implements t1.j0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f18444v;
    public boolean w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final t1.e0 f18445x = new t1.e0(0, this);

    public static void v0(t0 t0Var) {
        d0 d0Var;
        t0 t0Var2 = t0Var.f18490z;
        androidx.compose.ui.node.a aVar = t0Var.f18489y;
        if (!kotlin.jvm.internal.l.a(t0Var2 != null ? t0Var2.f18489y : null, aVar)) {
            aVar.N.f18434o.J.f();
            return;
        }
        a aVarG = aVar.N.f18434o.g();
        if (aVarG == null || (d0Var = ((h0) aVarG).J) == null) {
            return;
        }
        d0Var.f();
    }

    @Override // t1.q0
    public final int P(t1.l lVar) {
        int iM0;
        if (!o0() || (iM0 = m0(lVar)) == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        long j = this.f16312u;
        int i10 = q2.i.f13745c;
        return iM0 + ((int) (j & 4294967295L));
    }

    @Override // t1.m
    public boolean U() {
        return false;
    }

    @Override // t1.j0
    public final t1.i0 V(int i10, int i11, Map map, eh.c cVar) {
        if ((i10 & (-16777216)) == 0 && ((-16777216) & i11) == 0) {
            return new j0(i10, i11, map, cVar, this);
        }
        throw new IllegalStateException(("Size(" + i10 + " x " + i11 + ") is out of range. Each dimension must be between 0 and 16777215.").toString());
    }

    public abstract int m0(t1.l lVar);

    public abstract k0 n0();

    public abstract boolean o0();

    public abstract t1.i0 q0();

    public abstract long r0();

    public abstract void w0();
}
