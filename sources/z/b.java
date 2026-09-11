package z;

import b0.g0;
import b0.l0;
import com.google.android.gms.internal.measurement.j3;
import m0.d0;
import u.b1;
import v.j0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f20479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f20480b;

    public b(q qVar, boolean z3) {
        this.f20479a = qVar;
        this.f20480b = z3;
    }

    @Override // b0.g0
    public final boolean a() {
        return this.f20479a.a();
    }

    @Override // b0.g0
    public final Object b(int i10, l0 l0Var) {
        j3 j3Var = q.f20554z;
        q qVar = this.f20479a;
        qVar.getClass();
        Object objD = qVar.d(b1.f17398i, new p(qVar, i10, (ug.c) null), l0Var);
        vg.a aVar = vg.a.f18663i;
        qg.o oVar = qg.o.f13926a;
        if (objD != aVar) {
            objD = oVar;
        }
        return objD == aVar ? objD : oVar;
    }

    @Override // b0.g0
    public final int c() {
        return this.f20479a.f20557c.f43c.f();
    }

    @Override // b0.g0
    public final b2.b d() {
        return this.f20480b ? new b2.b(-1, 1) : new b2.b(1, -1);
    }

    @Override // b0.g0
    public final int e() {
        return this.f20479a.f20557c.f42b.f();
    }

    @Override // b0.g0
    public final Object f(float f9, d0 d0Var) {
        Object objC = j0.c(this.f20479a, f9, t.d.m(0.0f, null, 7), d0Var);
        return objC == vg.a.f18663i ? objC : qg.o.f13926a;
    }
}
