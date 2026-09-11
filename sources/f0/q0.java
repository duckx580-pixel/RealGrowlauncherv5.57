package f0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 implements t1.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u1 f5846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k2.b0 f5848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a4.v f5849d;

    public q0(u1 u1Var, int i10, k2.b0 b0Var, a4.v vVar) {
        this.f5846a = u1Var;
        this.f5847b = i10;
        this.f5848c = b0Var;
        this.f5849d = vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return kotlin.jvm.internal.l.a(this.f5846a, q0Var.f5846a) && this.f5847b == q0Var.f5847b && this.f5848c.equals(q0Var.f5848c) && this.f5849d.equals(q0Var.f5849d);
    }

    @Override // t1.t
    public final t1.i0 f(t1.j0 j0Var, t1.g0 g0Var, long j) {
        long j10;
        if (g0Var.m(q2.a.g(j)) < q2.a.h(j)) {
            j10 = j;
        } else {
            j10 = j;
            j = q2.a.a(j10, 0, Integer.MAX_VALUE, 0, 0, 13);
        }
        t1.q0 q0VarN = g0Var.n(j);
        int iMin = Math.min(q0VarN.f16308i, q2.a.h(j10));
        return j0Var.V(iMin, q0VarN.f16309r, rg.t.f14665i, new p0(j0Var, this, q0VarN, iMin, 0));
    }

    public final int hashCode() {
        return this.f5849d.hashCode() + ((this.f5848c.hashCode() + android.support.v4.media.session.a.z(this.f5847b, this.f5846a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.f5846a + ", cursorOffset=" + this.f5847b + ", transformedText=" + this.f5848c + ", textLayoutResultProvider=" + this.f5849d + ')';
    }
}
