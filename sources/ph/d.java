package ph;

import a0.u;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.l;
import oh.c0;
import oh.f;
import oh.f0;
import oh.g0;
import oh.h1;
import oh.j1;
import oh.s1;
import oh.t;
import oh.w0;
import s.h0;
import th.m;
import ug.h;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends h1 implements c0 {
    private volatile d _immediate;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Handler f13457s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f13458t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f13459u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final d f13460v;

    public d(Handler handler, String str, boolean z3) {
        this.f13457s = handler;
        this.f13458t = str;
        this.f13459u = z3;
        this._immediate = z3 ? this : null;
        d dVar = this._immediate;
        if (dVar == null) {
            dVar = new d(handler, str, true);
            this._immediate = dVar;
        }
        this.f13460v = dVar;
    }

    @Override // oh.s
    public final void C(h hVar, Runnable runnable) {
        if (this.f13457s.post(runnable)) {
            return;
        }
        c0(hVar, runnable);
    }

    @Override // oh.s
    public final boolean K() {
        return (this.f13459u && l.a(Looper.myLooper(), this.f13457s.getLooper())) ? false : true;
    }

    public final void c0(h hVar, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        w0 w0Var = (w0) hVar.i(t.f12918r);
        if (w0Var != null) {
            w0Var.c(cancellationException);
        }
        f0.f12870b.C(hVar, runnable);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof d) && ((d) obj).f13457s == this.f13457s;
    }

    @Override // oh.c0
    public final void h(long j, f fVar) {
        androidx.fragment.app.d dVar = new androidx.fragment.app.d(16, (Object) fVar, (Object) this, false);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.f13457s.postDelayed(dVar, j)) {
            fVar.t(new u(21, this, dVar));
        } else {
            c0(fVar.f12868u, dVar);
        }
    }

    public final int hashCode() {
        return System.identityHashCode(this.f13457s);
    }

    @Override // oh.c0
    public final g0 o(long j, final s1 s1Var, h hVar) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.f13457s.postDelayed(s1Var, j)) {
            return new g0() { // from class: ph.c
                @Override // oh.g0
                public final void dispose() {
                    this.f13455i.f13457s.removeCallbacks(s1Var);
                }
            };
        }
        c0(hVar, s1Var);
        return j1.f12882i;
    }

    @Override // oh.s
    public final String toString() {
        d dVar;
        String str;
        vh.d dVar2 = f0.f12869a;
        d dVar3 = m.f17224a;
        if (this == dVar3) {
            str = "Dispatchers.Main";
        } else {
            try {
                dVar = dVar3.f13460v;
            } catch (UnsupportedOperationException unused) {
                dVar = null;
            }
            str = this == dVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.f13458t;
        if (string == null) {
            string = this.f13457s.toString();
        }
        return this.f13459u ? h0.e(string, ".immediate") : string;
    }

    public d(Handler handler) {
        this(handler, null, false);
    }
}
