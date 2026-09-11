package r0;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends rg.d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final s0.c f14435i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f14436r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f14437s;

    public a(s0.c cVar, int i10, int i11) {
        this.f14435i = cVar;
        this.f14436r = i10;
        jj.d.m(i10, i11, cVar.size());
        this.f14437s = i11 - i10;
    }

    @Override // rg.a
    public final int b() {
        return this.f14437s;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        jj.d.k(i10, this.f14437s);
        return this.f14435i.get(this.f14436r + i10);
    }

    @Override // rg.d, java.util.List
    public final List subList(int i10, int i11) {
        jj.d.m(i10, i11, this.f14437s);
        int i12 = this.f14436r;
        return new a(this.f14435i, i10 + i12, i12 + i11);
    }
}
