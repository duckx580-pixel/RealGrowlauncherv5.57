package u;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 extends a1.m implements v1.c1 {
    public x.l D;
    public x.h E;

    @Override // a1.m
    public final void A0() {
        I0();
    }

    @Override // v1.c1
    public final void E() {
        I0();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object G0(wg.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof u.p0
            if (r0 == 0) goto L13
            r0 = r5
            u.p0 r0 = (u.p0) r0
            int r1 = r0.f17487u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17487u = r1
            goto L18
        L13:
            u.p0 r0 = new u.p0
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f17485s
            vg.a r1 = vg.a.f18663i
            int r2 = r0.f17487u
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            x.h r1 = r0.f17484r
            u.s0 r0 = r0.f17483i
            androidx.work.v.B(r5)
            goto L50
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            androidx.work.v.B(r5)
            x.h r5 = r4.E
            if (r5 != 0) goto L52
            x.h r5 = new x.h
            r5.<init>()
            x.l r2 = r4.D
            r0.f17483i = r4
            r0.f17484r = r5
            r0.f17487u = r3
            java.lang.Object r0 = r2.b(r5, r0)
            if (r0 != r1) goto L4e
            return r1
        L4e:
            r0 = r4
            r1 = r5
        L50:
            r0.E = r1
        L52:
            qg.o r5 = qg.o.f13926a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: u.s0.G0(wg.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object H0(wg.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof u.q0
            if (r0 == 0) goto L13
            r0 = r5
            u.q0 r0 = (u.q0) r0
            int r1 = r0.f17500t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17500t = r1
            goto L18
        L13:
            u.q0 r0 = new u.q0
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f17498r
            vg.a r1 = vg.a.f18663i
            int r2 = r0.f17500t
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            u.s0 r0 = r0.f17497i
            androidx.work.v.B(r5)
            goto L4b
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            androidx.work.v.B(r5)
            x.h r5 = r4.E
            if (r5 == 0) goto L4e
            x.i r2 = new x.i
            r2.<init>(r5)
            x.l r5 = r4.D
            r0.f17497i = r4
            r0.f17500t = r3
            java.lang.Object r5 = r5.b(r2, r0)
            if (r5 != r1) goto L4a
            return r1
        L4a:
            r0 = r4
        L4b:
            r5 = 0
            r0.E = r5
        L4e:
            qg.o r5 = qg.o.f13926a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: u.s0.H0(wg.c):java.lang.Object");
    }

    public final void I0() {
        x.h hVar = this.E;
        if (hVar != null) {
            this.D.c(new x.i(hVar));
            this.E = null;
        }
    }

    @Override // v1.c1
    public final void a0(q1.g gVar, q1.h hVar, long j) {
        if (hVar == q1.h.f13677r) {
            int i10 = gVar.f13675d;
            ug.c cVar = null;
            if (i10 == 4) {
                oh.x.s(v0(), null, 0, new r0(this, cVar, 0), 3);
            } else if (i10 == 5) {
                oh.x.s(v0(), null, 0, new r0(this, cVar, 1), 3);
            }
        }
    }
}
