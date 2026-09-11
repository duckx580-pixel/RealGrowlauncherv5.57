package s8;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class s2 extends l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f15580e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f15581f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s2(Object obj, e1 e1Var, int i10) {
        super(e1Var);
        this.f15580e = i10;
        this.f15581f = obj;
    }

    @Override // s8.l
    public final void b() throws Throwable {
        switch (this.f15580e) {
            case 0:
                t2 t2Var = (t2) this.f15581f;
                u2 u2Var = t2Var.f15602d;
                u2Var.t();
                y0 y0Var = (y0) u2Var.f3470r;
                y0Var.D.getClass();
                t2Var.a(false, false, SystemClock.elapsedRealtime());
                u uVarM = y0Var.m();
                y0Var.D.getClass();
                uVarM.w(SystemClock.elapsedRealtime());
                break;
            default:
                v2 v2Var = (v2) this.f15581f;
                v2Var.x();
                i0 i0Var = ((y0) v2Var.f3470r).f15665y;
                y0.k(i0Var);
                i0Var.E.b("Starting upload from DelayedRunnable");
                v2Var.f15638s.u();
                break;
        }
    }
}
