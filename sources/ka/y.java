package ka;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9553b;

    public y(String str, String str2) {
        this.f9552a = str;
        this.f9553b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x0) {
            y yVar = (y) ((x0) obj);
            if (this.f9552a.equals(yVar.f9552a) && this.f9553b.equals(yVar.f9553b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f9552a.hashCode() ^ 1000003) * 1000003) ^ this.f9553b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CustomAttribute{key=");
        sb2.append(this.f9552a);
        sb2.append(", value=");
        return k0.g.l(sb2, this.f9553b, "}");
    }
}
