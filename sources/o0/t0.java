package o0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12580a;

    public t0(String str) {
        this.f12580a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t0) && kotlin.jvm.internal.l.a(this.f12580a, ((t0) obj).f12580a);
    }

    public final int hashCode() {
        return this.f12580a.hashCode();
    }

    public final String toString() {
        return k0.g.k(new StringBuilder("OpaqueKey(key="), this.f12580a, ')');
    }
}
