package o0;

import android.view.Choreographer;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class y implements o0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final y f12620i = new y();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Choreographer f12621r;

    static {
        vh.d dVar = oh.f0.f12869a;
        f12621r = (Choreographer) oh.x.w(th.m.f17224a.f13460v, new fe.f(2, null, 3));
    }

    @Override // ug.h
    public final ug.h e(ug.h hVar) {
        return android.support.v4.media.session.b.s(this, hVar);
    }

    @Override // o0.o0
    public final Object f(eh.c cVar, ug.c cVar2) {
        oh.f fVar = new oh.f(1, qd.a.j(cVar2));
        fVar.r();
        x xVar = new x(cVar, fVar);
        f12621r.postFrameCallback(xVar);
        fVar.t(new a0.k0(18, xVar));
        Object objQ = fVar.q();
        vg.a aVar = vg.a.f18663i;
        return objQ;
    }

    @Override // ug.h
    public final ug.f i(ug.g gVar) {
        return android.support.v4.media.session.b.i(this, gVar);
    }

    @Override // ug.h
    public final Object n(Object obj, eh.e eVar) {
        return eVar.invoke(obj, this);
    }

    @Override // ug.h
    public final ug.h u(ug.g gVar) {
        return android.support.v4.media.session.b.r(this, gVar);
    }
}
