package w1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends kotlin.jvm.internal.m implements eh.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final o f18872r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final o f18873s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final o f18874t;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f18875i;

    static {
        int i10 = 1;
        f18872r = new o(i10, 0);
        f18873s = new o(i10, 1);
        f18874t = new o(i10, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i10, int i11) {
        super(i10);
        this.f18875i = i11;
    }

    @Override // eh.c
    public final Object invoke(Object obj) {
        switch (this.f18875i) {
            case 0:
                return qg.o.f13926a;
            case 1:
                return Boolean.FALSE;
            default:
                return Boolean.valueOf(f0.o(obj));
        }
    }
}
