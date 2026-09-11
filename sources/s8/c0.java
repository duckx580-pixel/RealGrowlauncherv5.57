package s8;

import java.math.BigInteger;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends p0 {
    public String A;
    public int B;
    public String C;
    public String D;
    public String E;
    public long F;
    public String G;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f15274t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f15275u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f15276v;
    public String w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f15277x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final long f15278y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public List f15279z;

    public c0(y0 y0Var, long j) {
        super(y0Var);
        this.F = 0L;
        this.G = null;
        this.f15278y = j;
    }

    @Override // s8.p0
    public final boolean w() {
        return true;
    }

    public final String x() {
        u();
        b8.a0.h(this.f15274t);
        return this.f15274t;
    }

    public final String y() {
        t();
        u();
        b8.a0.h(this.C);
        return this.C;
    }

    public final void z() {
        String str;
        t();
        y0 y0Var = (y0) this.f3470r;
        r0 r0Var = y0Var.f15664x;
        i0 i0Var = y0Var.f15665y;
        y0.h(r0Var);
        if (r0Var.y().f(h.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            e3 e3Var = y0Var.B;
            y0.h(e3Var);
            e3Var.B().nextBytes(bArr);
            str = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            y0.k(i0Var);
            i0Var.D.b("Analytics Storage consent is not granted");
            str = null;
        }
        y0.k(i0Var);
        i0Var.D.b("Resetting session stitching token to ".concat(str == null ? "null" : "not null"));
        this.E = str;
        y0Var.D.getClass();
        this.F = System.currentTimeMillis();
    }
}
