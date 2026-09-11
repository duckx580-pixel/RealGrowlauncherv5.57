package t;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f16156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f16157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f16158c;

    public p0(float f9, float f10, Object obj) {
        this.f16156a = f9;
        this.f16157b = f10;
        this.f16158c = obj;
    }

    @Override // t.i
    public final l1 a(j1 j1Var) {
        p m1Var;
        Object obj = this.f16158c;
        o oVar = obj == null ? null : (o) j1Var.f16120a.invoke(obj);
        float f9 = this.f16156a;
        float f10 = this.f16157b;
        if (oVar != null) {
            m1Var = new m1(oVar, f9, f10);
        } else {
            ae.c cVar = new ae.c();
            cVar.f594i = new a0(f9, f10, 0.01f);
            m1Var = cVar;
        }
        l5.o oVar2 = new l5.o();
        oVar2.f9810i = new t6.b(m1Var);
        return oVar2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p0) {
            p0 p0Var = (p0) obj;
            if (p0Var.f16156a == this.f16156a && p0Var.f16157b == this.f16157b && kotlin.jvm.internal.l.a(p0Var.f16158c, this.f16158c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f16158c;
        return Float.hashCode(this.f16157b) + s.h0.a((obj != null ? obj.hashCode() : 0) * 31, this.f16156a, 31);
    }

    public /* synthetic */ p0(Object obj) {
        this(1.0f, 1500.0f, obj);
    }
}
