package s8;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class r2 implements Runnable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f15569i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final long f15570r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ u5.e f15571s;

    public r2(u5.e eVar, long j, long j10) {
        this.f15571s = eVar;
        this.f15569i = j;
        this.f15570r = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x0 x0Var = ((y0) ((u2) this.f15571s.f17655s).f3470r).f15666z;
        y0.k(x0Var);
        x0Var.B(new a8.q(21, this));
    }
}
