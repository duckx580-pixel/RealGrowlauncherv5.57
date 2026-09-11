package s8;

import com.google.android.gms.internal.measurement.z7;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class r1 implements Runnable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i f15563i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f15564r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f15565s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f15566t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ i f15567u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ v1 f15568v;

    public r1(v1 v1Var, i iVar, int i10, long j, boolean z3, i iVar2) {
        this.f15568v = v1Var;
        this.f15563i = iVar;
        this.f15564r = i10;
        this.f15565s = j;
        this.f15566t = z3;
        this.f15567u = iVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        v1 v1Var = this.f15568v;
        i iVar = this.f15563i;
        v1Var.H(iVar);
        v1.O(v1Var, this.f15563i, this.f15564r, this.f15565s, false, this.f15566t);
        z7.b();
        if (((y0) v1Var.f3470r).w.C(null, z.f15695o0)) {
            v1.N(v1Var, iVar, this.f15567u);
        }
    }
}
