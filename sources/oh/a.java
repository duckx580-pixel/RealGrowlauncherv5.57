package oh;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends f1 implements ug.c, w {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ug.h f12845s;

    public a(ug.h hVar, boolean z3) {
        super(z3);
        P((w0) hVar.i(t.f12918r));
        this.f12845s = hVar.e(this);
    }

    @Override // oh.f1
    public final String C() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // oh.f1
    public final void O(a2.d dVar) {
        x.o(dVar, this.f12845s);
    }

    @Override // oh.f1
    public final void a0(Object obj) {
        if (!(obj instanceof n)) {
            h0(obj);
        } else {
            n nVar = (n) obj;
            g0(nVar.f12894a, n.f12893b.get(nVar) != 0);
        }
    }

    @Override // ug.c
    public final ug.h getContext() {
        return this.f12845s;
    }

    @Override // oh.w
    public final ug.h h() {
        return this.f12845s;
    }

    public final void i0(int i10, a aVar, eh.e eVar) {
        int iC = t.g.c(i10);
        if (iC == 0) {
            androidx.work.v.A(eVar, aVar, this);
            return;
        }
        if (iC != 1) {
            if (iC == 2) {
                kotlin.jvm.internal.l.f("<this>", eVar);
                qd.a.j(qd.a.g(eVar, aVar, this)).resumeWith(qg.o.f13926a);
                return;
            }
            if (iC != 3) {
                throw new a2.d();
            }
            try {
                ug.h hVar = this.f12845s;
                Object objM = th.a.m(hVar, null);
                try {
                    kotlin.jvm.internal.a0.c(2, eVar);
                    Object objInvoke = eVar.invoke(aVar, this);
                    if (objInvoke != vg.a.f18663i) {
                        resumeWith(objInvoke);
                    }
                } finally {
                    th.a.g(hVar, objM);
                }
            } catch (Throwable th2) {
                resumeWith(androidx.work.v.i(th2));
            }
        }
    }

    @Override // ug.c
    public final void resumeWith(Object obj) {
        Throwable thA = qg.i.a(obj);
        if (thA != null) {
            obj = new n(thA, false);
        }
        Object objW = W(obj);
        if (objW == x.f12934e) {
            return;
        }
        x(objW);
    }

    public void h0(Object obj) {
    }

    public void g0(Throwable th2, boolean z3) {
    }
}
