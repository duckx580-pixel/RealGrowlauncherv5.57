package u;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class q1 extends wg.i implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f17501i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f17502r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ t1 f17503s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ float f17504t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ float f17505u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(boolean z3, t1 t1Var, float f9, float f10, ug.c cVar) {
        super(2, cVar);
        this.f17502r = z3;
        this.f17503s = t1Var;
        this.f17504t = f9;
        this.f17505u = f10;
    }

    @Override // wg.a
    public final ug.c create(Object obj, ug.c cVar) {
        return new q1(this.f17502r, this.f17503s, this.f17504t, this.f17505u, cVar);
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        return ((q1) create((oh.w) obj, (ug.c) obj2)).invokeSuspend(qg.o.f13926a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002f, code lost:
    
        if (v.j0.c(r4, r5.f17504t, t.d.m(0.0f, null, 7), r5) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
    
        if (v.j0.c(r4, r5.f17505u, t.d.m(0.0f, null, 7), r5) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
    
        return r0;
     */
    @Override // wg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            vg.a r0 = vg.a.f18663i
            int r1 = r5.f17501i
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L19
            if (r1 == r3) goto L15
            if (r1 != r2) goto Ld
            goto L15
        Ld:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L15:
            androidx.work.v.B(r6)
            goto L40
        L19:
            androidx.work.v.B(r6)
            boolean r6 = r5.f17502r
            java.lang.String r1 = "null cannot be cast to non-null type androidx.compose.foundation.gestures.ScrollableState"
            u.t1 r4 = r5.f17503s
            if (r6 == 0) goto L32
            kotlin.jvm.internal.l.d(r1, r4)
            r5.f17501i = r3
            float r6 = r5.f17504t
            java.lang.Object r6 = v.j0.d(r4, r6, r5)
            if (r6 != r0) goto L40
            goto L3f
        L32:
            kotlin.jvm.internal.l.d(r1, r4)
            r5.f17501i = r2
            float r6 = r5.f17505u
            java.lang.Object r6 = v.j0.d(r4, r6, r5)
            if (r6 != r0) goto L40
        L3f:
            return r0
        L40:
            qg.o r6 = qg.o.f13926a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: u.q1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
