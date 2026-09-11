package a1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f185a;

    public b(float f9) {
        this.f185a = f9;
    }

    public final int a(int i10, int i11, q2.l lVar) {
        float f9 = (i11 - i10) / 2.0f;
        q2.l lVar2 = q2.l.f13752i;
        float f10 = this.f185a;
        if (lVar != lVar2) {
            f10 *= -1;
        }
        return gh.a.z((1 + f10) * f9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Float.compare(this.f185a, ((b) obj).f185a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f185a);
    }

    public final String toString() {
        return k0.g.h(new StringBuilder("Horizontal(bias="), this.f185a, ')');
    }
}
