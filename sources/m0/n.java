package m0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends kotlin.jvm.internal.m implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f10980i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ t.k0 f10981r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ o0.s0 f10982s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ w0.a f10983t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f10984u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(t.k0 k0Var, o0.s0 s0Var, w0.a aVar, int i10, int i11) {
        super(2);
        this.f10980i = i11;
        switch (i11) {
            case 1:
                this.f10981r = k0Var;
                this.f10982s = s0Var;
                this.f10983t = aVar;
                this.f10984u = i10;
                super(2);
                break;
            default:
                this.f10981r = k0Var;
                this.f10982s = s0Var;
                this.f10983t = aVar;
                this.f10984u = i10;
                break;
        }
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f10980i) {
            case 0:
                o0.o oVar = (o0.o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && oVar.D()) {
                    oVar.P();
                } else {
                    int i10 = this.f10984u;
                    z2.a(this.f10981r, this.f10982s, this.f10983t, oVar, ((i10 >> 6) & 7168) | (i10 & 896) | 48);
                }
                break;
            default:
                ((Number) obj2).intValue();
                int iS = o0.p.S(this.f10984u | 1);
                z2.a(this.f10981r, this.f10982s, this.f10983t, (o0.o) obj, iS);
                break;
        }
        return qg.o.f13926a;
    }
}
