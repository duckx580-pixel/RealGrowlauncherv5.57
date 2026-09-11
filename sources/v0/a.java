package v0;

import s.h0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18352a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f18352a == ((a) obj).f18352a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f18352a);
    }

    public final String toString() {
        return h0.g(new StringBuilder("DeltaCounter(count="), this.f18352a, ')');
    }
}
