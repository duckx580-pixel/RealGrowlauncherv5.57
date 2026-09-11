package y0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends wg.h implements eh.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int[] f20064r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f20065s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f20066t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f20067u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f20068v;
    public final /* synthetic */ k w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, ug.c cVar) {
        super(cVar);
        this.w = kVar;
    }

    @Override // wg.a
    public final ug.c create(Object obj, ug.c cVar) {
        j jVar = new j(this.w, cVar);
        jVar.f20068v = obj;
        return jVar;
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((mh.j) obj, (ug.c) obj2)).invokeSuspend(qg.o.f13926a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x007f -> B:26:0x0095). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00be -> B:37:0x00bf). Please report as a decompilation issue!!! */
    @Override // wg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            r23 = this;
            r0 = r23
            y0.k r1 = r0.w
            long r2 = r1.f20070i
            int r4 = r1.f20072s
            long r5 = r1.f20071r
            vg.a r7 = vg.a.f18663i
            int r8 = r0.f20067u
            r9 = 0
            r12 = 3
            r13 = 2
            r14 = 64
            r16 = 0
            r18 = 1
            r10 = 1
            if (r8 == 0) goto L4c
            if (r8 == r10) goto L3d
            if (r8 == r13) goto L33
            if (r8 != r12) goto L2b
            int r1 = r0.f20065s
            java.lang.Object r5 = r0.f20068v
            mh.j r5 = (mh.j) r5
            androidx.work.v.B(r24)
            goto Lbf
        L2b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L33:
            int r1 = r0.f20065s
            java.lang.Object r8 = r0.f20068v
            mh.j r8 = (mh.j) r8
            androidx.work.v.B(r24)
            goto L95
        L3d:
            int r1 = r0.f20066t
            int r8 = r0.f20065s
            int[] r11 = r0.f20064r
            java.lang.Object r15 = r0.f20068v
            mh.j r15 = (mh.j) r15
            androidx.work.v.B(r24)
            int r8 = r8 + r10
            goto L5a
        L4c:
            androidx.work.v.B(r24)
            java.lang.Object r8 = r0.f20068v
            r15 = r8
            mh.j r15 = (mh.j) r15
            int[] r11 = r1.f20073t
            if (r11 == 0) goto L71
            int r1 = r11.length
            r8 = 0
        L5a:
            if (r8 >= r1) goto L71
            r2 = r11[r8]
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r2)
            r0.f20068v = r15
            r0.f20064r = r11
            r0.f20065s = r8
            r0.f20066t = r1
            r0.f20067u = r10
            r15.c(r3, r0)
            return r7
        L71:
            int r1 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r1 == 0) goto L98
            r8 = r15
            r1 = 0
        L77:
            if (r1 >= r14) goto L97
            long r21 = r18 << r1
            long r21 = r5 & r21
            int r11 = (r21 > r16 ? 1 : (r21 == r16 ? 0 : -1))
            if (r11 == 0) goto L95
            int r4 = r4 + r1
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r4)
            r0.f20068v = r8
            r0.f20064r = r9
            r0.f20065s = r1
            r0.f20067u = r13
            r8.c(r2, r0)
            vg.a r1 = vg.a.f18663i
            return r7
        L95:
            int r1 = r1 + r10
            goto L77
        L97:
            r15 = r8
        L98:
            int r1 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r1 == 0) goto Lc2
            r5 = r15
            r15 = 0
        L9e:
            if (r15 >= r14) goto Lc2
            long r20 = r18 << r15
            long r20 = r2 & r20
            int r1 = (r20 > r16 ? 1 : (r20 == r16 ? 0 : -1))
            if (r1 == 0) goto Lbe
            int r1 = r15 + 64
            int r1 = r1 + r4
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r1)
            r0.f20068v = r5
            r0.f20064r = r9
            r0.f20065s = r15
            r0.f20067u = r12
            r5.c(r2, r0)
            vg.a r1 = vg.a.f18663i
            return r7
        Lbe:
            r1 = r15
        Lbf:
            int r15 = r1 + 1
            goto L9e
        Lc2:
            qg.o r1 = qg.o.f13926a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
