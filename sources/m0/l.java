package m0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends kotlin.jvm.internal.m implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f10890i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ w0.a f10891r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f10892s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f10893t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f10894u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f10895v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(Object obj, Object obj2, Object obj3, w0.a aVar, int i10, int i11) {
        super(2);
        this.f10890i = i11;
        this.f10893t = obj;
        this.f10894u = obj2;
        this.f10895v = obj3;
        this.f10891r = aVar;
        this.f10892s = i10;
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f10890i) {
            case 0:
                ((Number) obj2).intValue();
                eh.a aVar = (eh.a) this.f10893t;
                a1.n nVar = (a1.n) this.f10894u;
                u2.n nVar2 = (u2.n) this.f10895v;
                m.a(aVar, nVar, nVar2, this.f10891r, (o0.o) obj, o0.p.S(this.f10892s | 1));
                break;
            default:
                ((Number) obj2).intValue();
                e1 e1Var = (e1) this.f10893t;
                q4 q4Var = (q4) this.f10894u;
                n7 n7Var = (n7) this.f10895v;
                n1.k(e1Var, q4Var, n7Var, this.f10891r, (o0.o) obj, o0.p.S(this.f10892s | 1));
                break;
        }
        return qg.o.f13926a;
    }
}
