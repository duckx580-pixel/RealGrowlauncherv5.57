package qf;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long[] f13902i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f13903r;

    public b(long[] jArr, int i10) {
        this.f13902i = jArr;
        this.f13903r = i10;
    }

    @Override // qf.c
    public final int e() {
        return this.f13902i.length;
    }

    @Override // qf.c
    public final int g(int i10) {
        return (int) (this.f13902i[i10] >> 32);
    }

    @Override // qf.c
    public final int i(int i10) {
        return i10 == this.f13902i.length + (-1) ? this.f13903r : g(i10 + 1);
    }

    @Override // qf.c
    public final boolean m(int i10) {
        return (((int) (this.f13902i[i10] & 4294967295L)) & 1) == 1;
    }
}
