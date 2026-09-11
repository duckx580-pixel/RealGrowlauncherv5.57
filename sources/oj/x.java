package oj;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class x implements f0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final i f13116i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final g f13117r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public a0 f13118s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f13119t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f13120u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f13121v;

    public x(i iVar) {
        this.f13116i = iVar;
        g gVarB = iVar.b();
        this.f13117r = gVarB;
        a0 a0Var = gVarB.f13077i;
        this.f13118s = a0Var;
        this.f13119t = a0Var != null ? a0Var.f13050b : -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f13120u = true;
    }

    @Override // oj.f0
    public final h0 d() {
        return this.f13116i.d();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r3 == r5.f13050b) goto L15;
     */
    @Override // oj.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long q(oj.g r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.l.f(r0, r9)
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 < 0) goto L6b
            boolean r3 = r8.f13120u
            if (r3 != 0) goto L63
            oj.a0 r3 = r8.f13118s
            oj.g r4 = r8.f13117r
            if (r3 == 0) goto L2b
            oj.a0 r5 = r4.f13077i
            if (r3 != r5) goto L23
            int r3 = r8.f13119t
            kotlin.jvm.internal.l.c(r5)
            int r5 = r5.f13050b
            if (r3 != r5) goto L23
            goto L2b
        L23:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            r9.<init>(r10)
            throw r9
        L2b:
            if (r2 != 0) goto L2e
            return r0
        L2e:
            long r0 = r8.f13121v
            r2 = 1
            long r0 = r0 + r2
            oj.i r2 = r8.f13116i
            boolean r0 = r2.request(r0)
            if (r0 != 0) goto L3e
            r9 = -1
            return r9
        L3e:
            oj.a0 r0 = r8.f13118s
            if (r0 != 0) goto L4c
            oj.a0 r0 = r4.f13077i
            if (r0 == 0) goto L4c
            r8.f13118s = r0
            int r0 = r0.f13050b
            r8.f13119t = r0
        L4c:
            long r0 = r4.f13078r
            long r2 = r8.f13121v
            long r0 = r0 - r2
            long r6 = java.lang.Math.min(r10, r0)
            oj.g r2 = r8.f13117r
            long r4 = r8.f13121v
            r3 = r9
            r2.e(r3, r4, r6)
            long r9 = r8.f13121v
            long r9 = r9 + r6
            r8.f13121v = r9
            return r6
        L63:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            r9.<init>(r10)
            throw r9
        L6b:
            java.lang.String r9 = "byteCount < 0: "
            java.lang.String r9 = k0.g.f(r10, r9)
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: oj.x.q(oj.g, long):long");
    }
}
