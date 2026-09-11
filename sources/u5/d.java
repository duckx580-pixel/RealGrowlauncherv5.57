package u5;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f17651b;

    public d(String str, Long l10) {
        this.f17650a = str;
        this.f17651b = l10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return kotlin.jvm.internal.l.a(this.f17650a, dVar.f17650a) && kotlin.jvm.internal.l.a(this.f17651b, dVar.f17651b);
    }

    public final int hashCode() {
        int iHashCode = this.f17650a.hashCode() * 31;
        Long l10 = this.f17651b;
        return iHashCode + (l10 == null ? 0 : l10.hashCode());
    }

    public final String toString() {
        return "Preference(key=" + this.f17650a + ", value=" + this.f17651b + ')';
    }
}
