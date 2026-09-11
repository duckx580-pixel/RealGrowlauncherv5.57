package s;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements o0.c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14926a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14928c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f14929d;

    public e(s4.l lVar, r4.k kVar, y0.q qVar) {
        this.f14928c = lVar;
        this.f14929d = kVar;
        this.f14927b = qVar;
    }

    @Override // o0.c0
    public final void dispose() {
        switch (this.f14926a) {
            case 0:
                y0.q qVar = (y0.q) this.f14927b;
                Object obj = this.f14928c;
                qVar.remove(obj);
                ((l) this.f14929d).f14959d.remove(obj);
                break;
            case 1:
                s4.l lVar = (s4.l) this.f14928c;
                r4.k kVar = (r4.k) this.f14929d;
                lVar.b().b(kVar);
                ((y0.q) this.f14927b).remove(kVar);
                break;
            default:
                x0.f fVar = (x0.f) this.f14927b;
                x0.g gVar = (x0.g) this.f14929d;
                Map map = gVar.f19358a;
                Object obj2 = fVar.f19354a;
                if (fVar.f19355b) {
                    Map mapC = fVar.f19356c.c();
                    if (mapC.isEmpty()) {
                        map.remove(obj2);
                    } else {
                        map.put(obj2, mapC);
                    }
                }
                gVar.f19359b.remove(this.f14928c);
                break;
        }
    }

    public e(x0.f fVar, x0.g gVar, Object obj) {
        this.f14927b = fVar;
        this.f14929d = gVar;
        this.f14928c = obj;
    }

    public e(y0.q qVar, Object obj, l lVar) {
        this.f14927b = qVar;
        this.f14928c = obj;
        this.f14929d = lVar;
    }
}
