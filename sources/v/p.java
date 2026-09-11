package v;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kotlin.jvm.internal.m f18242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f18243b = new o(this);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u.e1 f18244c = new u.e1();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o0.z0 f18245d = o0.p.I(Boolean.FALSE, o0.n0.f12510u);

    /* JADX WARN: Multi-variable type inference failed */
    public p(eh.c cVar) {
        this.f18242a = (kotlin.jvm.internal.m) cVar;
    }

    @Override // v.k1
    public final boolean b() {
        return ((Boolean) this.f18245d.getValue()).booleanValue();
    }

    @Override // v.k1
    public final Object d(u.b1 b1Var, eh.e eVar, wg.c cVar) {
        Object objG = oh.x.g(new n(this, b1Var, eVar, (ug.c) null), cVar);
        return objG == vg.a.f18663i ? objG : qg.o.f13926a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eh.c, kotlin.jvm.internal.m] */
    @Override // v.k1
    public final float e(float f9) {
        return ((Number) this.f18242a.invoke(Float.valueOf(f9))).floatValue();
    }
}
