package q;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class z extends rg.w {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f13633i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y f13634r;

    public z(y yVar) {
        this.f13634r = yVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f13633i < this.f13634r.f();
    }

    @Override // rg.w
    public final int nextInt() {
        int i10 = this.f13633i;
        this.f13633i = i10 + 1;
        return this.f13634r.d(i10);
    }
}
