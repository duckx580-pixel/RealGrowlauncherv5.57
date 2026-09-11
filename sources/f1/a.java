package f1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f5967a = u5.f.f(0.0f, 0.0f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f5968b = 0;

    public static final boolean a(long j, long j10) {
        return j == j10;
    }

    public static final float b(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float c(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static String d(long j) {
        if (b(j) == c(j)) {
            return "CornerRadius.circular(" + ud.a.s(b(j)) + ')';
        }
        return "CornerRadius.elliptical(" + ud.a.s(b(j)) + ", " + ud.a.s(c(j)) + ')';
    }
}
