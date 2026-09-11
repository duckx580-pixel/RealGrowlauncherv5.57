package i;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static l0 f7861d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f7862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f7863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7864c;

    public final void a(long j, double d10, double d11) {
        double d12 = (0.01720197f * ((j - 946728000000L) / 8.64E7f)) + 6.24006f;
        double dSin = (Math.sin(r3 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * r3) * 3.4906598739326E-4d) + (Math.sin(d12) * 0.03341960161924362d) + d12 + 1.796593063d + 3.141592653589793d;
        double dSin2 = (Math.sin(2.0d * dSin) * (-0.0069d)) + (Math.sin(d12) * 0.0053d) + ((double) (Math.round(((double) (r2 - 9.0E-4f)) - r6) + 9.0E-4f)) + ((-d11) / 360.0d);
        double dAsin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(dSin));
        double d13 = 0.01745329238474369d * d10;
        double dSin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(dAsin) * Math.sin(d13))) / (Math.cos(dAsin) * Math.cos(d13));
        if (dSin3 >= 1.0d) {
            this.f7864c = 1;
            this.f7862a = -1L;
            this.f7863b = -1L;
        } else {
            if (dSin3 <= -1.0d) {
                this.f7864c = 0;
                this.f7862a = -1L;
                this.f7863b = -1L;
                return;
            }
            double dAcos = (float) (Math.acos(dSin3) / 6.283185307179586d);
            this.f7862a = Math.round((dSin2 + dAcos) * 8.64E7d) + 946728000000L;
            long jRound = Math.round((dSin2 - dAcos) * 8.64E7d) + 946728000000L;
            this.f7863b = jRound;
            if (jRound >= j || this.f7862a <= j) {
                this.f7864c = 1;
            } else {
                this.f7864c = 0;
            }
        }
    }
}
