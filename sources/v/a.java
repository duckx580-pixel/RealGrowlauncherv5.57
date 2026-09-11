package v;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends kotlin.jvm.internal.m implements eh.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f18102i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ l0 f18103r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(l0 l0Var, int i10) {
        super(1);
        this.f18102i = i10;
        this.f18103r = l0Var;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [eh.c, kotlin.jvm.internal.m] */
    @Override // eh.c
    public final Object invoke(Object obj) {
        switch (this.f18102i) {
            case 0:
                return (Boolean) this.f18103r.F.invoke((q1.q) obj);
            default:
                return Boolean.valueOf(!(this.f18103r.X.a(q1.o.f((q1.q) obj, true)) == 0.0f));
        }
    }
}
