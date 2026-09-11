package rh;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 implements oh.g0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final v0 f14816i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final long f14817r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f14818s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final oh.f f14819t;

    public t0(v0 v0Var, long j, Object obj, oh.f fVar) {
        this.f14816i = v0Var;
        this.f14817r = j;
        this.f14818s = obj;
        this.f14819t = fVar;
    }

    @Override // oh.g0
    public final void dispose() {
        v0 v0Var = this.f14816i;
        synchronized (v0Var) {
            if (this.f14817r < v0Var.o()) {
                return;
            }
            Object[] objArr = v0Var.f14834x;
            kotlin.jvm.internal.l.c(objArr);
            long j = this.f14817r;
            if (objArr[((int) j) & (objArr.length - 1)] != this) {
                return;
            }
            w0.e(objArr, j, w0.f14840a);
            v0Var.j();
        }
    }
}
