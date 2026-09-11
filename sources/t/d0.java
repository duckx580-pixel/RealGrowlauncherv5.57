package t;

import o0.d2;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 implements d2 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Number f16053i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Number f16054r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j1 f16055s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final o0.z0 f16056t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public x0 f16057u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f16058v;
    public boolean w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f16059x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ f0 f16060y;

    public d0(f0 f0Var, Number number, Number number2, j1 j1Var, c0 c0Var) {
        this.f16060y = f0Var;
        this.f16053i = number;
        this.f16054r = number2;
        this.f16055s = j1Var;
        this.f16056t = o0.p.I(number, o0.n0.f12510u);
        this.f16057u = new x0(c0Var, j1Var, this.f16053i, this.f16054r, null);
    }

    @Override // o0.d2
    public final Object getValue() {
        return this.f16056t.getValue();
    }
}
