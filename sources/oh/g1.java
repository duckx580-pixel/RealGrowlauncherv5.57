package oh;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class g1 extends m1 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ug.c f12874t;

    public g1(ug.h hVar, eh.e eVar) {
        super(hVar, false);
        this.f12874t = qd.a.g(eVar, this, this);
    }

    @Override // oh.f1
    public final void b0() {
        try {
            th.a.h(qg.o.f13926a, qd.a.j(this.f12874t));
        } catch (Throwable th2) {
            resumeWith(androidx.work.v.i(th2));
            throw th2;
        }
    }
}
