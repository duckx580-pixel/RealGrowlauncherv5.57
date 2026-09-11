package v;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class i1 implements p1.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final q1 f18202i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f18203r;

    public i1(q1 q1Var, boolean z3) {
        this.f18202i = q1Var;
        this.f18203r = z3;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object J(long r3, long r5, ug.c r7) {
        /*
            r2 = this;
            boolean r3 = r7 instanceof v.h1
            if (r3 == 0) goto L13
            r3 = r7
            v.h1 r3 = (v.h1) r3
            int r4 = r3.f18194u
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r4 & r0
            if (r1 == 0) goto L13
            int r4 = r4 - r0
            r3.f18194u = r4
            goto L1a
        L13:
            v.h1 r3 = new v.h1
            wg.c r7 = (wg.c) r7
            r3.<init>(r2, r7)
        L1a:
            java.lang.Object r4 = r3.f18192s
            vg.a r7 = vg.a.f18663i
            int r0 = r3.f18194u
            r1 = 1
            if (r0 == 0) goto L35
            if (r0 != r1) goto L2d
            long r5 = r3.f18191r
            v.i1 r3 = r3.f18190i
            androidx.work.v.B(r4)
            goto L4c
        L2d:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r4)
            throw r3
        L35:
            androidx.work.v.B(r4)
            boolean r4 = r2.f18203r
            if (r4 == 0) goto L55
            r3.f18190i = r2
            r3.f18191r = r5
            r3.f18194u = r1
            v.q1 r4 = r2.f18202i
            java.lang.Object r4 = r4.b(r5, r3)
            if (r4 != r7) goto L4b
            return r7
        L4b:
            r3 = r2
        L4c:
            q2.p r4 = (q2.p) r4
            long r0 = r4.f13762a
            long r4 = q2.p.d(r5, r0)
            goto L58
        L55:
            long r4 = q2.p.f13760b
            r3 = r2
        L58:
            q2.p r6 = new q2.p
            r6.<init>(r4)
            v.q1 r3 = r3.f18202i
            o0.z0 r3 = r3.f18261g
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r3.setValue(r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: v.i1.J(long, long, ug.c):java.lang.Object");
    }

    @Override // p1.a
    public final long R(long j, int i10) {
        if (i10 == 2) {
            this.f18202i.f18261g.setValue(Boolean.TRUE);
        }
        return f1.c.f5973b;
    }

    @Override // p1.a
    public final long n0(long j, long j10, int i10) {
        if (!this.f18203r) {
            return f1.c.f5973b;
        }
        q1 q1Var = this.f18202i;
        if (q1Var.f18255a.b()) {
            return f1.c.f5973b;
        }
        k1 k1Var = q1Var.f18255a;
        float fD = q1Var.f18256b == t0.f18279r ? f1.c.d(j10) : f1.c.e(j10);
        if (q1Var.f18258d) {
            fD *= -1;
        }
        float fE = k1Var.e(fD);
        if (q1Var.f18258d) {
            fE *= -1;
        }
        return q1Var.d(fE);
    }
}
