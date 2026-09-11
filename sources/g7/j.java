package g7;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f7109a;

    public j(h hVar) {
        this.f7109a = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        Object obj2 = p.f7126i;
        if (obj2.equals(obj2)) {
            return this.f7109a.equals(((j) qVar).f7109a);
        }
        return false;
    }

    public final int hashCode() {
        return ((p.f7126i.hashCode() ^ 1000003) * 1000003) ^ this.f7109a.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + p.f7126i + ", androidClientInfo=" + this.f7109a + "}";
    }
}
