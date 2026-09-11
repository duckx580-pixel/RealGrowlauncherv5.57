package di;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends androidx.appcompat.widget.a {
    @Override // androidx.appcompat.widget.a
    public final void d(byte b4) {
        h(String.valueOf(b4 & 255));
    }

    @Override // androidx.appcompat.widget.a
    public final void f(int i10) {
        h(String.valueOf(((long) i10) & 4294967295L));
    }

    @Override // androidx.appcompat.widget.a
    public final void g(long j) {
        h(qg.m.a(j));
    }

    @Override // androidx.appcompat.widget.a
    public final void i(short s2) {
        h(String.valueOf(s2 & 65535));
    }
}
