package rh;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements h {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final h f14722i;

    public g(h hVar) {
        this.f14722i = hVar;
    }

    @Override // rh.h
    public final Object collect(i iVar, ug.c cVar) {
        kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
        xVar.f9667i = sh.c.f15799b;
        Object objCollect = this.f14722i.collect(new f(this, xVar, iVar), cVar);
        return objCollect == vg.a.f18663i ? objCollect : qg.o.f13926a;
    }
}
