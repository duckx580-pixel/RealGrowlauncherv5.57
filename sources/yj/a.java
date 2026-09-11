package yj;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f20444c = new a(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20446b;

    public a(int i10, int i11) {
        this.f20445a = Math.max(i10, 0);
        this.f20446b = Math.max(i11, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f20446b == aVar.f20446b && this.f20445a == aVar.f20445a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f20446b + 31) * 31) + this.f20445a;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("{, \"start\": ");
        int i10 = this.f20445a;
        sb2.append(i10);
        sb2.append(", \"end\": ");
        int i11 = this.f20446b;
        sb2.append(i11);
        sb2.append(", \"length\": ");
        sb2.append(i11 - i10);
        sb2.append("}");
        return sb2.toString();
    }
}
