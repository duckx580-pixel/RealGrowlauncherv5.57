package v;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class y0 implements m0, d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public q1 f18329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a1 f18330b;

    @Override // v.m0
    public final Object a(eh.e eVar, wg.i iVar) {
        Object objD = this.f18329a.f18255a.d(u.b1.f17399r, new n(this, eVar, null), iVar);
        return objD == vg.a.f18663i ? objD : qg.o.f13926a;
    }

    @Override // v.d0
    public final void b(float f9) {
        q1 q1Var = this.f18329a;
        q1Var.a(this.f18330b, q1Var.d(f9), 1);
    }
}
