package o0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends kotlin.jvm.internal.m implements eh.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final g f12419r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final g f12420s;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f12421i;

    static {
        int i10 = 2;
        f12419r = new g(i10, 0);
        f12420s = new g(i10, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i10, int i11) {
        super(i10);
        this.f12421i = i11;
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f12421i) {
            case 0:
                o oVar = (o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && oVar.D()) {
                    oVar.P();
                }
                break;
            case 1:
                o oVar2 = (o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && oVar2.D()) {
                    oVar2.P();
                }
                break;
            default:
                ((androidx.compose.ui.node.a) obj).L = true;
                break;
        }
        return qg.o.f13926a;
    }
}
