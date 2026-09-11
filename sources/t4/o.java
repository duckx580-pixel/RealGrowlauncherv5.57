package t4;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends rg.d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f16589i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f16590r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f16591s;

    public o(int i10, int i11, List list) {
        this.f16589i = i10;
        this.f16590r = i11;
        this.f16591s = list;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // rg.a
    public final int b() {
        return this.f16591s.size() + this.f16589i + this.f16590r;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final Object get(int i10) {
        int i11 = this.f16589i;
        if (i10 >= 0 && i10 < i11) {
            return null;
        }
        ?? r12 = this.f16591s;
        if (i10 < r12.size() + i11 && i11 <= i10) {
            return r12.get(i10 - i11);
        }
        int size = r12.size() + i11;
        if (i10 < b() && size <= i10) {
            return null;
        }
        StringBuilder sbN = android.support.v4.media.session.a.n(i10, "Illegal attempt to access index ", " in ItemSnapshotList of size ");
        sbN.append(b());
        throw new IndexOutOfBoundsException(sbN.toString());
    }
}
