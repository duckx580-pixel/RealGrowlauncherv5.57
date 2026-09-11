package p0;

import o0.u1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends z {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f13208c = new e(0, 1, 1);

    @Override // p0.z
    public final void a(androidx.datastore.preferences.protobuf.i iVar, n7.e eVar, u1 u1Var, mf.c cVar) {
        for (Object obj : (Object[]) iVar.g(0)) {
            eVar.n(obj);
        }
    }

    @Override // p0.z
    public final String c(int i10) {
        return i10 == 0 ? "nodes" : super.c(i10);
    }
}
