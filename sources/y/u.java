package y;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends t6.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a1.c f19996b;

    public u(a1.c cVar) {
        this.f19996b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && kotlin.jvm.internal.l.a(this.f19996b, ((u) obj).f19996b);
    }

    @Override // t6.k
    public final int g(int i10, q2.l lVar) {
        return this.f19996b.a(0, i10);
    }

    public final int hashCode() {
        return Float.hashCode(this.f19996b.f186a);
    }

    public final String toString() {
        return "VerticalCrossAxisAlignment(vertical=" + this.f19996b + ')';
    }
}
