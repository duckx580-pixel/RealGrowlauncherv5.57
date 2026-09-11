package oi;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f12944i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f12945r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f12946s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ eh.a f12947t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f12948u;

    public /* synthetic */ a(int i10, int i11, eh.a aVar, eh.a aVar2, String str, boolean z3) {
        this.f12944i = i11;
        this.f12945r = str;
        this.f12946s = z3;
        this.f12947t = aVar;
        this.f12948u = aVar2;
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f12944i) {
            case 0:
                ((Integer) obj2).getClass();
                int iS = o0.p.S(1);
                c.p(this.f12945r, this.f12946s, this.f12947t, (eh.a) this.f12948u, (o0.o) obj, iS);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iS2 = o0.p.S(1);
                ri.a.a(this.f12945r, this.f12946s, this.f12947t, (eh.a) this.f12948u, (o0.o) obj, iS2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iS3 = o0.p.S(1);
                ni.f.a((k1.f) this.f12948u, this.f12945r, this.f12946s, this.f12947t, (o0.o) obj, iS3);
                break;
        }
        return qg.o.f13926a;
    }

    public /* synthetic */ a(k1.f fVar, String str, boolean z3, eh.a aVar, int i10) {
        this.f12944i = 2;
        this.f12948u = fVar;
        this.f12945r = str;
        this.f12946s = z3;
        this.f12947t = aVar;
    }
}
