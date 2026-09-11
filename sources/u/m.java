package u;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends kotlin.jvm.internal.m implements eh.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final m f17463r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final m f17464s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final m f17465t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final m f17466u;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f17467i;

    static {
        int i10 = 1;
        f17463r = new m(i10, 0);
        f17464s = new m(i10, 1);
        f17465t = new m(i10, 2);
        f17466u = new m(i10, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(int i10, int i11) {
        super(i10);
        this.f17467i = i11;
    }

    @Override // eh.c
    public final Object invoke(Object obj) {
        int i10 = this.f17467i;
        qg.o oVar = qg.o.f13926a;
        switch (i10) {
            case 0:
                ((v1.e0) obj).b();
                return oVar;
            case 1:
                return oVar;
            case 2:
                b2.f fVar = b2.f.f2539d;
                lh.j[] jVarArr = b2.t.f2617a;
                b2.u uVar = b2.r.f2594c;
                lh.j jVar = b2.t.f2617a[1];
                uVar.a((b2.j) obj, fVar);
                return oVar;
            default:
                return new t1(((Number) obj).intValue());
        }
    }
}
