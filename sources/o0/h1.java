package o0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public t f12433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f12434c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public eh.e f12435d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12436e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public q.r f12437f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public q.s f12438g;

    public h1(t tVar) {
        this.f12433b = tVar;
    }

    public final boolean a() {
        c cVar;
        return (this.f12433b == null || (cVar = this.f12434c) == null || cVar.f12395a == Integer.MIN_VALUE) ? false : true;
    }

    public final int b(Object obj) {
        int iP;
        t tVar = this.f12433b;
        if (tVar == null || (iP = tVar.p(this, obj)) == 0) {
            return 1;
        }
        return iP;
    }

    public final void c(boolean z3) {
        if (z3) {
            this.f12432a |= 32;
        } else {
            this.f12432a &= -33;
        }
    }
}
