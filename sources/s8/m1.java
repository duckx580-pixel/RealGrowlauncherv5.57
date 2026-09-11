package s8;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class m1 implements Runnable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f15480i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f15481r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ v1 f15482s;

    public /* synthetic */ m1(v1 v1Var, long j, int i10) {
        this.f15480i = i10;
        this.f15482s = v1Var;
        this.f15481r = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15480i) {
            case 0:
                v1 v1Var = this.f15482s;
                r0 r0Var = ((y0) v1Var.f3470r).f15664x;
                y0.h(r0Var);
                o0 o0Var = r0Var.A;
                long j = this.f15481r;
                o0Var.b(j);
                i0 i0Var = ((y0) v1Var.f3470r).f15665y;
                y0.k(i0Var);
                i0Var.D.c("Session timeout duration set", Long.valueOf(j));
                break;
            default:
                long j10 = this.f15481r;
                v1 v1Var2 = this.f15482s;
                v1Var2.D(j10, true);
                ((y0) v1Var2.f3470r).s().K(new AtomicReference());
                break;
        }
    }
}
