package rh;

import w1.o1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 implements i {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f14700i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f14701r;

    public /* synthetic */ d0(int i10, Object obj) {
        this.f14700i = i10;
        this.f14701r = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
    
        if (r7.t(r6, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(rg.v r6, ug.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof t4.b
            if (r0 == 0) goto L13
            r0 = r7
            t4.b r0 = (t4.b) r0
            int r1 = r0.f16448u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16448u = r1
            goto L18
        L13:
            t4.b r0 = new t4.b
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f16446s
            vg.a r1 = vg.a.f18663i
            int r2 = r0.f16448u
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            androidx.work.v.B(r7)
            goto L69
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            rg.v r6 = r0.f16445r
            rh.d0 r2 = r0.f16444i
            androidx.work.v.B(r7)
            goto L53
        L3a:
            androidx.work.v.B(r7)
            java.lang.Object r7 = r5.f14701r
            mf.c r7 = (mf.c) r7
            java.lang.Object r7 = r7.f11701i
            rh.v0 r7 = (rh.v0) r7
            r0.f16444i = r5
            r0.f16445r = r6
            r0.f16448u = r4
            java.lang.Object r7 = r7.emit(r6, r0)
            if (r7 != r1) goto L52
            goto L68
        L52:
            r2 = r5
        L53:
            java.lang.Object r7 = r2.f14701r
            mf.c r7 = (mf.c) r7
            java.lang.Object r7 = r7.f11702r
            af.a r7 = (af.a) r7
            r2 = 0
            r0.f16444i = r2
            r0.f16445r = r2
            r0.f16448u = r3
            java.lang.Object r6 = r7.t(r6, r0)
            if (r6 != r1) goto L69
        L68:
            return r1
        L69:
            qg.o r6 = qg.o.f13926a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: rh.d0.b(rg.v, ug.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object c(t4.z r5, ug.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof t4.k0
            if (r0 == 0) goto L13
            r0 = r6
            t4.k0 r0 = (t4.k0) r0
            int r1 = r0.f16554s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16554s = r1
            goto L18
        L13:
            t4.k0 r0 = new t4.k0
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f16552i
            vg.a r1 = vg.a.f18663i
            int r2 = r0.f16554s
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            androidx.work.v.B(r6)     // Catch: qh.n -> L41
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            androidx.work.v.B(r6)
            java.lang.Object r6 = r4.f14701r     // Catch: qh.n -> L41
            t4.h1 r6 = (t4.h1) r6     // Catch: qh.n -> L41
            r0.f16554s = r3     // Catch: qh.n -> L41
            qh.d r6 = r6.f16513i     // Catch: qh.n -> L41
            java.lang.Object r5 = r6.p(r5, r0)     // Catch: qh.n -> L41
            if (r5 != r1) goto L41
            return r1
        L41:
            qg.o r5 = qg.o.f13926a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: rh.d0.c(t4.z, ug.c):java.lang.Object");
    }

    @Override // rh.i
    public final Object emit(Object obj, ug.c cVar) {
        switch (this.f14700i) {
            case 0:
                ((kotlin.jvm.internal.x) this.f14701r).f9667i = obj;
                throw new sh.a(this);
            case 1:
                return b((rg.v) obj, cVar);
            case 2:
                Object objP = ((qh.u) this.f14701r).p(obj, cVar);
                return objP == vg.a.f18663i ? objP : qg.o.f13926a;
            case 3:
                return c((t4.z) obj, cVar);
            case 4:
                ((qh.d) this.f14701r).l((qg.o) obj);
                return qg.o.f13926a;
            case 5:
                ((u4.b) this.f14701r).f17635d.setValue((t4.e) obj);
                return qg.o.f13926a;
            default:
                ((o1) this.f14701r).f18880i.g(((Number) obj).floatValue());
                return qg.o.f13926a;
        }
    }

    public d0(qh.u uVar) {
        this.f14700i = 2;
        kotlin.jvm.internal.l.f("channel", uVar);
        this.f14701r = uVar;
    }
}
