package ui;

import oh.w;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends wg.i implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f18018i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f18019r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g f18020s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f18021t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(g gVar, String str, ug.c cVar, int i10) {
        super(2, cVar);
        this.f18018i = i10;
        this.f18020s = gVar;
        this.f18021t = str;
    }

    @Override // wg.a
    public final ug.c create(Object obj, ug.c cVar) {
        switch (this.f18018i) {
            case 0:
                return new d(this.f18020s, this.f18021t, cVar, 0);
            default:
                return new d(this.f18020s, this.f18021t, cVar, 1);
        }
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        w wVar = (w) obj;
        ug.c cVar = (ug.c) obj2;
        switch (this.f18018i) {
        }
        return ((d) create(wVar, cVar)).invokeSuspend(qg.o.f13926a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0114 A[PHI: r3
      0x0114: PHI (r3v3 char) = (r3v2 char), (r3v6 char), (r3v9 char), (r3v11 char) binds: [B:42:0x0112, B:39:0x00f8, B:37:0x00e7, B:34:0x00c9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r3v0, types: [ug.c] */
    /* JADX WARN: Type inference failed for: r3v1, types: [ug.c] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0112 -> B:45:0x0115). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0114 -> B:45:0x0115). Please report as a decompilation issue!!! */
    @Override // wg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ui.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
