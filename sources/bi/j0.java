package bi;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 implements Map.Entry, fh.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f2979i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f2980r;

    public j0(Object obj, Object obj2) {
        this.f2979i = obj;
        this.f2980r = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return kotlin.jvm.internal.l.a(this.f2979i, j0Var.f2979i) && kotlin.jvm.internal.l.a(this.f2980r, j0Var.f2980r);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f2979i;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f2980r;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f2979i;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f2980r;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        return "MapEntry(key=" + this.f2979i + ", value=" + this.f2980r + ')';
    }
}
