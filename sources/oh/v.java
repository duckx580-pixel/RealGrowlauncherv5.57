package oh;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends ug.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final t f12924s = new t();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f12925r;

    public v(String str) {
        super(f12924s);
        this.f12925r = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && kotlin.jvm.internal.l.a(this.f12925r, ((v) obj).f12925r);
    }

    public final int hashCode() {
        return this.f12925r.hashCode();
    }

    public final String toString() {
        return k0.g.k(new StringBuilder("CoroutineName("), this.f12925r, ')');
    }
}
