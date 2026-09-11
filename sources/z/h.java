package z;

import b0.t;
import o0.h1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f20488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f20489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f20490c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final af.a f20491d;

    public h(q qVar, e eVar, a aVar, af.a aVar2) {
        this.f20488a = qVar;
        this.f20489b = eVar;
        this.f20490c = aVar;
        this.f20491d = aVar2;
    }

    @Override // b0.t
    public final int a(Object obj) {
        return this.f20491d.a(obj);
    }

    @Override // b0.t
    public final int b() {
        return this.f20489b.r().f596b;
    }

    @Override // b0.t
    public final Object c(int i10) {
        Object objK = this.f20491d.k(i10);
        return objK == null ? this.f20489b.s(i10) : objK;
    }

    @Override // b0.t
    public final Object d(int i10) {
        return this.f20489b.p(i10);
    }

    @Override // b0.t
    public final void e(int i10, Object obj, o0.o oVar, int i11) {
        oVar.V(-462424778);
        qd.a.a(obj, i10, this.f20488a.f20572s, w0.f.b(oVar, -824725566, new a0.m(this, i10, 2)), oVar, 3592);
        h1 h1VarV = oVar.v();
        if (h1VarV != null) {
            h1VarV.f12435d = new a0.n(this, i10, obj, i11, 12);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        return kotlin.jvm.internal.l.a(this.f20489b, ((h) obj).f20489b);
    }

    public final int hashCode() {
        return this.f20489b.hashCode();
    }
}
