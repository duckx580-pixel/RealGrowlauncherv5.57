package mi;

import m0.l0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f11752i = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f11753r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ eh.a f11754s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f11755t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f11756u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f11757v;
    public final /* synthetic */ qg.a w;

    public /* synthetic */ c(a1.n nVar, l0 l0Var, boolean z3, eh.a aVar, w0.a aVar2, int i10, int i11) {
        this.f11756u = nVar;
        this.f11757v = l0Var;
        this.f11753r = z3;
        this.f11754s = aVar;
        this.w = aVar2;
        this.f11755t = i11;
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f11752i) {
            case 0:
                ((Integer) obj2).getClass();
                int iS = o0.p.S(24577);
                xd.c.b((a1.n) this.f11756u, (l0) this.f11757v, this.f11753r, this.f11754s, (w0.a) this.w, (o0.o) obj, iS, this.f11755t);
                break;
            default:
                ((Integer) obj2).getClass();
                int iS2 = o0.p.S(1);
                oi.c.k((String) this.f11756u, (String) this.f11757v, this.f11753r, (eh.c) this.w, this.f11754s, (o0.o) obj, iS2, this.f11755t);
                break;
        }
        return qg.o.f13926a;
    }

    public /* synthetic */ c(String str, String str2, boolean z3, eh.c cVar, eh.a aVar, int i10, int i11) {
        this.f11756u = str;
        this.f11757v = str2;
        this.f11753r = z3;
        this.w = cVar;
        this.f11754s = aVar;
        this.f11755t = i11;
    }
}
