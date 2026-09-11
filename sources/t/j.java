package t;

import o0.d2;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements d2 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final j1 f16113i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final o0.z0 f16114r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public o f16115s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f16116t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f16117u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f16118v;

    public /* synthetic */ j(j1 j1Var, Object obj, o oVar, int i10) {
        this(j1Var, obj, (i10 & 4) != 0 ? null : oVar, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    @Override // o0.d2
    public final Object getValue() {
        return this.f16114r.getValue();
    }

    public final String toString() {
        return "AnimationState(value=" + this.f16114r.getValue() + ", velocity=" + this.f16113i.f16121b.invoke(this.f16115s) + ", isRunning=" + this.f16118v + ", lastFrameTimeNanos=" + this.f16116t + ", finishedTimeNanos=" + this.f16117u + ')';
    }

    public j(j1 j1Var, Object obj, o oVar, long j, long j10, boolean z3) {
        o oVarF;
        this.f16113i = j1Var;
        this.f16114r = o0.p.I(obj, o0.n0.f12510u);
        if (oVar != null) {
            oVarF = d.f(oVar);
        } else {
            oVarF = (o) j1Var.f16120a.invoke(obj);
            oVarF.d();
        }
        this.f16115s = oVarF;
        this.f16116t = j;
        this.f16117u = j10;
        this.f16118v = z3;
    }
}
