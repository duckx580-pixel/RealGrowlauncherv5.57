package t;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 extends kotlin.jvm.internal.m implements eh.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f16207i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.m f16208r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public w0(eh.c cVar, int i10) {
        super(1);
        this.f16207i = i10;
        switch (i10) {
            case 1:
                this.f16208r = (kotlin.jvm.internal.m) cVar;
                super(1);
                break;
            default:
                this.f16208r = (kotlin.jvm.internal.m) cVar;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [eh.c, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r4v2, types: [eh.c, kotlin.jvm.internal.m] */
    @Override // eh.c
    public final Object invoke(Object obj) {
        switch (this.f16207i) {
            case 0:
                return this.f16208r.invoke(Long.valueOf(((Number) obj).longValue()));
            default:
                y0.g gVar = (y0.g) this.f16208r.invoke((y0.k) obj);
                synchronized (y0.m.f20078b) {
                    y0.m.f20079c = y0.m.f20079c.n(gVar.d());
                }
                return gVar;
        }
    }
}
