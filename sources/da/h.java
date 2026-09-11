package da;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f5003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f5004b;

    public h(Class cls, boolean z3) {
        this.f5003a = cls;
        this.f5004b = z3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (hVar.f5003a.equals(this.f5003a) && hVar.f5004b == this.f5004b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f5003a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f5004b).hashCode();
    }
}
