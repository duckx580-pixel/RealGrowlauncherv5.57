package m0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class h3 extends kotlin.jvm.internal.m implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f10724i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ w0.a f10725r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ w0.a f10726s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ w0.a f10727t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ eh.e f10728u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f10729v;
    public final /* synthetic */ float w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f10730x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h3(w0.a aVar, w0.a aVar2, w0.a aVar3, eh.e eVar, boolean z3, float f9, int i10, int i11) {
        super(2);
        this.f10724i = i11;
        this.f10725r = aVar;
        this.f10726s = aVar2;
        this.f10727t = aVar3;
        this.f10728u = eVar;
        this.f10729v = z3;
        this.w = f9;
        this.f10730x = i10;
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f10724i) {
            case 0:
                ((Number) obj2).intValue();
                k3.c(this.f10725r, this.f10726s, this.f10727t, this.f10728u, this.f10729v, this.w, (o0.o) obj, o0.p.S(this.f10730x | 1));
                break;
            default:
                ((Number) obj2).intValue();
                n3.b(this.f10725r, this.f10726s, this.f10727t, this.f10728u, this.f10729v, this.w, (o0.o) obj, o0.p.S(this.f10730x | 1));
                break;
        }
        return qg.o.f13926a;
    }
}
