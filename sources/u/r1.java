package u;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class r1 extends kotlin.jvm.internal.m implements eh.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f17516i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ t1 f17517r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r1(t1 t1Var, int i10) {
        super(0);
        this.f17516i = i10;
        this.f17517r = t1Var;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f17516i) {
            case 0:
                return Float.valueOf(this.f17517r.f17526a.f());
            case 1:
                return Float.valueOf(this.f17517r.f17529d.f());
            case 2:
                return Boolean.valueOf(this.f17517r.f17526a.f() > 0);
            default:
                t1 t1Var = this.f17517r;
                return Boolean.valueOf(t1Var.f17526a.f() < t1Var.f17529d.f());
        }
    }
}
