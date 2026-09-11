package rh;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class k1 implements i {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final i f14760i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final androidx.work.e f14761r;

    public k1(i iVar, androidx.work.e eVar) {
        this.f14760i = iVar;
        this.f14761r = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [wg.c] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(wg.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof rh.j1
            if (r0 == 0) goto L13
            r0 = r8
            rh.j1 r0 = (rh.j1) r0
            int r1 = r0.f14754u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14754u = r1
            goto L18
        L13:
            rh.j1 r0 = new rh.j1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f14752s
            vg.a r1 = vg.a.f18663i
            int r2 = r0.f14754u
            qg.o r3 = qg.o.f13926a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3e
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2c
            androidx.work.v.B(r8)
            return r3
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L34:
            sh.v r2 = r0.f14751r
            rh.k1 r5 = r0.f14750i
            androidx.work.v.B(r8)     // Catch: java.lang.Throwable -> L3c
            goto L5c
        L3c:
            r8 = move-exception
            goto L76
        L3e:
            androidx.work.v.B(r8)
            sh.v r2 = new sh.v
            rh.i r8 = r7.f14760i
            ug.h r6 = r0.getContext()
            r2.<init>(r8, r6)
            androidx.work.e r8 = r7.f14761r     // Catch: java.lang.Throwable -> L3c
            r0.f14750i = r7     // Catch: java.lang.Throwable -> L3c
            r0.f14751r = r2     // Catch: java.lang.Throwable -> L3c
            r0.f14754u = r5     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r8 = r8.invoke(r2, r0)     // Catch: java.lang.Throwable -> L3c
            if (r8 != r1) goto L5b
            goto L74
        L5b:
            r5 = r7
        L5c:
            r2.releaseIntercepted()
            rh.i r8 = r5.f14760i
            boolean r2 = r8 instanceof rh.k1
            if (r2 == 0) goto L75
            rh.k1 r8 = (rh.k1) r8
            r2 = 0
            r0.f14750i = r2
            r0.f14751r = r2
            r0.f14754u = r4
            java.lang.Object r8 = r8.b(r0)
            if (r8 != r1) goto L75
        L74:
            return r1
        L75:
            return r3
        L76:
            r2.releaseIntercepted()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: rh.k1.b(wg.c):java.lang.Object");
    }

    @Override // rh.i
    public final Object emit(Object obj, ug.c cVar) {
        return this.f14760i.emit(obj, cVar);
    }
}
