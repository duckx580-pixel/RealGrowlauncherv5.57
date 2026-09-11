package ui;

import fi.d0;
import oh.w;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends wg.i implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f18025i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f18026r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g f18027s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f18028t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f18029u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ d0 f18030v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(g gVar, String str, String str2, d0 d0Var, ug.c cVar, int i10) {
        super(2, cVar);
        this.f18025i = i10;
        this.f18027s = gVar;
        this.f18028t = str;
        this.f18029u = str2;
        this.f18030v = d0Var;
    }

    @Override // wg.a
    public final ug.c create(Object obj, ug.c cVar) {
        switch (this.f18025i) {
            case 0:
                return new f(this.f18027s, this.f18028t, this.f18029u, this.f18030v, cVar, 0);
            default:
                return new f(this.f18027s, this.f18028t, this.f18029u, this.f18030v, cVar, 1);
        }
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        w wVar = (w) obj;
        ug.c cVar = (ug.c) obj2;
        switch (this.f18025i) {
        }
        return ((f) create(wVar, cVar)).invokeSuspend(qg.o.f13926a);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00cc  */
    @Override // wg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ui.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
