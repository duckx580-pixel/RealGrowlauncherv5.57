package e7;

import k0.g;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5413a;

    public a(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f5413a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        return this.f5413a.equals(((a) obj).f5413a);
    }

    public final int hashCode() {
        return this.f5413a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return g.l(new StringBuilder("Encoding{name=\""), this.f5413a, "\"}");
    }
}
