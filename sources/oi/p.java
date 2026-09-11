package oi;

import m0.e1;
import m0.g1;
import m0.n1;
import m0.q4;
import m0.r4;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f13012i = 1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ li.m f13013r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ eh.a f13014s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ eh.c f13015t;

    public /* synthetic */ p(li.m mVar, eh.a aVar, eh.c cVar, int i10) {
        this.f13013r = mVar;
        this.f13014s = aVar;
        this.f13015t = cVar;
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f13012i) {
            case 0:
                o0.o oVar = (o0.o) obj;
                if ((((Integer) obj2).intValue() & 3) == 2 && oVar.D()) {
                    oVar.P();
                } else {
                    n1.b(androidx.compose.foundation.layout.a.i(androidx.compose.foundation.layout.c.c(androidx.compose.foundation.layout.c.f(a1.k.f196a, 0.7f), 0.8f), 0), ((q4) oVar.k(r4.f11209a)).f11169d, n1.p(((e1) oVar.k(g1.f10686a)).o(), 0L, oVar, 0, 14), null, null, w0.f.b(oVar, -859858934, new fi.w(this.f13013r, this.f13015t, this.f13014s, 5)), oVar, 196614, 24);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                c.g(this.f13013r, this.f13014s, this.f13015t, (o0.o) obj, o0.p.S(1));
                break;
        }
        return qg.o.f13926a;
    }

    public /* synthetic */ p(li.m mVar, eh.c cVar, eh.a aVar) {
        this.f13013r = mVar;
        this.f13015t = cVar;
        this.f13014s = aVar;
    }
}
