package o7;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r7.a f12772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f12773b;

    public b(r7.a aVar, HashMap map) {
        this.f12772a = aVar;
        this.f12773b = map;
    }

    public final long a(e7.b bVar, long j, int i10) {
        long jA = j - this.f12772a.a();
        c cVar = (c) this.f12773b.get(bVar);
        long j10 = cVar.f12774a;
        return Math.min(Math.max((long) (Math.pow(3.0d, i10 - 1) * j10 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j10 > 1 ? j10 : 2L) * ((long) r12)))), jA), cVar.f12775b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f12772a.equals(bVar.f12772a) && this.f12773b.equals(bVar.f12773b);
    }

    public final int hashCode() {
        return ((this.f12772a.hashCode() ^ 1000003) * 1000003) ^ this.f12773b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f12772a + ", values=" + this.f12773b + "}";
    }
}
