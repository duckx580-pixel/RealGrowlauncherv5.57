package a1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f186a;

    public c(float f9) {
        this.f186a = f9;
    }

    public final int a(int i10, int i11) {
        return gh.a.z((1 + this.f186a) * ((i11 - i10) / 2.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Float.compare(this.f186a, ((c) obj).f186a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f186a);
    }

    public final String toString() {
        return k0.g.h(new StringBuilder("Vertical(bias="), this.f186a, ')');
    }
}
