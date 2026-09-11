package r;

import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f14432a = new int[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long[] f14433b = new long[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object[] f14434c = new Object[0];

    public static final int a(int i10, int i11, int[] iArr) {
        l.f("array", iArr);
        int i12 = i10 - 1;
        int i13 = 0;
        while (i13 <= i12) {
            int i14 = (i13 + i12) >>> 1;
            int i15 = iArr[i14];
            if (i15 < i11) {
                i13 = i14 + 1;
            } else {
                if (i15 <= i11) {
                    return i14;
                }
                i12 = i14 - 1;
            }
        }
        return ~i13;
    }

    public static final int b(long[] jArr, int i10, long j) {
        l.f("array", jArr);
        int i11 = i10 - 1;
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) >>> 1;
            long j10 = jArr[i13];
            if (j10 < j) {
                i12 = i13 + 1;
            } else {
                if (j10 <= j) {
                    return i13;
                }
                i11 = i13 - 1;
            }
        }
        return ~i12;
    }

    public static final void c(String str) {
        l.f("message", str);
        throw new IllegalArgumentException(str);
    }
}
