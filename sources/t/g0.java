package t;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends kotlin.jvm.internal.m implements eh.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f16087i = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f16088r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f16089s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f16090t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f16091u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(Number number, d0 d0Var, Number number2, c0 c0Var) {
        super(0);
        this.f16088r = number;
        this.f16090t = d0Var;
        this.f16089s = number2;
        this.f16091u = c0Var;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f16087i) {
            case 0:
                Number number = (Number) this.f16089s;
                Number number2 = (Number) this.f16088r;
                d0 d0Var = (d0) this.f16090t;
                if (!number2.equals(d0Var.f16053i) || !number.equals(d0Var.f16054r)) {
                    c0 c0Var = (c0) this.f16091u;
                    d0Var.f16053i = number2;
                    d0Var.f16054r = number;
                    d0Var.f16057u = new x0(c0Var, d0Var.f16055s, number2, number, null);
                    d0Var.f16060y.f16073b.setValue(Boolean.TRUE);
                    d0Var.f16058v = false;
                    d0Var.w = true;
                }
                break;
            default:
                ((u2.q) this.f16088r).d((eh.a) this.f16089s, (u2.n) this.f16090t, (q2.l) this.f16091u);
                break;
        }
        return qg.o.f13926a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(u2.q qVar, eh.a aVar, u2.n nVar, q2.l lVar) {
        super(0);
        this.f16088r = qVar;
        this.f16089s = aVar;
        this.f16090t = nVar;
        this.f16091u = lVar;
    }
}
