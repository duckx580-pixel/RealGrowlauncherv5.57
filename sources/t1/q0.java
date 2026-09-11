package t1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f16308i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f16309r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f16310s = te.a.c(0, 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f16311t = s0.f16318a;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f16312u;

    public q0() {
        int i10 = q2.i.f13745c;
        this.f16312u = q2.i.f13744b;
    }

    public abstract int P(l lVar);

    public int R() {
        return (int) (this.f16310s & 4294967295L);
    }

    public int a0() {
        return (int) (this.f16310s >> 32);
    }

    public final void d0() {
        this.f16308i = gh.a.e((int) (this.f16310s >> 32), q2.a.j(this.f16311t), q2.a.h(this.f16311t));
        int iE = gh.a.e((int) (this.f16310s & 4294967295L), q2.a.i(this.f16311t), q2.a.g(this.f16311t));
        this.f16309r = iE;
        int i10 = this.f16308i;
        long j = this.f16310s;
        this.f16312u = t6.k.b((i10 - ((int) (j >> 32))) / 2, (iE - ((int) (j & 4294967295L))) / 2);
    }

    public abstract void g0(long j, float f9, eh.c cVar);

    public final void i0(long j) {
        if (q2.k.a(this.f16310s, j)) {
            return;
        }
        this.f16310s = j;
        d0();
    }

    public final void j0(long j) {
        if (q2.a.b(this.f16311t, j)) {
            return;
        }
        this.f16311t = j;
        d0();
    }

    public Object u() {
        return null;
    }
}
