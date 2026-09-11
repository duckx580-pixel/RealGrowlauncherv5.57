package p7;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f13332f = new a(10485760, 200, 10000, 604800000, 81920);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f13336d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f13337e;

    public a(long j, int i10, int i11, long j10, int i12) {
        this.f13333a = j;
        this.f13334b = i10;
        this.f13335c = i11;
        this.f13336d = j10;
        this.f13337e = i12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f13333a == aVar.f13333a && this.f13334b == aVar.f13334b && this.f13335c == aVar.f13335c && this.f13336d == aVar.f13336d && this.f13337e == aVar.f13337e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f13333a;
        int i10 = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f13334b) * 1000003) ^ this.f13335c) * 1000003;
        long j10 = this.f13336d;
        return ((i10 ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003) ^ this.f13337e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb2.append(this.f13333a);
        sb2.append(", loadBatchSize=");
        sb2.append(this.f13334b);
        sb2.append(", criticalSectionEnterTimeoutMs=");
        sb2.append(this.f13335c);
        sb2.append(", eventCleanUpAge=");
        sb2.append(this.f13336d);
        sb2.append(", maxBlobByteSizePerRow=");
        return k0.g.i(sb2, this.f13337e, "}");
    }
}
