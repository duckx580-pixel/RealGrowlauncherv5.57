package p2;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r f13288c = new r(2, false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final r f13289d = new r(1, true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f13291b;

    public r(int i10, boolean z3) {
        this.f13290a = i10;
        this.f13291b = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f13290a == rVar.f13290a && this.f13291b == rVar.f13291b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f13291b) + (Integer.hashCode(this.f13290a) * 31);
    }

    public final String toString() {
        return equals(f13288c) ? "TextMotion.Static" : equals(f13289d) ? "TextMotion.Animated" : "Invalid";
    }
}
