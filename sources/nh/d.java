package nh;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kh.d f12303b;

    public d(String str, kh.d dVar) {
        this.f12302a = str;
        this.f12303b = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return kotlin.jvm.internal.l.a(this.f12302a, dVar.f12302a) && kotlin.jvm.internal.l.a(this.f12303b, dVar.f12303b);
    }

    public final int hashCode() {
        return this.f12303b.hashCode() + (this.f12302a.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.f12302a + ", range=" + this.f12303b + ')';
    }
}
