package ij;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f8404b = new int[10];

    public final int a() {
        if ((this.f8403a & 128) != 0) {
            return this.f8404b[7];
        }
        return 65535;
    }

    public final void b(z zVar) {
        kotlin.jvm.internal.l.f("other", zVar);
        for (int i10 = 0; i10 < 10; i10++) {
            if (((1 << i10) & zVar.f8403a) != 0) {
                c(i10, zVar.f8404b[i10]);
            }
        }
    }

    public final void c(int i10, int i11) {
        if (i10 >= 0) {
            int[] iArr = this.f8404b;
            if (i10 >= iArr.length) {
                return;
            }
            this.f8403a = (1 << i10) | this.f8403a;
            iArr[i10] = i11;
        }
    }
}
