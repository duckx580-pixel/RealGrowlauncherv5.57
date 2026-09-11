package w2;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends kotlin.jvm.internal.m implements eh.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f19013r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final a f19014s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final a f19015t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final a f19016u;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f19017i;

    static {
        int i10 = 2;
        f19013r = new a(i10, 0);
        f19014s = new a(i10, 1);
        f19015t = new a(i10, 2);
        f19016u = new a(i10, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i10, int i11) {
        super(i10);
        this.f19017i = i11;
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f19017i) {
            case 0:
                a3.b bVar = (a3.b) obj;
                kotlin.jvm.internal.l.f("$this$arrayOf", bVar);
                kotlin.jvm.internal.l.f("other", obj2);
                bVar.f230s = null;
                bVar.f233v = null;
                bVar.F = 9;
                bVar.f229r = obj2;
                return bVar;
            case 1:
                a3.b bVar2 = (a3.b) obj;
                kotlin.jvm.internal.l.f("$this$arrayOf", bVar2);
                kotlin.jvm.internal.l.f("other", obj2);
                bVar2.f229r = null;
                bVar2.f233v = null;
                bVar2.F = 10;
                bVar2.f230s = obj2;
                return bVar2;
            case 2:
                a3.b bVar3 = (a3.b) obj;
                kotlin.jvm.internal.l.f("$this$arrayOf", bVar3);
                kotlin.jvm.internal.l.f("other", obj2);
                bVar3.f232u = null;
                bVar3.f233v = null;
                bVar3.F = 11;
                bVar3.f231t = obj2;
                return bVar3;
            default:
                a3.b bVar4 = (a3.b) obj;
                kotlin.jvm.internal.l.f("$this$arrayOf", bVar4);
                kotlin.jvm.internal.l.f("other", obj2);
                bVar4.f231t = null;
                bVar4.f233v = null;
                bVar4.F = 12;
                bVar4.f232u = obj2;
                return bVar4;
        }
    }
}
