package p0;

import o0.r1;
import o0.u1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends z {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f13218c = new l(0, 2, 1);

    @Override // p0.z
    public final void a(androidx.datastore.preferences.protobuf.i iVar, n7.e eVar, u1 u1Var, mf.c cVar) {
        r1 r1Var = (r1) iVar.g(1);
        o0.c cVar2 = (o0.c) iVar.g(0);
        u1Var.d();
        cVar2.getClass();
        u1Var.r(r1Var, r1Var.b(cVar2));
        u1Var.i();
    }

    @Override // p0.z
    public final String c(int i10) {
        return i10 == 0 ? "anchor" : i10 == 1 ? "from" : super.c(i10);
    }
}
