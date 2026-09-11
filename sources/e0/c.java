package e0;

import f1.f;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f5180a;

    public c(float f9) {
        this.f5180a = f9;
        if (f9 < 0.0f || f9 > 100.0f) {
            throw new IllegalArgumentException("The percent should be in the range of [0, 100]");
        }
    }

    @Override // e0.a
    public final float a(long j, q2.b bVar) {
        return (this.f5180a / 100.0f) * f.c(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Float.compare(this.f5180a, ((c) obj).f5180a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f5180a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.f5180a + "%)";
    }
}
