package ke;

import oh.w;
import qg.o;
import wg.i;

/* JADX INFO: loaded from: classes.dex */
public final class e extends i implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f9573i = 1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final me.b f9574r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f9575s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final g f9576t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, me.b bVar, ug.c cVar) {
        super(2, cVar);
        this.f9576t = gVar;
        this.f9574r = bVar;
    }

    @Override // wg.a
    public final ug.c create(Object obj, ug.c cVar) {
        switch (this.f9573i) {
            case 0:
                return new e(this.f9574r, this.f9576t, cVar);
            default:
                return new e(this.f9576t, this.f9574r, cVar);
        }
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        w wVar = (w) obj;
        ug.c cVar = (ug.c) obj2;
        switch (this.f9573i) {
        }
        return ((e) create(wVar, cVar)).invokeSuspend(o.f13926a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x024d  */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r11v12 */
    @Override // wg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 702
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ke.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(me.b bVar, g gVar, ug.c cVar) {
        super(2, cVar);
        this.f9574r = bVar;
        this.f9576t = gVar;
    }
}
