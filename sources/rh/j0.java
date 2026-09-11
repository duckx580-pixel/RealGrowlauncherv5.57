package rh;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 implements h {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f14748i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a6.i f14749r;

    public /* synthetic */ j0(a6.i iVar, int i10) {
        this.f14748i = i10;
        this.f14749r = iVar;
    }

    @Override // rh.h
    public final Object collect(i iVar, ug.c cVar) throws Throwable {
        switch (this.f14748i) {
            case 0:
                Object objCollect = this.f14749r.collect(new a4.u(iVar, 2), cVar);
                if (objCollect != vg.a.f18663i) {
                    break;
                }
                break;
            default:
                Object objCollect2 = this.f14749r.collect(new a4.u(iVar, 3), cVar);
                if (objCollect2 != vg.a.f18663i) {
                    break;
                }
                break;
        }
        return qg.o.f13926a;
    }
}
