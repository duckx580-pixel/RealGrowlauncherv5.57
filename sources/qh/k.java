package qh;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f13970b = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f13971a;

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return kotlin.jvm.internal.l.a(this.f13971a, ((k) obj).f13971a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f13971a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f13971a;
        if (obj instanceof i) {
            return ((i) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
