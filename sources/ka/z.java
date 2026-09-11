package ka;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class z extends z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r1 f9554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9555b;

    public z(r1 r1Var, String str) {
        this.f9554a = r1Var;
        this.f9555b = str;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof z0) {
            z zVar = (z) ((z0) obj);
            String str2 = zVar.f9555b;
            if (this.f9554a.f9501i.equals(zVar.f9554a) && ((str = this.f9555b) != null ? str.equals(str2) : str2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f9554a.f9501i.hashCode() ^ 1000003) * 1000003;
        String str = this.f9555b;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FilesPayload{files=");
        sb2.append(this.f9554a);
        sb2.append(", orgId=");
        return k0.g.l(sb2, this.f9555b, "}");
    }
}
