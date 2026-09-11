package wf;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements Runnable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f19242i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ t f19243r;

    public /* synthetic */ s(t tVar, int i10) {
        this.f19242i = i10;
        this.f19243r = tVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19242i) {
            case 0:
                t tVar = this.f19243r;
                uf.c cVar = tVar.E;
                if (!cVar.getEventHandler().m() && !cVar.getCursor().a()) {
                    tVar.b();
                } else if (!cVar.getCursor().a()) {
                    cVar.a0(this, 100L);
                }
                break;
            default:
                t tVar2 = this.f19243r;
                uf.c cVar2 = tVar2.E;
                if (!tVar2.L.g()) {
                    cVar2.getSnippetController().getClass();
                    if (System.currentTimeMillis() - tVar2.N > 200 && cVar2.getScroller().f17930b.isFinished()) {
                        tVar2.f();
                    }
                }
                cVar2.a0(this, 200L);
                break;
        }
    }
}
