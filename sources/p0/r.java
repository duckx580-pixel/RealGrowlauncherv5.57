package p0;

import o0.u1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends z {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r f13224c = new r(2, 0, 2);

    @Override // p0.z
    public final void a(androidx.datastore.preferences.protobuf.i iVar, n7.e eVar, u1 u1Var, mf.c cVar) {
        ((androidx.compose.ui.node.a) eVar.f12174t).K(iVar.f(0), iVar.f(1));
    }

    @Override // p0.z
    public final String b(int i10) {
        return i10 == 0 ? "removeIndex" : i10 == 1 ? "count" : super.b(i10);
    }
}
