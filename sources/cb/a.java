package cb;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f3438b;

    public a(String str, ArrayList arrayList) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f3437a = str;
        this.f3438b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f3437a.equals(aVar.f3437a) && this.f3438b.equals(aVar.f3438b);
    }

    public final int hashCode() {
        return ((this.f3437a.hashCode() ^ 1000003) * 1000003) ^ this.f3438b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f3437a + ", usedDates=" + this.f3438b + "}";
    }
}
