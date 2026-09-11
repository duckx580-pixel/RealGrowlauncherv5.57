package s;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t.y f14944a;

    public g0(t.y yVar) {
        this.f14944a = yVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g0) {
            return Float.compare(0.0f, 0.0f) == 0 && kotlin.jvm.internal.l.a(this.f14944a, ((g0) obj).f14944a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14944a.hashCode() + (Float.hashCode(0.0f) * 31);
    }

    public final String toString() {
        return "Fade(alpha=0.0, animationSpec=" + this.f14944a + ')';
    }
}
