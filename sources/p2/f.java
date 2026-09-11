package p2;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f13265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f13266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f13267c;

    static {
        a(0.0f);
        a(0.5f);
        f13265a = 0.5f;
        a(-1.0f);
        f13266b = -1.0f;
        a(1.0f);
        f13267c = 1.0f;
    }

    public static void a(float f9) {
        if ((0.0f > f9 || f9 > 1.0f) && f9 != -1.0f) {
            throw new IllegalStateException("topRatio should be in [0..1] range or -1");
        }
    }
}
