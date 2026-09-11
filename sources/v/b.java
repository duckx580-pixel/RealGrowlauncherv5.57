package v;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends wg.h implements eh.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f18116r = 1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f18117s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f18118t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public oh.w f18119u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Object f18120v;
    public final /* synthetic */ Object w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f18121x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(oh.w wVar, eh.f fVar, eh.c cVar, x0 x0Var, ug.c cVar2) {
        super(cVar2);
        this.f18119u = wVar;
        this.f18120v = (wg.i) fVar;
        this.w = (kotlin.jvm.internal.m) cVar;
        this.f18121x = x0Var;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [eh.f, wg.i] */
    /* JADX WARN: Type inference failed for: r4v1, types: [eh.c, kotlin.jvm.internal.m] */
    @Override // wg.a
    public final ug.c create(Object obj, ug.c cVar) {
        switch (this.f18116r) {
            case 0:
                b bVar = new b((oh.w) this.f18121x, (l0) this.w, cVar);
                bVar.f18118t = obj;
                return bVar;
            default:
                b bVar2 = new b(this.f18119u, (wg.i) this.f18120v, (kotlin.jvm.internal.m) this.w, (x0) this.f18121x, cVar);
                bVar2.f18118t = obj;
                return bVar2;
        }
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        q1.a0 a0Var = (q1.a0) obj;
        ug.c cVar = (ug.c) obj2;
        switch (this.f18116r) {
        }
        return ((b) create(a0Var, cVar)).invokeSuspend(qg.o.f13926a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:50|(1:52)|112|53|54|120|55|56|114|57|58|116|59|60|122|61|62|125|63|(1:130)(10:66|110|67|68|(0)(0)|82|83|103|43|(0)(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01e3, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01e4, code lost:
    
        r3 = r1;
        r2 = r10;
        r1 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01e8, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01e9, code lost:
    
        r1 = r2;
        r16 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01ed, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01ee, code lost:
    
        r1 = r2;
        r16 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01f2, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01f3, code lost:
    
        r1 = r2;
        r16 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01f7, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01f8, code lost:
    
        r1 = r2;
        r16 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01fc, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01fd, code lost:
    
        r1 = r2;
        r16 = r6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x021e A[Catch: all -> 0x00ca, TRY_ENTER, TRY_LEAVE, TryCatch #8 {all -> 0x00ca, blocks: (B:32:0x00c1, B:67:0x0155, B:100:0x0201, B:104:0x021e), top: B:118:0x00c1 }] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01d7  */
    /* JADX WARN: Type inference failed for: r0v54, types: [eh.c, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r10v6, types: [eh.f, wg.i] */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v14 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [ug.c, ug.h] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, oh.w] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:102:0x0207 -> B:83:0x01dd). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:107:0x0230 -> B:43:0x00ed). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x0152 -> B:110:0x0155). Please report as a decompilation issue!!! */
    @Override // wg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 576
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(oh.w wVar, l0 l0Var, ug.c cVar) {
        super(cVar);
        this.f18121x = wVar;
        this.w = l0Var;
    }
}
