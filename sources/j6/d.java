package j6;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k6.g f8795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k6.e f8796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k6.d f8797c;

    public d(k6.g gVar, k6.e eVar, k6.d dVar) {
        this.f8795a = gVar;
        this.f8796b = eVar;
        this.f8797c = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return kotlin.jvm.internal.l.a(this.f8795a, dVar.f8795a) && this.f8796b == dVar.f8796b && this.f8797c == dVar.f8797c;
    }

    public final int hashCode() {
        k6.g gVar = this.f8795a;
        int iHashCode = (gVar != null ? gVar.hashCode() : 0) * 31;
        k6.e eVar = this.f8796b;
        int iHashCode2 = (iHashCode + (eVar != null ? eVar.hashCode() : 0)) * 887503681;
        k6.d dVar = this.f8797c;
        return (iHashCode2 + (dVar != null ? dVar.hashCode() : 0)) * 887503681;
    }
}
