package t6;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class w2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f17092c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f17093d;

    public w2(int i10, int i11, long j, String str) {
        this.f17093d = str;
        this.f17090a = i10;
        this.f17091b = i11;
        this.f17092c = j;
    }

    public final boolean equals(Object obj) {
        String str;
        if (this == obj) {
            return true;
        }
        if (obj == null || w2.class != obj.getClass()) {
            return false;
        }
        w2 w2Var = (w2) obj;
        return this.f17090a == w2Var.f17090a && this.f17091b == w2Var.f17091b && this.f17092c == w2Var.f17092c && (str = this.f17093d) != null && str.equals(w2Var.f17093d);
    }

    public final int hashCode() {
        String str = this.f17093d;
        return ((((((str != null ? str.hashCode() : 0) * 31) + this.f17090a) * 31) + this.f17091b) * 31) + ((int) this.f17092c);
    }
}
