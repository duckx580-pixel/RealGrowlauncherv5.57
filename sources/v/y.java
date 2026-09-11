package v;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends kotlin.jvm.internal.m implements eh.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final y f18325r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final y f18326s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final y f18327t;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f18328i;

    static {
        int i10 = 1;
        f18325r = new y(i10, 0);
        f18326s = new y(i10, 1);
        f18327t = new y(i10, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(int i10, int i11) {
        super(i10);
        this.f18328i = i11;
    }

    @Override // eh.c
    public final Object invoke(Object obj) {
        switch (this.f18328i) {
            case 0:
                long j = ((f1.c) obj).f5977a;
                return qg.o.f13926a;
            case 1:
                return Boolean.TRUE;
            default:
                return Boolean.valueOf(!(((q1.q) obj).f13692i == 2));
        }
    }
}
