package androidx.appcompat.widget;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j3 implements Runnable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f912i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Toolbar f913r;

    public /* synthetic */ j3(Toolbar toolbar, int i10) {
        this.f912i = i10;
        this.f913r = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f912i) {
            case 0:
                l3 l3Var = this.f913r.f807f0;
                m.l lVar = l3Var == null ? null : l3Var.f923r;
                if (lVar != null) {
                    lVar.collapseActionView();
                }
                break;
            default:
                this.f913r.m();
                break;
        }
    }
}
