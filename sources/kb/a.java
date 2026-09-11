package kb;

import k0.g;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9557b;

    public a(String str, String str2) {
        this.f9556a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f9557b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f9556a.equals(aVar.f9556a) && this.f9557b.equals(aVar.f9557b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f9556a.hashCode() ^ 1000003) * 1000003) ^ this.f9557b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LibraryVersion{libraryName=");
        sb2.append(this.f9556a);
        sb2.append(", version=");
        return g.l(sb2, this.f9557b, "}");
    }
}
