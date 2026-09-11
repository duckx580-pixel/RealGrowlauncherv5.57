package t;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public interface f {
    boolean a();

    long b();

    j1 c();

    o d(long j);

    default boolean e(long j) {
        return j >= b();
    }

    Object f(long j);

    Object g();
}
