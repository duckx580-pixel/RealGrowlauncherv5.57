package zc;

/* JADX INFO: loaded from: classes.dex */
public final class o2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final o2 f21032f = new o2(0, 0, 0, 0.0d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f21033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f21034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f21035c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f21036d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f21037e;

    public o2(long j, long j10, long j11, double d10) {
        this.f21037e = j;
        this.f21033a = j10;
        this.f21034b = j11;
        this.f21035c = d10;
        this.f21036d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o2.class != obj.getClass()) {
            return false;
        }
        o2 o2Var = (o2) obj;
        return this.f21037e == o2Var.f21037e && this.f21033a == o2Var.f21033a && this.f21034b == o2Var.f21034b && this.f21035c == o2Var.f21035c && this.f21036d == o2Var.f21036d;
    }
}
