package t9;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final char[] f17157d;

    public b(a aVar) {
        super(aVar, (Character) null);
        this.f17157d = new char[512];
        char[] cArr = aVar.f17152b;
        if (cArr.length != 16) {
            throw new IllegalArgumentException();
        }
        for (int i10 = 0; i10 < 256; i10++) {
            char[] cArr2 = this.f17157d;
            cArr2[i10] = cArr[i10 >>> 4];
            cArr2[i10 | 256] = cArr[i10 & 15];
        }
    }
}
