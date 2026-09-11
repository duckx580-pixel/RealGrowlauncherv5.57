package u;

import o0.d2;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 implements v0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final d2 f17401i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d2 f17402r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final d2 f17403s;

    public c0(o0.s0 s0Var, o0.s0 s0Var2, o0.s0 s0Var3) {
        this.f17401i = s0Var;
        this.f17402r = s0Var2;
        this.f17403s = s0Var3;
    }

    @Override // u.v0
    public final void g(v1.e0 e0Var) {
        e0Var.b();
        i1.b bVar = e0Var.f18385i;
        if (((Boolean) this.f17401i.getValue()).booleanValue()) {
            i1.d.T(e0Var, g1.t.b(g1.t.f6905b, 0.3f), 0L, bVar.e(), 122);
        } else if (((Boolean) this.f17402r.getValue()).booleanValue() || ((Boolean) this.f17403s.getValue()).booleanValue()) {
            i1.d.T(e0Var, g1.t.b(g1.t.f6905b, 0.1f), 0L, bVar.e(), 122);
        }
    }
}
