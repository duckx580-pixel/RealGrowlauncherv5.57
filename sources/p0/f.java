package p0;

import o0.u1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends z {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f13209c = new f(0, 2, 1);

    @Override // p0.z
    public final void a(androidx.datastore.preferences.protobuf.i iVar, n7.e eVar, u1 u1Var, mf.c cVar) {
        ((eh.c) iVar.g(0)).invoke((o0.q) iVar.g(1));
    }

    @Override // p0.z
    public final String c(int i10) {
        return i10 == 0 ? "anchor" : i10 == 1 ? "composition" : super.c(i10);
    }
}
