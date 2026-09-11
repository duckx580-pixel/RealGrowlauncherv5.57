package y;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements t1.h0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m f19964b = new m(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m f19965c = new m(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19966a;

    public /* synthetic */ m(int i10) {
        this.f19966a = i10;
    }

    @Override // t1.h0
    public final t1.i0 a(t1.j0 j0Var, List list, long j) {
        switch (this.f19966a) {
            case 0:
                return j0Var.V(q2.a.j(j), q2.a.i(j), rg.t.f14665i, l.f19960r);
            default:
                return j0Var.V(q2.a.f(j) ? q2.a.h(j) : 0, q2.a.e(j) ? q2.a.g(j) : 0, rg.t.f14665i, l.f19962t);
        }
    }
}
