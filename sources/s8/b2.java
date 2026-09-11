package s8;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b2 implements Runnable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f15257i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ c2 f15258r;

    public /* synthetic */ b2(c2 c2Var, int i10) {
        this.f15257i = i10;
        this.f15258r = c2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15257i) {
            case 0:
                c2 c2Var = this.f15258r;
                c2Var.f15285v = c2Var.A;
                break;
            default:
                this.f15258r.A = null;
                break;
        }
    }
}
