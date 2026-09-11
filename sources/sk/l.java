package sk;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f15911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15913c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15914d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15915e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f15916f;

    public l(byte[] bArr, int i10, int i11) {
        this.f15911a = bArr;
        this.f15912b = i10;
        this.f15913c = i11;
    }

    public final String toString() {
        int i10 = this.f15913c;
        int i11 = this.f15912b;
        StringBuilder sb2 = new StringBuilder(new String(this.f15911a, i11, i10 - i11).concat(" "));
        int i12 = this.f15914d;
        if (i12 == 0) {
            sb2.append("-");
        } else if (i12 == 1) {
            sb2.append(this.f15915e);
        } else {
            for (int i13 = 0; i13 < this.f15914d; i13++) {
                if (i13 > 0) {
                    sb2.append(", ");
                }
                sb2.append(this.f15916f[i13]);
            }
        }
        return sb2.toString();
    }
}
