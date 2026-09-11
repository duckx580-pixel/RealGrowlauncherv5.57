package sh;

import rh.b0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends wg.i implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public qh.h f15826i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public byte[] f15827r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f15828s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f15829t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f15830u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f15831v;
    public final /* synthetic */ rh.h[] w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ b0 f15832x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ rh.i f15833y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(rh.h[] hVarArr, b0 b0Var, rh.i iVar, ug.c cVar) {
        super(2, cVar);
        this.w = hVarArr;
        this.f15832x = b0Var;
        this.f15833y = iVar;
    }

    @Override // wg.a
    public final ug.c create(Object obj, ug.c cVar) {
        o oVar = new o(this.w, this.f15832x, this.f15833y, cVar);
        oVar.f15831v = obj;
        return oVar;
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((oh.w) obj, (ug.c) obj2)).invokeSuspend(qg.o.f13926a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x007c, code lost:
    
        if (r5 != 0) goto L18;
     */
    /* JADX WARN: Path cross not found for [B:40:0x00c0, B:34:0x00ae], limit reached: 44 */
    /* JADX WARN: Path cross not found for [B:41:0x00c2, B:18:0x007c], limit reached: 44 */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009e A[LOOP:0: B:29:0x009e->B:46:?, LOOP_START, PHI: r5 r11
      0x009e: PHI (r5v3 int) = (r5v2 int), (r5v4 int) binds: [B:26:0x0099, B:46:?] A[DONT_GENERATE, DONT_INLINE]
      0x009e: PHI (r11v4 rg.v) = (r11v3 rg.v), (r11v10 rg.v) binds: [B:26:0x0099, B:46:?] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00d7 -> B:18:0x007c). Please report as a decompilation issue!!! */
    @Override // wg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: sh.o.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
