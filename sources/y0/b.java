package y0;

import f0.z1;
import t.w0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends c {
    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    public b(int i10, k kVar) {
        eh.c z1Var;
        synchronized (m.f20078b) {
            ?? r12 = m.f20084h;
            kotlin.jvm.internal.l.f("<this>", r12);
            z1Var = (eh.c) (r12.size() == 1 ? r12.get(0) : null);
            z1Var = z1Var == null ? new z1(15, r12) : z1Var;
        }
        super(i10, kVar, null, z1Var);
    }

    @Override // y0.c
    public final c A(eh.c cVar, eh.c cVar2) {
        return (c) ((g) m.f(new w0(new a(cVar, cVar2, 0), 1)));
    }

    @Override // y0.c, y0.g
    public final void c() {
        synchronized (m.f20078b) {
            int i10 = this.f20062d;
            if (i10 >= 0) {
                m.t(i10);
                this.f20062d = -1;
            }
        }
    }

    @Override // y0.c, y0.g
    public final void k() {
        r.e();
        throw null;
    }

    @Override // y0.c, y0.g
    public final void l() {
        r.e();
        throw null;
    }

    @Override // y0.c, y0.g
    public final void m() {
        m.a();
    }

    @Override // y0.c, y0.g
    public final g t(eh.c cVar) {
        return (g) m.f(new w0(new s.y(cVar, 4), 1));
    }

    @Override // y0.c
    public final r v() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }
}
