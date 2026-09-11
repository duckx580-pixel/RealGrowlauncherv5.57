package p7;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h7.i f13339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h7.h f13340c;

    public b(long j, h7.i iVar, h7.h hVar) {
        this.f13338a = j;
        this.f13339b = iVar;
        this.f13340c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f13338a == bVar.f13338a && this.f13339b.equals(bVar.f13339b) && this.f13340c.equals(bVar.f13340c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f13338a;
        return ((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.f13339b.hashCode()) * 1000003) ^ this.f13340c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f13338a + ", transportContext=" + this.f13339b + ", event=" + this.f13340c + "}";
    }
}
