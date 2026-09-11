package i1;

import g1.r;
import q2.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public q2.b f7981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l f7982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public r f7983c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f7984d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return kotlin.jvm.internal.l.a(this.f7981a, aVar.f7981a) && this.f7982b == aVar.f7982b && kotlin.jvm.internal.l.a(this.f7983c, aVar.f7983c) && f1.f.a(this.f7984d, aVar.f7984d);
    }

    public final int hashCode() {
        int iHashCode = (this.f7983c.hashCode() + ((this.f7982b.hashCode() + (this.f7981a.hashCode() * 31)) * 31)) * 31;
        long j = this.f7984d;
        int i10 = f1.f.f5993d;
        return Long.hashCode(j) + iHashCode;
    }

    public final String toString() {
        return "DrawParams(density=" + this.f7981a + ", layoutDirection=" + this.f7982b + ", canvas=" + this.f7983c + ", size=" + ((Object) f1.f.f(this.f7984d)) + ')';
    }
}
