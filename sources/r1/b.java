package r1;

import java.util.Arrays;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f14440a = new long[64];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14441b;

    public void a(long j) {
        int i10 = this.f14441b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f14440a[i11] == j) {
                return;
            }
        }
        int i12 = this.f14441b;
        long[] jArr = this.f14440a;
        if (i12 >= jArr.length) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, Math.max(i12 + 1, jArr.length * 2));
            l.e("copyOf(this, newSize)", jArrCopyOf);
            this.f14440a = jArrCopyOf;
        }
        this.f14440a[i12] = j;
        if (i12 >= this.f14441b) {
            this.f14441b = i12 + 1;
        }
    }

    public long b(int i10) {
        if (i10 >= this.f14441b || i10 < 0) {
            throw new ArrayIndexOutOfBoundsException(i10);
        }
        return this.f14440a[i10];
    }

    public void c(int i10) {
        int i11 = this.f14441b;
        if (i10 < i11) {
            int i12 = i11 - 1;
            while (i10 < i12) {
                long[] jArr = this.f14440a;
                int i13 = i10 + 1;
                jArr[i10] = jArr[i13];
                i10 = i13;
            }
            this.f14441b--;
        }
    }
}
