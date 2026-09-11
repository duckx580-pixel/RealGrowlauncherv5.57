package cf;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f3502b = new j(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f3503a;

    public j(boolean z3) {
        this.f3503a = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && this.f3503a == ((j) obj).f3503a;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (Boolean.hashCode(this.f3503a) * 31);
    }

    public final String toString() {
        return "FuzzyScoreOptions(firstMatchCanBeWeak=" + this.f3503a + ", boostFullMatch=true)";
    }
}
