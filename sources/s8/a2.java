package s8;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a2 implements Runnable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ z1 f15233i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ z1 f15234r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f15235s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f15236t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ c2 f15237u;

    public a2(c2 c2Var, z1 z1Var, z1 z1Var2, long j, boolean z3) {
        this.f15237u = c2Var;
        this.f15233i = z1Var;
        this.f15234r = z1Var2;
        this.f15235s = j;
        this.f15236t = z3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f15237u.x(this.f15233i, this.f15234r, this.f15235s, this.f15236t, null);
    }
}
