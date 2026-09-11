package u;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends kotlin.jvm.internal.m implements eh.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f17445i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ t1.q0 f17446r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f17447s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(t1.q0 q0Var, int i10, int i11) {
        super(1);
        this.f17445i = i11;
        this.f17446r = q0Var;
        this.f17447s = i10;
    }

    @Override // eh.c
    public final Object invoke(Object obj) {
        switch (this.f17445i) {
            case 0:
                t1.p0 p0Var = (t1.p0) obj;
                int i10 = (-this.f17447s) / 2;
                t1.q0 q0Var = this.f17446r;
                t1.p0.j(p0Var, q0Var, i10 - ((q0Var.f16308i - q0Var.a0()) / 2), i10 - ((q0Var.f16309r - q0Var.R()) / 2), null, 12);
                break;
            default:
                int i11 = this.f17447s / 2;
                t1.p0.d((t1.p0) obj, this.f17446r, i11, i11);
                break;
        }
        return qg.o.f13926a;
    }
}
