package m0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 extends wg.i implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f10985i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f10986r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ t.c f10987s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ o0 f10988t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ float f10989u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ x.j f10990v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(boolean z3, t.c cVar, o0 o0Var, float f9, x.j jVar, ug.c cVar2) {
        super(2, cVar2);
        this.f10986r = z3;
        this.f10987s = cVar;
        this.f10988t = o0Var;
        this.f10989u = f9;
        this.f10990v = jVar;
    }

    @Override // wg.a
    public final ug.c create(Object obj, ug.c cVar) {
        return new n0(this.f10986r, this.f10987s, this.f10988t, this.f10989u, this.f10990v, cVar);
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        return ((n0) create((oh.w) obj, (ug.c) obj2)).invokeSuspend(qg.o.f13926a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0073, code lost:
    
        if (m0.r1.a(r4, r1, r8, r7.f10990v, r7) == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0081, code lost:
    
        if (r4.e(r8, r7) == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0083, code lost:
    
        return r0;
     */
    @Override // wg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            vg.a r0 = vg.a.f18663i
            int r1 = r7.f10985i
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L19
            if (r1 == r3) goto L15
            if (r1 != r2) goto Ld
            goto L15
        Ld:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L15:
            androidx.work.v.B(r8)
            goto L84
        L19:
            androidx.work.v.B(r8)
            boolean r8 = r7.f10986r
            float r1 = r7.f10989u
            t.c r4 = r7.f10987s
            if (r8 == 0) goto L76
            o0.z0 r8 = r4.f16026e
            java.lang.Object r8 = r8.getValue()
            q2.e r8 = (q2.e) r8
            float r8 = r8.f13735i
            m0.o0 r2 = r7.f10988t
            float r5 = r2.f11058b
            boolean r5 = q2.e.a(r8, r5)
            if (r5 == 0) goto L40
            x.n r8 = new x.n
            long r5 = f1.c.f5973b
            r8.<init>(r5)
            goto L6b
        L40:
            float r5 = r2.f11060d
            boolean r5 = q2.e.a(r8, r5)
            if (r5 == 0) goto L4e
            x.h r8 = new x.h
            r8.<init>()
            goto L6b
        L4e:
            float r5 = r2.f11059c
            boolean r5 = q2.e.a(r8, r5)
            if (r5 == 0) goto L5c
            x.d r8 = new x.d
            r8.<init>()
            goto L6b
        L5c:
            float r2 = r2.f11061e
            boolean r8 = q2.e.a(r8, r2)
            if (r8 == 0) goto L6a
            x.b r8 = new x.b
            r8.<init>()
            goto L6b
        L6a:
            r8 = 0
        L6b:
            r7.f10985i = r3
            x.j r2 = r7.f10990v
            java.lang.Object r8 = m0.r1.a(r4, r1, r8, r2, r7)
            if (r8 != r0) goto L84
            goto L83
        L76:
            q2.e r8 = new q2.e
            r8.<init>(r1)
            r7.f10985i = r2
            java.lang.Object r8 = r4.e(r8, r7)
            if (r8 != r0) goto L84
        L83:
            return r0
        L84:
            qg.o r8 = qg.o.f13926a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.n0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
