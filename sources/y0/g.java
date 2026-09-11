package y0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k f20059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f20060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f20061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f20062d;

    public g(int i10, k kVar) {
        int iA;
        int iA2;
        this.f20059a = kVar;
        this.f20060b = i10;
        if (i10 != 0) {
            k kVarE = e();
            n7.e eVar = m.f20077a;
            int i11 = kVarE.f20072s;
            int[] iArr = kVarE.f20073t;
            if (iArr != null) {
                i10 = iArr[0];
            } else {
                long j = kVarE.f20071r;
                if (j != 0) {
                    iA2 = r.a(j);
                } else {
                    long j10 = kVarE.f20070i;
                    if (j10 != 0) {
                        i11 += 64;
                        iA2 = r.a(j10);
                    }
                }
                i10 = iA2 + i11;
            }
            synchronized (m.f20078b) {
                iA = m.f20081e.a(i10);
            }
        } else {
            iA = -1;
        }
        this.f20062d = iA;
    }

    public static void p(g gVar) {
        m.f20077a.F(gVar);
    }

    public final void a() {
        synchronized (m.f20078b) {
            b();
            o();
        }
    }

    public void b() {
        m.f20079c = m.f20079c.j(d());
    }

    public abstract void c();

    public int d() {
        return this.f20060b;
    }

    public k e() {
        return this.f20059a;
    }

    public abstract eh.c f();

    public abstract boolean g();

    public int h() {
        return 0;
    }

    public abstract eh.c i();

    public final g j() {
        n7.e eVar = m.f20077a;
        g gVar = (g) eVar.get();
        eVar.F(this);
        return gVar;
    }

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n(y yVar);

    public void o() {
        int i10 = this.f20062d;
        if (i10 >= 0) {
            m.t(i10);
            this.f20062d = -1;
        }
    }

    public void q(int i10) {
        this.f20060b = i10;
    }

    public void r(k kVar) {
        this.f20059a = kVar;
    }

    public void s(int i10) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract g t(eh.c cVar);
}
