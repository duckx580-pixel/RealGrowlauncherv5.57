package ka;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 extends k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f9469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f9471c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9472d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f9473e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f9474f;

    public o0(Double d10, int i10, boolean z3, int i11, long j, long j10) {
        this.f9469a = d10;
        this.f9470b = i10;
        this.f9471c = z3;
        this.f9472d = i11;
        this.f9473e = j;
        this.f9474f = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k1) {
            k1 k1Var = (k1) obj;
            Double d10 = this.f9469a;
            if (d10 != null ? d10.equals(((o0) k1Var).f9469a) : ((o0) k1Var).f9469a == null) {
                o0 o0Var = (o0) k1Var;
                if (this.f9470b == o0Var.f9470b && this.f9471c == o0Var.f9471c && this.f9472d == o0Var.f9472d && this.f9473e == o0Var.f9473e && this.f9474f == o0Var.f9474f) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Double d10 = this.f9469a;
        int iHashCode = ((((((((d10 == null ? 0 : d10.hashCode()) ^ 1000003) * 1000003) ^ this.f9470b) * 1000003) ^ (this.f9471c ? 1231 : 1237)) * 1000003) ^ this.f9472d) * 1000003;
        long j = this.f9473e;
        long j10 = this.f9474f;
        return ((iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{batteryLevel=");
        sb2.append(this.f9469a);
        sb2.append(", batteryVelocity=");
        sb2.append(this.f9470b);
        sb2.append(", proximityOn=");
        sb2.append(this.f9471c);
        sb2.append(", orientation=");
        sb2.append(this.f9472d);
        sb2.append(", ramUsed=");
        sb2.append(this.f9473e);
        sb2.append(", diskUsed=");
        return android.support.v4.media.session.a.k(this.f9474f, "}", sb2);
    }
}
