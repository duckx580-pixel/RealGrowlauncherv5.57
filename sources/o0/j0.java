package o0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f12449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f12450b;

    public j0(Object obj, Object obj2) {
        this.f12449a = obj;
        this.f12450b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return kotlin.jvm.internal.l.a(this.f12449a, j0Var.f12449a) && kotlin.jvm.internal.l.a(this.f12450b, j0Var.f12450b);
    }

    public final int hashCode() {
        Object obj = this.f12449a;
        int iHashCode = 0;
        int iOrdinal = (obj instanceof Enum ? ((Enum) obj).ordinal() : obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f12450b;
        if (obj2 instanceof Enum) {
            iHashCode = ((Enum) obj2).ordinal();
        } else if (obj2 != null) {
            iHashCode = obj2.hashCode();
        }
        return iHashCode + iOrdinal;
    }

    public final String toString() {
        return "JoinedKey(left=" + this.f12449a + ", right=" + this.f12450b + ')';
    }
}
