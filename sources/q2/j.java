package q2;

import s.h0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f13750d;

    public j(int i10, int i11, int i12, int i13) {
        this.f13747a = i10;
        this.f13748b = i11;
        this.f13749c = i12;
        this.f13750d = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f13747a == jVar.f13747a && this.f13748b == jVar.f13748b && this.f13749c == jVar.f13749c && this.f13750d == jVar.f13750d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f13750d) + android.support.v4.media.session.a.z(this.f13749c, android.support.v4.media.session.a.z(this.f13748b, Integer.hashCode(this.f13747a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntRect.fromLTRB(");
        sb2.append(this.f13747a);
        sb2.append(", ");
        sb2.append(this.f13748b);
        sb2.append(", ");
        sb2.append(this.f13749c);
        sb2.append(", ");
        return h0.g(sb2, this.f13750d, ')');
    }
}
