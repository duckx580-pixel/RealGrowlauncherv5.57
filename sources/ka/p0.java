package ka;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 extends l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9481a;

    public p0(String str) {
        this.f9481a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l1)) {
            return false;
        }
        return this.f9481a.equals(((p0) ((l1) obj)).f9481a);
    }

    public final int hashCode() {
        return this.f9481a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return k0.g.l(new StringBuilder("Log{content="), this.f9481a, "}");
    }
}
