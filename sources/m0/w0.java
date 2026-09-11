package m0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f11381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f11382c;

    public w0(float f9, long j, long j10) {
        this.f11380a = j;
        this.f11381b = j10;
        this.f11382c = f9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return g1.t.c(this.f11380a, w0Var.f11380a) && g1.t.c(this.f11381b, w0Var.f11381b) && q2.e.a(this.f11382c, w0Var.f11382c);
    }

    public final int hashCode() {
        int i10 = g1.t.f6917o;
        return Float.hashCode(this.f11382c) + s.h0.b(Long.hashCode(this.f11380a) * 31, 31, this.f11381b);
    }
}
