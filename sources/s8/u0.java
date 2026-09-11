package s8;

import java.lang.Thread;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0 f15607b;

    public u0(x0 x0Var, String str) {
        this.f15607b = x0Var;
        this.f15606a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th2) {
        i0 i0Var = ((y0) this.f15607b.f3470r).f15665y;
        y0.k(i0Var);
        i0Var.w.c(this.f15606a, th2);
    }
}
