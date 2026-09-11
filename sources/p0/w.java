package p0;

import o0.u1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class w extends z {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final w f13229c = new w(0, 2, 1);

    @Override // p0.z
    public final void a(androidx.datastore.preferences.protobuf.i iVar, n7.e eVar, u1 u1Var, mf.c cVar) {
        ((eh.e) iVar.g(1)).invoke(eVar.s(), iVar.g(0));
    }

    @Override // p0.z
    public final String c(int i10) {
        return i10 == 0 ? "value" : i10 == 1 ? "block" : super.c(i10);
    }
}
