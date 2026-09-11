package p0;

import o0.u1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends z {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f13211c;

    static {
        int i10 = 0;
        f13211c = new h(i10, i10, 3);
    }

    @Override // p0.z
    public final void a(androidx.datastore.preferences.protobuf.i iVar, n7.e eVar, u1 u1Var, mf.c cVar) {
        while (true) {
            int i10 = u1Var.f12606t;
            if ((i10 < 0 && u1Var.f12605s > 0) || i10 == 0) {
                break;
            }
            u1Var.B();
            if (o0.p.l(u1Var.f12589b, u1Var.n(u1Var.f12606t))) {
                eVar.K();
            }
            u1Var.h();
        }
        u1Var.h();
    }
}
