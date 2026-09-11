package a0;

import com.google.android.gms.internal.measurement.j3;
import u.b1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 implements b0.g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l0 f128a;

    public p0(l0 l0Var) {
        this.f128a = l0Var;
    }

    @Override // b0.g0
    public final boolean a() {
        return this.f128a.a();
    }

    @Override // b0.g0
    public final Object b(int i10, b0.l0 l0Var) {
        j3 j3Var = l0.w;
        l0 l0Var2 = this.f128a;
        l0Var2.getClass();
        Object objD = l0Var2.d(b1.f17398i, new j0(l0Var2, i10, (ug.c) null), l0Var);
        vg.a aVar = vg.a.f18663i;
        qg.o oVar = qg.o.f13926a;
        if (objD != aVar) {
            objD = oVar;
        }
        return objD == aVar ? objD : oVar;
    }

    @Override // b0.g0
    public final int c() {
        return this.f128a.f94a.f43c.f();
    }

    @Override // b0.g0
    public final b2.b d() {
        return new b2.b(-1, -1);
    }

    @Override // b0.g0
    public final int e() {
        return this.f128a.f94a.f42b.f();
    }

    @Override // b0.g0
    public final Object f(float f9, m0.d0 d0Var) {
        Object objC = v.j0.c(this.f128a, f9, t.d.m(0.0f, null, 7), d0Var);
        return objC == vg.a.f18663i ? objC : qg.o.f13926a;
    }
}
