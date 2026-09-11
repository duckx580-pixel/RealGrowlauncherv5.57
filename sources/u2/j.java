package u2;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends kotlin.jvm.internal.m implements eh.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final j f17587r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final j f17588s;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f17589i;

    static {
        int i10 = 2;
        f17587r = new j(i10, 0);
        f17588s = new j(i10, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i10, int i11) {
        super(i10);
        this.f17589i = i11;
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f17589i) {
            case 0:
                o0.o oVar = (o0.o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && oVar.D()) {
                    oVar.P();
                }
                break;
            default:
                o0.o oVar2 = (o0.o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && oVar2.D()) {
                    oVar2.P();
                }
                break;
        }
        return qg.o.f13926a;
    }
}
