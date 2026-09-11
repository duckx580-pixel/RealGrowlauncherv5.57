package s8;

import com.google.android.gms.internal.measurement.z7;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class q1 implements Runnable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i f15547i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f15548r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f15549s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f15550t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f15551u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ i f15552v;
    public final /* synthetic */ v1 w;

    public q1(v1 v1Var, i iVar, long j, int i10, long j10, boolean z3, i iVar2) {
        this.w = v1Var;
        this.f15547i = iVar;
        this.f15548r = j;
        this.f15549s = i10;
        this.f15550t = j10;
        this.f15551u = z3;
        this.f15552v = iVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        v1 v1Var = this.w;
        i iVar = this.f15547i;
        v1Var.H(iVar);
        v1Var.D(this.f15548r, false);
        v1.O(v1Var, this.f15547i, this.f15549s, this.f15550t, true, this.f15551u);
        z7.b();
        if (((y0) v1Var.f3470r).w.C(null, z.f15695o0)) {
            v1.N(v1Var, iVar, this.f15552v);
        }
    }
}
