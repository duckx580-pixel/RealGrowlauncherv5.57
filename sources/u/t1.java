package u;

import com.google.android.gms.internal.measurement.j3;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class t1 implements v.k1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final j3 f17525i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0.w0 f17526a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f17530e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o0.w0 f17527b = o0.p.H(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x.l f17528c = new x.l();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o0.w0 f17529d = o0.p.H(Integer.MAX_VALUE);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final v.p f17531f = new v.p(new t.q0(11, this));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o0.a0 f17532g = o0.p.z(new r1(this, 3));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o0.a0 f17533h = o0.p.z(new r1(this, 2));

    static {
        m mVar = m.f17466u;
        j3 j3Var = x0.m.f19368a;
        f17525i = new j3(22, s1.f17518i, mVar);
    }

    public t1(int i10) {
        this.f17526a = o0.p.H(i10);
    }

    @Override // v.k1
    public final boolean a() {
        return ((Boolean) this.f17532g.getValue()).booleanValue();
    }

    @Override // v.k1
    public final boolean b() {
        return this.f17531f.b();
    }

    @Override // v.k1
    public final boolean c() {
        return ((Boolean) this.f17533h.getValue()).booleanValue();
    }

    @Override // v.k1
    public final Object d(b1 b1Var, eh.e eVar, wg.c cVar) {
        Object objD = this.f17531f.d(b1Var, eVar, cVar);
        return objD == vg.a.f18663i ? objD : qg.o.f13926a;
    }

    @Override // v.k1
    public final float e(float f9) {
        return this.f17531f.e(f9);
    }
}
