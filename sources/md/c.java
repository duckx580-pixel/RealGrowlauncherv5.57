package md;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11656c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f11657d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f11658e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f11659f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f11660g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f11661h;

    public c(int i10, int i11, int i12, float f9, int i13, int i14, int i15, boolean z3) {
        this.f11655b = i10;
        this.f11658e = i11;
        this.f11659f = i12;
        this.f11657d = f9;
        this.f11654a = i13;
        this.f11656c = i14;
        this.f11661h = i15;
        this.f11660g = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f11655b == cVar.f11655b && this.f11658e == cVar.f11658e && this.f11659f == cVar.f11659f && Float.compare(this.f11657d, cVar.f11657d) == 0 && this.f11654a == cVar.f11654a && this.f11656c == cVar.f11656c && this.f11661h == cVar.f11661h && this.f11660g == cVar.f11660g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [int] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f11655b);
        int iHashCode2 = Integer.hashCode(this.f11658e);
        int iHashCode3 = Integer.hashCode(this.f11659f);
        int iHashCode4 = Float.hashCode(this.f11657d);
        int iHashCode5 = Integer.hashCode(this.f11654a);
        int iHashCode6 = Integer.hashCode(this.f11656c);
        int iHashCode7 = Integer.hashCode(this.f11661h);
        boolean z3 = this.f11660g;
        ?? r72 = z3;
        if (z3) {
            r72 = 1;
        }
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + r72;
    }

    public final String toString() {
        return "RequestPolicy(maxDuration=" + this.f11655b + ", retryMaxInterval=" + this.f11658e + ", retryWaitBase=" + this.f11659f + ", retryJitterPct=" + this.f11657d + ", connectTimeout=" + this.f11654a + ", readTimeout=" + this.f11656c + ", writeTimeout=" + this.f11661h + ", shouldStoreLocally=" + this.f11660g + ')';
    }
}
