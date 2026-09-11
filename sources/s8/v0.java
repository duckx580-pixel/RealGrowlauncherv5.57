package s8;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 extends FutureTask implements Comparable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f15622i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f15623r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f15624s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ x0 f15625t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(x0 x0Var, Runnable runnable, boolean z3, String str) {
        super(runnable, null);
        this.f15625t = x0Var;
        long andIncrement = x0.B.getAndIncrement();
        this.f15622i = andIncrement;
        this.f15624s = str;
        this.f15623r = z3;
        if (andIncrement == Long.MAX_VALUE) {
            i0 i0Var = ((y0) x0Var.f3470r).f15665y;
            y0.k(i0Var);
            i0Var.w.b("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        v0 v0Var = (v0) obj;
        boolean z3 = v0Var.f15623r;
        boolean z10 = this.f15623r;
        if (z10 != z3) {
            return !z10 ? 1 : -1;
        }
        long j = v0Var.f15622i;
        long j10 = this.f15622i;
        if (j10 < j) {
            return -1;
        }
        if (j10 > j) {
            return 1;
        }
        i0 i0Var = ((y0) this.f15625t.f3470r).f15665y;
        y0.k(i0Var);
        i0Var.f15411x.c("Two tasks share the same index. index", Long.valueOf(j10));
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th2) {
        i0 i0Var = ((y0) this.f15625t.f3470r).f15665y;
        y0.k(i0Var);
        i0Var.w.c(this.f15624s, th2);
        super.setException(th2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(x0 x0Var, Callable callable, boolean z3) {
        super(callable);
        this.f15625t = x0Var;
        long andIncrement = x0.B.getAndIncrement();
        this.f15622i = andIncrement;
        this.f15624s = "Task exception on worker thread";
        this.f15623r = z3;
        if (andIncrement == Long.MAX_VALUE) {
            i0 i0Var = ((y0) x0Var.f3470r).f15665y;
            y0.k(i0Var);
            i0Var.w.b("Tasks index overflow");
        }
    }
}
