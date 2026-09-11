package s;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends kotlin.jvm.internal.m implements eh.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f15006i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ eh.c f15007r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(eh.c cVar, int i10) {
        super(1);
        this.f15006i = i10;
        this.f15007r = cVar;
    }

    @Override // eh.c
    public final Object invoke(Object obj) {
        int i10;
        switch (this.f15006i) {
            case 0:
                long j = ((q2.k) obj).f13751a;
                return new q2.k(te.a.c(((Number) this.f15007r.invoke(Integer.valueOf((int) (j >> 32)))).intValue(), (int) (j & 4294967295L)));
            case 1:
                long j10 = ((q2.k) obj).f13751a;
                return new q2.k(te.a.c(((Number) this.f15007r.invoke(Integer.valueOf((int) (j10 >> 32)))).intValue(), (int) (j10 & 4294967295L)));
            case 2:
                return new q2.i(t6.k.b(0, ((Number) this.f15007r.invoke(Integer.valueOf((int) (((q2.k) obj).f13751a & 4294967295L)))).intValue()));
            case 3:
                return new q2.i(t6.k.b(0, ((Number) this.f15007r.invoke(Integer.valueOf((int) (((q2.k) obj).f13751a & 4294967295L)))).intValue()));
            default:
                y0.k kVar = (y0.k) obj;
                synchronized (y0.m.f20078b) {
                    i10 = y0.m.f20080d;
                    y0.m.f20080d = i10 + 1;
                }
                return new y0.f(i10, kVar, this.f15007r);
        }
    }
}
