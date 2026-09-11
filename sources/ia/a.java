package ia;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ka.w f8170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f8172c;

    public a(ka.w wVar, String str, File file) {
        this.f8170a = wVar;
        if (str == null) {
            throw new NullPointerException("Null sessionId");
        }
        this.f8171b = str;
        this.f8172c = file;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f8170a.equals(aVar.f8170a) && this.f8171b.equals(aVar.f8171b) && this.f8172c.equals(aVar.f8172c);
    }

    public final int hashCode() {
        return ((((this.f8170a.hashCode() ^ 1000003) * 1000003) ^ this.f8171b.hashCode()) * 1000003) ^ this.f8172c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f8170a + ", sessionId=" + this.f8171b + ", reportFile=" + this.f8172c + "}";
    }
}
