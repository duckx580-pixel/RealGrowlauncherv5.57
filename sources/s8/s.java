package s8;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements Runnable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f15572i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f15573r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ x f15574s;

    public /* synthetic */ s(x xVar, long j, int i10) {
        this.f15572i = i10;
        this.f15574s = xVar;
        this.f15573r = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15572i) {
            case 0:
                ((u) this.f15574s).z(this.f15573r);
                break;
            default:
                c2 c2Var = (c2) this.f15574s;
                ((y0) c2Var.f3470r).m().w(this.f15573r);
                c2Var.f15285v = null;
                break;
        }
    }
}
