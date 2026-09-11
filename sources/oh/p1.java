package oh;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f12905a = new ThreadLocal();

    public static p0 a() {
        ThreadLocal threadLocal = f12905a;
        p0 p0Var = (p0) threadLocal.get();
        if (p0Var != null) {
            return p0Var;
        }
        d dVar = new d(Thread.currentThread());
        threadLocal.set(dVar);
        return dVar;
    }
}
