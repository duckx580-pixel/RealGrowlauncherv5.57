package v;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class z extends kotlin.jvm.internal.m implements eh.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final z f18337r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final z f18338s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final z f18339t;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f18340i;

    static {
        int i10 = 0;
        f18337r = new z(i10, 0);
        f18338s = new z(i10, 1);
        f18339t = new z(i10, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(int i10, int i11) {
        super(i10);
        this.f18340i = i11;
    }

    @Override // eh.a
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f18340i) {
            case 0:
                return qg.o.f13926a;
            case 1:
                return qg.o.f13926a;
            default:
                return Boolean.FALSE;
        }
    }
}
