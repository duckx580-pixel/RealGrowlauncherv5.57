package v;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class m1 implements a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q1 f18220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t.h0 f18221b;

    public m1(q1 q1Var, t.h0 h0Var) {
        this.f18220a = q1Var;
        this.f18221b = h0Var;
    }

    @Override // v.a1
    public final float a(float f9) {
        q1 q1Var = this.f18220a;
        long j = ((f1.c) this.f18221b.invoke(new f1.c(q1Var.d(f9)))).f5977a;
        return q1Var.f18256b == t0.f18279r ? f1.c.d(j) : f1.c.e(j);
    }
}
