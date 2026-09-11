package q2;

import s.h0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f13744b = t6.k.b(0, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f13745c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13746a;

    public /* synthetic */ i(long j) {
        this.f13746a = j;
    }

    public static long a(long j, int i10, int i11, int i12) {
        if ((i12 & 1) != 0) {
            i10 = (int) (j >> 32);
        }
        if ((i12 & 2) != 0) {
            i11 = (int) (j & 4294967295L);
        }
        return t6.k.b(i10, i11);
    }

    public static final boolean b(long j, long j10) {
        return j == j10;
    }

    public static String c(long j) {
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append((int) (j >> 32));
        sb2.append(", ");
        return h0.g(sb2, (int) (j & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f13746a == ((i) obj).f13746a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f13746a);
    }

    public final String toString() {
        return c(this.f13746a);
    }
}
