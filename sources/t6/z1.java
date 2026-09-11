package t6;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class z1 extends kotlin.jvm.internal.m implements eh.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f17136i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final a2 f17137r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z1(a2 a2Var, int i10) {
        super(0);
        this.f17136i = i10;
        this.f17137r = a2Var;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f17136i) {
            case 0:
                return Boolean.valueOf(Boolean.parseBoolean(this.f17137r.f16706a.d("com.appsflyer.rc.sandbox")));
            default:
                return Boolean.valueOf(Boolean.parseBoolean(this.f17137r.f16706a.d("com.appsflyer.rc.staging")));
        }
    }
}
