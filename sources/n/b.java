package n;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends gh.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile b f11830g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f11831h = new a(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c f11832f = new c();

    public static b H() {
        if (f11830g != null) {
            return f11830g;
        }
        synchronized (b.class) {
            try {
                if (f11830g == null) {
                    f11830g = new b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f11830g;
    }
}
