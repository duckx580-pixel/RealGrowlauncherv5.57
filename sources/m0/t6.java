package m0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class t6 extends kotlin.jvm.internal.m implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f11304i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f11305r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f11306s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t6(long j, a1.n nVar, int i10) {
        super(2);
        this.f11304i = 2;
        this.f11305r = j;
        this.f11306s = nVar;
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f11304i) {
            case 0:
                o0.o oVar = (o0.o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && oVar.D()) {
                    oVar.P();
                } else {
                    a7.b(this.f11305r, null, (eh.e) this.f11306s, oVar, 0, 2);
                }
                break;
            case 1:
                o0.o oVar2 = (o0.o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && oVar2.D()) {
                    oVar2.P();
                } else {
                    a7.b(this.f11305r, null, (eh.e) this.f11306s, oVar2, 0, 2);
                }
                break;
            default:
                ((Number) obj2).intValue();
                a1.n nVar = (a1.n) this.f11306s;
                int iS = o0.p.S(385);
                f0.f.a(this.f11305r, nVar, (o0.o) obj, iS);
                break;
        }
        return qg.o.f13926a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t6(long j, eh.e eVar, int i10) {
        super(2);
        this.f11304i = i10;
        this.f11305r = j;
        this.f11306s = eVar;
    }
}
