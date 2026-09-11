package y;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends t6.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a1.b f19995b;

    public t(a1.b bVar) {
        this.f19995b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && kotlin.jvm.internal.l.a(this.f19995b, ((t) obj).f19995b);
    }

    @Override // t6.k
    public final int g(int i10, q2.l lVar) {
        return this.f19995b.a(0, i10, lVar);
    }

    public final int hashCode() {
        return Float.hashCode(this.f19995b.f185a);
    }

    public final String toString() {
        return "HorizontalCrossAxisAlignment(horizontal=" + this.f19995b + ')';
    }
}
