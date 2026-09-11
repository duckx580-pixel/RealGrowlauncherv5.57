package t6;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class x0 extends kotlin.jvm.internal.m implements eh.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f17103i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final z0 f17104r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x0(z0 z0Var, int i10) {
        super(0);
        this.f17103i = i10;
        this.f17104r = z0Var;
    }

    @Override // eh.a
    public final Object invoke() {
        Long L;
        switch (this.f17103i) {
            case 0:
                return Boolean.valueOf(Boolean.parseBoolean(this.f17104r.A.d("com.appsflyer.enable_instant_plays")));
            default:
                String strD = this.f17104r.A.d("com.appsflyer.fetch_ids.timeout");
                return Long.valueOf((strD == null || (L = nh.o.L(strD)) == null) ? 1000L : L.longValue());
        }
    }
}
