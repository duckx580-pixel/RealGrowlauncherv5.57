package o7;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f12775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f12776c;

    public c(long j, long j10, Set set) {
        this.f12774a = j;
        this.f12775b = j10;
        this.f12776c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f12774a == cVar.f12774a && this.f12775b == cVar.f12775b && this.f12776c.equals(cVar.f12776c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f12774a;
        int i10 = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j10 = this.f12775b;
        return ((i10 ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003) ^ this.f12776c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f12774a + ", maxAllowedDelay=" + this.f12775b + ", flags=" + this.f12776c + "}";
    }
}
