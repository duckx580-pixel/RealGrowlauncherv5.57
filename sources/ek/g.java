package ek;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends j {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h f5532f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f5533g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c6.a f5534h;

    public g(m mVar, String str, String str2, List list) {
        super(mVar, str, null);
        this.f5532f = new h(str2, mVar);
        this.f5533g = list;
    }

    @Override // ek.j
    public final void a(e eVar, c6.a aVar) {
        aVar.a(this.f5532f);
    }

    @Override // ek.j
    public final d b(tj.e eVar, String str, boolean z3, boolean z10) {
        c6.a aVar = this.f5534h;
        if (aVar == null) {
            aVar = new c6.a(1, false);
            aVar.a(this.f5532f);
            this.f5534h = aVar;
        }
        return aVar.b(z3, z10);
    }
}
