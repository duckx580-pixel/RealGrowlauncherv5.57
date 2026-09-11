package oh;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends kotlin.jvm.internal.m implements eh.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final p f12898r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final p f12899s;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f12900i;

    static {
        int i10 = 2;
        f12898r = new p(i10, 0);
        f12899s = new p(i10, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(int i10, int i11) {
        super(i10);
        this.f12900i = i11;
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f12900i) {
            case 0:
                return ((ug.h) obj).e((ug.f) obj2);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            default:
                return ((ug.h) obj).e((ug.f) obj2);
        }
    }
}
