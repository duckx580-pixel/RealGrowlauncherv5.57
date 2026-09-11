package vk;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final char[] f18723c = "0123456789ABCDEF".toCharArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean[] f18724b;

    public a() {
        if ("-_.!~*'()@:$&,;=[]/".matches(".*[0-9A-Za-z].*")) {
            throw new IllegalArgumentException("Alphanumeric characters are always 'safe' and should not be explicitly specified");
        }
        char[] charArray = "-_.!~*'()@:$&,;=[]/".toCharArray();
        int iMax = 122;
        for (char c10 : charArray) {
            iMax = Math.max((int) c10, iMax);
        }
        boolean[] zArr = new boolean[iMax + 1];
        for (int i10 = 48; i10 <= 57; i10++) {
            zArr[i10] = true;
        }
        for (int i11 = 65; i11 <= 90; i11++) {
            zArr[i11] = true;
        }
        for (int i12 = 97; i12 <= 122; i12++) {
            zArr[i12] = true;
        }
        for (char c11 : charArray) {
            zArr[c11] = true;
        }
        this.f18724b = zArr;
    }
}
