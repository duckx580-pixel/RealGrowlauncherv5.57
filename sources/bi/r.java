package bi;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends q0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final zh.i f3021l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final qg.k f3022m;

    public r(String str, int i10) {
        super(str, null, i10);
        this.f3021l = zh.i.f21365c;
        this.f3022m = android.support.v4.media.session.b.q(new q(i10, str, this));
    }

    @Override // bi.q0, zh.g
    public final xd.c e() {
        return this.f3021l;
    }

    @Override // bi.q0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zh.g)) {
            return false;
        }
        zh.g gVar = (zh.g) obj;
        return gVar.e() == zh.i.f21365c && this.f3011a.equals(gVar.a()) && kotlin.jvm.internal.l.a(o0.b(this), o0.b(gVar));
    }

    @Override // bi.q0
    public final int hashCode() {
        int iHashCode = this.f3011a.hashCode();
        kotlin.jvm.internal.b bVar = new kotlin.jvm.internal.b(this);
        int iHashCode2 = 1;
        while (bVar.hasNext()) {
            int i10 = iHashCode2 * 31;
            String str = (String) bVar.next();
            iHashCode2 = i10 + (str != null ? str.hashCode() : 0);
        }
        return (iHashCode * 31) + iHashCode2;
    }

    @Override // bi.q0, zh.g
    public final zh.g i(int i10) {
        return ((zh.g[]) this.f3022m.getValue())[i10];
    }

    @Override // bi.q0
    public final String toString() {
        return rg.l.j0(new mh.m(3, this), ", ", kotlin.jvm.internal.l.k(this.f3011a, "("), ")", null, 56);
    }
}
