package bi;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean[] f2948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2949b;

    @Override // bi.r0
    public final Object a() {
        boolean[] zArrCopyOf = Arrays.copyOf(this.f2948a, this.f2949b);
        kotlin.jvm.internal.l.e("java.util.Arrays.copyOf(this, newSize)", zArrCopyOf);
        return zArrCopyOf;
    }

    @Override // bi.r0
    public final void b(int i10) {
        boolean[] zArr = this.f2948a;
        if (zArr.length < i10) {
            int length = zArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            boolean[] zArrCopyOf = Arrays.copyOf(zArr, i10);
            kotlin.jvm.internal.l.e("java.util.Arrays.copyOf(this, newSize)", zArrCopyOf);
            this.f2948a = zArrCopyOf;
        }
    }

    @Override // bi.r0
    public final int d() {
        return this.f2949b;
    }
}
