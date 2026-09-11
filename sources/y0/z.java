package y0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z implements y {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final o0.d f20125i = new o0.d(0);

    public final boolean d(int i10) {
        return (i10 & this.f20125i.get()) != 0;
    }

    public final void e(int i10) {
        o0.d dVar;
        int i11;
        do {
            dVar = this.f20125i;
            i11 = dVar.get();
            if ((i11 & i10) != 0) {
                return;
            }
        } while (!dVar.compareAndSet(i11, i11 | i10));
    }
}
