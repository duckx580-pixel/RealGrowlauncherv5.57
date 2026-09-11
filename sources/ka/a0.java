package ka;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f9321b;

    public a0(String str, byte[] bArr) {
        this.f9320a = str;
        this.f9321b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y0) {
            y0 y0Var = (y0) obj;
            a0 a0Var = (a0) y0Var;
            if (this.f9320a.equals(a0Var.f9320a)) {
                if (Arrays.equals(this.f9321b, y0Var instanceof a0 ? ((a0) y0Var).f9321b : a0Var.f9321b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f9320a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f9321b);
    }

    public final String toString() {
        return "File{filename=" + this.f9320a + ", contents=" + Arrays.toString(this.f9321b) + "}";
    }
}
