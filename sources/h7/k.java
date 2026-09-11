package h7;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e7.a f7636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f7637b;

    public k(e7.a aVar, byte[] bArr) {
        if (aVar == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f7636a = aVar;
        this.f7637b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f7636a.equals(kVar.f7636a)) {
            return Arrays.equals(this.f7637b, kVar.f7637b);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f7636a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f7637b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f7636a + ", bytes=[...]}";
    }
}
