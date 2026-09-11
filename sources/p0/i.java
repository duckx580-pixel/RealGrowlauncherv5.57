package p0;

import o0.u1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends z {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f13212c;

    static {
        int i10 = 1;
        f13212c = new i(0, i10, i10);
    }

    @Override // p0.z
    public final void a(androidx.datastore.preferences.protobuf.i iVar, n7.e eVar, u1 u1Var, mf.c cVar) {
        o0.c cVar2 = (o0.c) iVar.g(0);
        cVar2.getClass();
        u1Var.j(u1Var.c(cVar2));
    }

    @Override // p0.z
    public final String c(int i10) {
        return i10 == 0 ? "anchor" : super.c(i10);
    }
}
