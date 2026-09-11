package u;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends kotlin.jvm.internal.m implements eh.f {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final h f17449r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final h f17450s;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f17451i;

    static {
        int i10 = 3;
        f17449r = new h(i10, 0);
        f17450s = new h(i10, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i10, int i11) {
        super(i10);
        this.f17451i = i11;
    }

    @Override // eh.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f17451i) {
            case 0:
                t1.j0 j0Var = (t1.j0) obj;
                t1.q0 q0VarN = ((t1.g0) obj2).n(((q2.a) obj3).f13729a);
                int iE0 = j0Var.e0(y.f17540a * 2);
                int iA0 = q0VarN.a0() - iE0;
                if (iA0 < 0) {
                    iA0 = 0;
                }
                int iR = q0VarN.R() - iE0;
                return j0Var.V(iA0, iR >= 0 ? iR : 0, rg.t.f14665i, new g(q0VarN, iE0, 0));
            default:
                t1.j0 j0Var2 = (t1.j0) obj;
                t1.q0 q0VarN2 = ((t1.g0) obj2).n(((q2.a) obj3).f13729a);
                int iE02 = j0Var2.e0(y.f17540a * 2);
                return j0Var2.V(q0VarN2.f16308i + iE02, q0VarN2.f16309r + iE02, rg.t.f14665i, new g(q0VarN2, iE02, 1));
        }
    }
}
