package qg;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements Serializable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f13911i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f13912r;

    public g(Object obj, Object obj2) {
        this.f13911i = obj;
        this.f13912r = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return kotlin.jvm.internal.l.a(this.f13911i, gVar.f13911i) && kotlin.jvm.internal.l.a(this.f13912r, gVar.f13912r);
    }

    public final int hashCode() {
        Object obj = this.f13911i;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f13912r;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f13911i + ", " + this.f13912r + ')';
    }
}
