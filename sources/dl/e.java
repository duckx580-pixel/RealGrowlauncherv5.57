package dl;

import k0.g;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends f {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f5174i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f5175r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f5176s;

    public e(int i10, int i11, String str) {
        super(str);
        this.f5174i = "reader";
        this.f5175r = i11;
        this.f5176s = i10;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        int i10 = this.f5175r;
        String str = new String(Character.toChars(i10));
        String upperCase = Integer.toHexString(i10).toUpperCase();
        String message = getMessage();
        StringBuilder sbO = g.o("unacceptable code point '", str, "' (0x", upperCase, ") ");
        g.y(sbO, message, "\nin \"", this.f5174i, "\", position ");
        sbO.append(this.f5176s);
        return sbO.toString();
    }
}
