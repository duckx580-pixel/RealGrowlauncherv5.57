package w1;

import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 extends oh.s {
    public static final qg.k C = android.support.v4.media.session.b.q(l0.f18843x);
    public static final a8.f1 D = new a8.f1(6);
    public final o0.b1 B;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Choreographer f18891s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Handler f18892t;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f18896y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f18897z;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Object f18893u = new Object();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final rg.j f18894v = new rg.j();
    public ArrayList w = new ArrayList();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ArrayList f18895x = new ArrayList();
    public final p0 A = new p0(this);

    public q0(Choreographer choreographer, Handler handler) {
        this.f18891s = choreographer;
        this.f18892t = handler;
        this.B = new o0.b1(choreographer, this);
    }

    public static final void c0(q0 q0Var) {
        Runnable runnable;
        boolean z3;
        do {
            synchronized (q0Var.f18893u) {
                rg.j jVar = q0Var.f18894v;
                runnable = (Runnable) (jVar.isEmpty() ? null : jVar.removeFirst());
            }
            while (runnable != null) {
                runnable.run();
                synchronized (q0Var.f18893u) {
                    rg.j jVar2 = q0Var.f18894v;
                    runnable = (Runnable) (jVar2.isEmpty() ? null : jVar2.removeFirst());
                }
            }
            synchronized (q0Var.f18893u) {
                if (q0Var.f18894v.isEmpty()) {
                    z3 = false;
                    q0Var.f18896y = false;
                } else {
                    z3 = true;
                }
            }
        } while (z3);
    }

    @Override // oh.s
    public final void C(ug.h hVar, Runnable runnable) {
        synchronized (this.f18893u) {
            this.f18894v.addLast(runnable);
            if (!this.f18896y) {
                this.f18896y = true;
                this.f18892t.post(this.A);
                if (!this.f18897z) {
                    this.f18897z = true;
                    this.f18891s.postFrameCallback(this.A);
                }
            }
        }
    }
}
