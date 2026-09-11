package qg;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements Serializable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f13921i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f13922r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f13923s;

    public l(Object obj, Object obj2, Object obj3) {
        this.f13921i = obj;
        this.f13922r = obj2;
        this.f13923s = obj3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return kotlin.jvm.internal.l.a(this.f13921i, lVar.f13921i) && kotlin.jvm.internal.l.a(this.f13922r, lVar.f13922r) && kotlin.jvm.internal.l.a(this.f13923s, lVar.f13923s);
    }

    public final int hashCode() {
        Object obj = this.f13921i;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f13922r;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.f13923s;
        return iHashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f13921i + ", " + this.f13922r + ", " + this.f13923s + ')';
    }
}
