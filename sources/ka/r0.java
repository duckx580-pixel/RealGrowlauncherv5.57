package ka;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 extends o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9500a;

    public r0(String str) {
        this.f9500a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o1)) {
            return false;
        }
        return this.f9500a.equals(((r0) ((o1) obj)).f9500a);
    }

    public final int hashCode() {
        return this.f9500a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return k0.g.l(new StringBuilder("User{identifier="), this.f9500a, "}");
    }
}
