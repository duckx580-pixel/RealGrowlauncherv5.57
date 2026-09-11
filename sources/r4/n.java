package r4;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends kotlin.jvm.internal.m implements eh.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f14537i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a0 f14538r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(a0 a0Var, int i10) {
        super(1);
        this.f14537i = i10;
        this.f14538r = a0Var;
    }

    @Override // eh.c
    public final Object invoke(Object obj) {
        switch (this.f14537i) {
            case 0:
                kotlin.jvm.internal.l.f("destination", (v) obj);
                return Boolean.valueOf(!this.f14538r.f14466m.containsKey(Integer.valueOf(r2.f14573v)));
            default:
                kotlin.jvm.internal.l.f("destination", (v) obj);
                return Boolean.valueOf(!this.f14538r.f14466m.containsKey(Integer.valueOf(r2.f14573v)));
        }
    }
}
