package t6;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f17023b;

    public r2(String str, float f9) {
        this.f17023b = f9;
        this.f17022a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r2)) {
            return false;
        }
        r2 r2Var = (r2) obj;
        return Float.compare(this.f17023b, r2Var.f17023b) == 0 && kotlin.jvm.internal.l.a(this.f17022a, r2Var.f17022a);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.f17023b);
        String str = this.f17022a;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "BatteryData(level=" + this.f17023b + ", charging=" + this.f17022a + ")";
    }
}
