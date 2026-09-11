package q3;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f13763e = new byte[1792];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f13764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public char f13767d;

    static {
        for (int i10 = 0; i10 < 1792; i10++) {
            f13763e[i10] = Character.getDirectionality(i10);
        }
    }

    public a(CharSequence charSequence) {
        this.f13764a = charSequence;
        this.f13765b = charSequence.length();
    }

    public final byte a() {
        int i10 = this.f13766c - 1;
        CharSequence charSequence = this.f13764a;
        char cCharAt = charSequence.charAt(i10);
        this.f13767d = cCharAt;
        if (Character.isLowSurrogate(cCharAt)) {
            int iCodePointBefore = Character.codePointBefore(charSequence, this.f13766c);
            this.f13766c -= Character.charCount(iCodePointBefore);
            return Character.getDirectionality(iCodePointBefore);
        }
        this.f13766c--;
        char c10 = this.f13767d;
        return c10 < 1792 ? f13763e[c10] : Character.getDirectionality(c10);
    }
}
