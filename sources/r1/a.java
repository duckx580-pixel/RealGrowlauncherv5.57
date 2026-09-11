package r1;

import k0.g;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f14438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f14439b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f14438a == aVar.f14438a && Float.compare(this.f14439b, aVar.f14439b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f14439b) + (Long.hashCode(this.f14438a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DataPointAtTime(time=");
        sb2.append(this.f14438a);
        sb2.append(", dataPoint=");
        return g.h(sb2, this.f14439b, ')');
    }
}
