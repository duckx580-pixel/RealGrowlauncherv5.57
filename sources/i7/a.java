package i7;

import t.g;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f8102b;

    public a(long j, int i10) {
        if (i10 == 0) {
            throw new NullPointerException("Null status");
        }
        this.f8101a = i10;
        this.f8102b = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return g.a(this.f8101a, aVar.f8101a) && this.f8102b == aVar.f8102b;
    }

    public final int hashCode() {
        int iC = (g.c(this.f8101a) ^ 1000003) * 1000003;
        long j = this.f8102b;
        return iC ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BackendResponse{status=");
        int i10 = this.f8101a;
        sb2.append(i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "null" : "INVALID_PAYLOAD" : "FATAL_ERROR" : "TRANSIENT_ERROR" : "OK");
        sb2.append(", nextRequestWaitMillis=");
        return android.support.v4.media.session.a.k(this.f8102b, "}", sb2);
    }
}
