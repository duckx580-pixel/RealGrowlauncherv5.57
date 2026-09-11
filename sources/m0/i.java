package m0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends kotlin.jvm.internal.m implements eh.e {
    public final /* synthetic */ eh.e A;
    public final /* synthetic */ w0.a B;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ eh.e f10753i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ eh.e f10754r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g1.k0 f10755s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f10756t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ float f10757u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ long f10758v;
    public final /* synthetic */ long w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ long f10759x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f10760y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f10761z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(eh.e eVar, eh.e eVar2, g1.k0 k0Var, long j, float f9, long j10, long j11, long j12, int i10, int i11, eh.e eVar3, w0.a aVar) {
        super(2);
        this.f10753i = eVar;
        this.f10754r = eVar2;
        this.f10755s = k0Var;
        this.f10756t = j;
        this.f10757u = f9;
        this.f10758v = j10;
        this.w = j11;
        this.f10759x = j12;
        this.f10760y = i10;
        this.f10761z = i11;
        this.A = eVar3;
        this.B = aVar;
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        o0.o oVar = (o0.o) obj;
        if ((((Number) obj2).intValue() & 11) == 2 && oVar.D()) {
            oVar.P();
        } else {
            eh.e eVar = this.A;
            int i10 = this.f10760y;
            w0.a aVarB = w0.f.b(oVar, -1873210524, new h(eVar, i10, this.B, 1));
            float f9 = n0.e.f11900a;
            long jE = g1.e(20, oVar);
            int i11 = i10 >> 6;
            int i12 = (i11 & 3670016) | (i11 & 896) | 6 | (i11 & 7168) | (57344 & i11) | (458752 & i11);
            int i13 = this.f10761z;
            g.a(aVarB, null, this.f10753i, this.f10754r, this.f10755s, this.f10756t, this.f10757u, jE, this.f10758v, this.w, this.f10759x, oVar, i12 | ((i13 << 15) & 29360128) | (1879048192 & i10), i13 & 126);
        }
        return qg.o.f13926a;
    }
}
