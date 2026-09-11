package b8;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f2768a;

    public e(f fVar) {
        this.f2768a = fVar;
    }

    @Override // b8.d
    public final void a(y7.a aVar) {
        boolean zJ = aVar.j();
        f fVar = this.f2768a;
        if (zJ) {
            fVar.i(null, fVar.v());
            return;
        }
        c cVar = fVar.K;
        if (cVar != null) {
            cVar.onConnectionFailed(aVar);
        }
    }
}
