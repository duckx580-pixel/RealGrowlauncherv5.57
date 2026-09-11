package e1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends kotlin.jvm.internal.m implements eh.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final g f5193r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final g f5194s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final g f5195t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final g f5196u;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f5197i;

    static {
        int i10 = 1;
        f5193r = new g(i10, 0);
        f5194s = new g(i10, 1);
        f5195t = new g(i10, 2);
        f5196u = new g(i10, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i10, int i11) {
        super(i10);
        this.f5197i = i11;
    }

    @Override // eh.c
    public final Object invoke(Object obj) {
        switch (this.f5197i) {
            case 0:
                int i10 = ((b) obj).f5186a;
                break;
            case 1:
                int i11 = ((b) obj).f5186a;
                break;
        }
        return Boolean.valueOf(jj.d.E((n) obj));
    }
}
