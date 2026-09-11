package s;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kotlin.jvm.internal.m f14964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t.y f14965b;

    /* JADX WARN: Multi-variable type inference failed */
    public n0(eh.c cVar, t.y yVar) {
        this.f14964a = (kotlin.jvm.internal.m) cVar;
        this.f14965b = yVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return this.f14964a.equals(n0Var.f14964a) && this.f14965b.equals(n0Var.f14965b);
    }

    public final int hashCode() {
        return this.f14965b.hashCode() + (this.f14964a.hashCode() * 31);
    }

    public final String toString() {
        return "Slide(slideOffset=" + this.f14964a + ", animationSpec=" + this.f14965b + ')';
    }
}
