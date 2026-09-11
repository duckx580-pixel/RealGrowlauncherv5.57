package m0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class d5 extends kotlin.jvm.internal.m implements eh.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kh.a f10530i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f10531r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ float f10532s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ eh.c f10533t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d5(kh.a aVar, int i10, float f9, eh.c cVar) {
        super(1);
        this.f10530i = aVar;
        this.f10531r = i10;
        this.f10532s = f9;
        this.f10533t = cVar;
    }

    @Override // eh.c
    public final Object invoke(Object obj) {
        int i10;
        float fFloatValue = ((Number) obj).floatValue();
        kh.a aVar = this.f10530i;
        float f9 = aVar.f9619a;
        float f10 = aVar.f9620b;
        float fD = gh.a.d(fFloatValue, f9, f10);
        boolean z3 = false;
        int i11 = this.f10531r;
        if (i11 > 0 && (i10 = i11 + 1) >= 0) {
            float fAbs = fD;
            float f11 = fAbs;
            int i12 = 0;
            while (true) {
                float fP = xd.c.p(aVar.f9619a, f10, i12 / i10);
                float f12 = fP - fD;
                if (Math.abs(f12) <= fAbs) {
                    fAbs = Math.abs(f12);
                    f11 = fP;
                }
                if (i12 == i10) {
                    break;
                }
                i12++;
            }
            fD = f11;
        }
        if (fD != this.f10532s) {
            this.f10533t.invoke(Float.valueOf(fD));
            z3 = true;
        }
        return Boolean.valueOf(z3);
    }
}
