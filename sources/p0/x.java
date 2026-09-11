package p0;

import o0.u1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends z {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x f13230c = new x(1, 0, 2);

    @Override // p0.z
    public final void a(androidx.datastore.preferences.protobuf.i iVar, n7.e eVar, u1 u1Var, mf.c cVar) {
        int iF = iVar.f(0);
        for (int i10 = 0; i10 < iF; i10++) {
            eVar.K();
        }
    }

    @Override // p0.z
    public final String b(int i10) {
        return i10 == 0 ? "count" : super.b(i10);
    }
}
