package q1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13717a;

    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            return this.f13717a == ((w) obj).f13717a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f13717a);
    }

    public final String toString() {
        return "PointerKeyboardModifiers(packedValue=" + this.f13717a + ')';
    }
}
