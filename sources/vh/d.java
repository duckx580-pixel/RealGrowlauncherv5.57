package vh;

import oh.s;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends g {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final d f18692t;

    static {
        int i10 = j.f18700c;
        int i11 = j.f18701d;
        long j = j.f18702e;
        String str = j.f18698a;
        d dVar = new d();
        dVar.f18694s = new b(i10, i11, j, str);
        f18692t = dVar;
    }

    @Override // oh.s
    public final s W(int i10) {
        th.a.a(1);
        return 1 >= j.f18700c ? this : super.W(1);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // oh.s
    public final String toString() {
        return "Dispatchers.Default";
    }
}
