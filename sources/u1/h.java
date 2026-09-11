package u1;

import o0.n0;
import o0.p;
import o0.z0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends u5.f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g f17560g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final z0 f17561h = p.I(null, n0.f12510u);

    public h(g gVar) {
        this.f17560g = gVar;
    }

    @Override // u5.f
    public final boolean k(g gVar) {
        return gVar == this.f17560g;
    }

    @Override // u5.f
    public final Object o(g gVar) {
        if (gVar != this.f17560g) {
            throw new IllegalStateException("Check failed.");
        }
        Object value = this.f17561h.getValue();
        if (value == null) {
            return null;
        }
        return value;
    }
}
