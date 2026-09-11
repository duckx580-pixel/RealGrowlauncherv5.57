package p0;

import o0.u1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends z {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s f13225c;

    static {
        int i10 = 0;
        f13225c = new s(i10, i10, 3);
    }

    @Override // p0.z
    public final void a(androidx.datastore.preferences.protobuf.i iVar, n7.e eVar, u1 u1Var, mf.c cVar) {
        if (u1Var.f12599m != 0) {
            o0.p.v("Cannot reset when inserting");
            throw null;
        }
        u1Var.w();
        u1Var.f12604r = 0;
        u1Var.f12605s = u1Var.l() - u1Var.f12594g;
        u1Var.f12595h = 0;
        u1Var.f12596i = 0;
        u1Var.f12600n = 0;
    }
}
