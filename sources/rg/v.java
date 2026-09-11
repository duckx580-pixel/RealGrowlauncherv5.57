package rg;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f14668b;

    public v(int i10, Object obj) {
        this.f14667a = i10;
        this.f14668b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f14667a == vVar.f14667a && kotlin.jvm.internal.l.a(this.f14668b, vVar.f14668b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f14667a) * 31;
        Object obj = this.f14668b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.f14667a + ", value=" + this.f14668b + ')';
    }
}
