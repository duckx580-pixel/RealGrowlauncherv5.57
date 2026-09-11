package ni;

import g1.t;
import m0.f2;
import o0.o;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f12312i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ k1.f f12313r;

    public /* synthetic */ b(k1.f fVar, int i10) {
        this.f12312i = i10;
        this.f12313r = fVar;
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f12312i) {
            case 0:
                o oVar = (o) obj;
                if ((((Integer) obj2).intValue() & 3) == 2 && oVar.D()) {
                    oVar.P();
                } else {
                    f2.b(this.f12313r, null, androidx.compose.foundation.layout.c.n(a1.k.f196a, t6.k.u(12, oVar)), 0L, oVar, 48, 8);
                }
                break;
            default:
                o oVar2 = (o) obj;
                if ((((Integer) obj2).intValue() & 3) == 2 && oVar2.D()) {
                    oVar2.P();
                } else {
                    long j = t.f6907d;
                    i0.k.b(this.f12313r, null, androidx.compose.foundation.layout.c.n(a1.k.f196a, t6.k.u(18, oVar2)), j, oVar2, 3120, 0);
                }
                break;
        }
        return qg.o.f13926a;
    }
}
