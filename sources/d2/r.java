package d2;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f4879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f4880b;

    public r(q qVar, p pVar) {
        this.f4879a = qVar;
        this.f4880b = pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return kotlin.jvm.internal.l.a(this.f4880b, rVar.f4880b) && kotlin.jvm.internal.l.a(this.f4879a, rVar.f4879a);
    }

    public final int hashCode() {
        q qVar = this.f4879a;
        int iHashCode = (qVar != null ? qVar.hashCode() : 0) * 31;
        p pVar = this.f4880b;
        return iHashCode + (pVar != null ? pVar.hashCode() : 0);
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=" + this.f4879a + ", paragraphSyle=" + this.f4880b + ')';
    }
}
