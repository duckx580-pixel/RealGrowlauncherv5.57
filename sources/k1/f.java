package k1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final n9.e f9024k = new n9.e(8);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f9025l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f9027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f9028c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f9029d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f9030e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g0 f9031f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f9032g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f9033h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f9034i;
    public final int j;

    public f(String str, float f9, float f10, float f11, float f12, g0 g0Var, long j, int i10, boolean z3) {
        int i11;
        synchronized (f9024k) {
            i11 = f9025l;
            f9025l = i11 + 1;
        }
        this.f9026a = str;
        this.f9027b = f9;
        this.f9028c = f10;
        this.f9029d = f11;
        this.f9030e = f12;
        this.f9031f = g0Var;
        this.f9032g = j;
        this.f9033h = i10;
        this.f9034i = z3;
        this.j = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return kotlin.jvm.internal.l.a(this.f9026a, fVar.f9026a) && q2.e.a(this.f9027b, fVar.f9027b) && q2.e.a(this.f9028c, fVar.f9028c) && this.f9029d == fVar.f9029d && this.f9030e == fVar.f9030e && this.f9031f.equals(fVar.f9031f) && g1.t.c(this.f9032g, fVar.f9032g) && this.f9033h == fVar.f9033h && this.f9034i == fVar.f9034i;
    }

    public final int hashCode() {
        int iHashCode = (this.f9031f.hashCode() + s.h0.a(s.h0.a(s.h0.a(s.h0.a(this.f9026a.hashCode() * 31, this.f9027b, 31), this.f9028c, 31), this.f9029d, 31), this.f9030e, 31)) * 31;
        int i10 = g1.t.f6917o;
        return Boolean.hashCode(this.f9034i) + android.support.v4.media.session.a.z(this.f9033h, s.h0.b(iHashCode, 31, this.f9032g), 31);
    }
}
