package k2;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9177a;

    public static String a(int i10) {
        return i10 == 0 ? "None" : i10 == 1 ? "Default" : i10 == 2 ? "Go" : i10 == 3 ? "Search" : i10 == 4 ? "Send" : i10 == 5 ? "Previous" : i10 == 6 ? "Next" : i10 == 7 ? "Done" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            return this.f9177a == ((l) obj).f9177a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f9177a);
    }

    public final String toString() {
        return a(this.f9177a);
    }
}
