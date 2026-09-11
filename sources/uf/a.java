package uf;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f17794i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ c f17795r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Runnable f17796s;

    public /* synthetic */ a(c cVar, Runnable runnable, int i10) {
        this.f17794i = i10;
        this.f17795r = cVar;
        this.f17796s = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17794i) {
            case 0:
                if (!this.f17795r.f17815i0) {
                    this.f17796s.run();
                    break;
                }
                break;
            default:
                if (!this.f17795r.f17815i0) {
                    this.f17796s.run();
                    break;
                }
                break;
        }
    }
}
