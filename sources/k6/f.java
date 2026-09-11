package k6;

import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f9265c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ud.a f9266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ud.a f9267b;

    static {
        b bVar = b.f9256i;
        f9265c = new f(bVar, bVar);
    }

    public f(ud.a aVar, ud.a aVar2) {
        this.f9266a = aVar;
        this.f9267b = aVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return l.a(this.f9266a, fVar.f9266a) && l.a(this.f9267b, fVar.f9267b);
    }

    public final int hashCode() {
        return this.f9267b.hashCode() + (this.f9266a.hashCode() * 31);
    }

    public final String toString() {
        return "Size(width=" + this.f9266a + ", height=" + this.f9267b + ')';
    }
}
