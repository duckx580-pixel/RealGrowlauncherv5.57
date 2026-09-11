package h1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f7420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f7421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f7422c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f7423d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f7424e = 0;

    static {
        long j = 3;
        long j10 = j << 32;
        f7420a = (((long) 0) & 4294967295L) | j10;
        f7421b = (((long) 1) & 4294967295L) | j10;
        f7422c = j10 | (((long) 2) & 4294967295L);
        f7423d = (j & 4294967295L) | (((long) 4) << 32);
    }

    public static final boolean a(long j, long j10) {
        return j == j10;
    }

    public static String b(long j) {
        return a(j, f7420a) ? "Rgb" : a(j, f7421b) ? "Xyz" : a(j, f7422c) ? "Lab" : a(j, f7423d) ? "Cmyk" : "Unknown";
    }
}
