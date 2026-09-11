package k2;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.m implements eh.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final d f9146r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final d f9147s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final d f9148t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final d f9149u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final d f9150v;
    public static final d w;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f9151i;

    static {
        int i10 = 1;
        f9146r = new d(i10, 0);
        f9147s = new d(i10, 1);
        f9148t = new d(i10, 2);
        f9149u = new d(i10, 3);
        f9150v = new d(i10, 4);
        w = new d(i10, 5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i10, int i11) {
        super(i10);
        this.f9151i = i11;
    }

    @Override // eh.c
    public final /* synthetic */ Object invoke(Object obj) {
        switch (this.f9151i) {
            case 0:
                float[] fArr = ((g1.b0) obj).f6859a;
                break;
            case 1:
                float[] fArr2 = ((g1.b0) obj).f6859a;
                break;
            case 2:
                break;
            case 3:
                int i10 = ((l) obj).f9177a;
                break;
            case 4:
                break;
            default:
                int i11 = ((l) obj).f9177a;
                break;
        }
        return qg.o.f13926a;
    }
}
