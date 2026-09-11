package p2;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f13268b = new g(f.f13266b);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f13269a;

    public g(float f9) {
        this.f13269a = f9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        float f9 = ((g) obj).f13269a;
        float f10 = f.f13265a;
        return Float.compare(this.f13269a, f9) == 0;
    }

    public final int hashCode() {
        float f9 = f.f13265a;
        return Integer.hashCode(17) + (Float.hashCode(this.f13269a) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("LineHeightStyle(alignment=");
        float f9 = this.f13269a;
        if (f9 == 0.0f) {
            float f10 = f.f13265a;
            str = "LineHeightStyle.Alignment.Top";
        } else if (f9 == f.f13265a) {
            str = "LineHeightStyle.Alignment.Center";
        } else if (f9 == f.f13266b) {
            str = "LineHeightStyle.Alignment.Proportional";
        } else if (f9 == f.f13267c) {
            str = "LineHeightStyle.Alignment.Bottom";
        } else {
            str = "LineHeightStyle.Alignment(topPercentage = " + f9 + ')';
        }
        sb2.append((Object) str);
        sb2.append(", trim=");
        sb2.append((Object) "LineHeightStyle.Trim.Both");
        sb2.append(')');
        return sb2.toString();
    }
}
