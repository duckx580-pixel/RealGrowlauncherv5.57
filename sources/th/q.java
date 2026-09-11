package th;

import oh.x;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public class q extends oh.a implements wg.d {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ug.c f17226t;

    public q(ug.c cVar, ug.h hVar) {
        super(hVar, true);
        this.f17226t = cVar;
    }

    @Override // oh.f1
    public final boolean T() {
        return true;
    }

    @Override // wg.d
    public final wg.d getCallerFrame() {
        ug.c cVar = this.f17226t;
        if (cVar instanceof wg.d) {
            return (wg.d) cVar;
        }
        return null;
    }

    @Override // oh.f1
    public void s(Object obj) {
        a.h(x.u(obj), qd.a.j(this.f17226t));
    }

    @Override // oh.f1
    public void x(Object obj) {
        this.f17226t.resumeWith(x.u(obj));
    }
}
