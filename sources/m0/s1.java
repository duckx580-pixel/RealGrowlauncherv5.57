package m0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11231a;

    public final boolean equals(Object obj) {
        if (obj instanceof s1) {
            return this.f11231a == ((s1) obj).f11231a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f11231a);
    }

    public final String toString() {
        return this.f11231a == 0 ? "FabPosition.Center" : "FabPosition.End";
    }
}
