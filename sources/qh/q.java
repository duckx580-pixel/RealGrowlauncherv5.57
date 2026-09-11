package qh;

import a0.k0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import oh.x;
import oh.x0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends oh.a implements r, h {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final d f13977t;

    public q(ug.h hVar, d dVar) {
        super(hVar, true);
        this.f13977t = dVar;
    }

    @Override // oh.f1
    public final void A(CancellationException cancellationException) {
        this.f13977t.h(cancellationException, true);
        z(cancellationException);
    }

    @Override // oh.f1, oh.w0
    public final void c(CancellationException cancellationException) {
        if (S()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new x0(C(), null, this);
        }
        A(cancellationException);
    }

    @Override // qh.t
    public final Object d() {
        return this.f13977t.d();
    }

    @Override // oh.a
    public final void g0(Throwable th2, boolean z3) {
        if (this.f13977t.h(th2, false) || z3) {
            return;
        }
        x.o(th2, this.f12845s);
    }

    @Override // oh.a
    public final void h0(Object obj) {
        this.f13977t.g(null);
    }

    @Override // qh.t
    public final a iterator() {
        d dVar = this.f13977t;
        dVar.getClass();
        return new a(dVar);
    }

    @Override // qh.t
    public final Object j(sh.o oVar) {
        d dVar = this.f13977t;
        dVar.getClass();
        Object objC = d.C(dVar, oVar);
        vg.a aVar = vg.a.f18663i;
        return objC;
    }

    public final void j0(k0 k0Var) {
        d dVar = this.f13977t;
        dVar.getClass();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f13945z;
        while (!atomicReferenceFieldUpdater.compareAndSet(dVar, null, k0Var)) {
            if (atomicReferenceFieldUpdater.get(dVar) != null) {
                while (true) {
                    Object obj = atomicReferenceFieldUpdater.get(dVar);
                    lc.n nVar = f.f13963q;
                    if (obj != nVar) {
                        if (obj == f.f13964r) {
                            throw new IllegalStateException("Another handler was already registered and successfully invoked");
                        }
                        throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
                    }
                    lc.n nVar2 = f.f13964r;
                    while (!atomicReferenceFieldUpdater.compareAndSet(dVar, nVar, nVar2)) {
                        if (atomicReferenceFieldUpdater.get(dVar) != nVar) {
                            break;
                        }
                    }
                    k0Var.invoke(dVar.o());
                    return;
                }
            }
        }
    }

    @Override // qh.u
    public final Object l(Object obj) {
        return this.f13977t.l(obj);
    }

    @Override // qh.u
    public final Object p(Object obj, ug.c cVar) {
        return this.f13977t.p(obj, cVar);
    }

    @Override // qh.t
    public final Object q(ug.c cVar) {
        return this.f13977t.q(cVar);
    }
}
