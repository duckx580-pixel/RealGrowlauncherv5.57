package u;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends kotlin.jvm.internal.m implements eh.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final k0 f17457r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final k0 f17458s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final k0 f17459t;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f17460i;

    static {
        int i10 = 0;
        f17457r = new k0(i10, 0);
        f17458s = new k0(i10, 1);
        f17459t = new k0(i10, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(int i10, int i11) {
        super(i10);
        this.f17460i = i11;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f17460i) {
            case 0:
                return null;
            case 1:
                return d0.f17406b;
            case 2:
                return new h1();
            default:
                return new t1(0);
        }
    }
}
