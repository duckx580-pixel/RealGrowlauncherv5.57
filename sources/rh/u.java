package rh;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class u implements h {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f14820i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f14821r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ h f14822s;

    public /* synthetic */ u(h hVar, int i10, int i11) {
        this.f14820i = i11;
        this.f14822s = hVar;
        this.f14821r = i10;
    }

    @Override // rh.h
    public final Object collect(i iVar, ug.c cVar) {
        switch (this.f14820i) {
            case 0:
                Object objCollect = this.f14822s.collect(new w(new kotlin.jvm.internal.v(), this.f14821r, iVar), cVar);
                if (objCollect != vg.a.f18663i) {
                    break;
                }
                break;
            default:
                Object objCollect2 = ((u) this.f14822s).collect(new sh.n(iVar, this.f14821r, 1), cVar);
                if (objCollect2 != vg.a.f18663i) {
                    break;
                }
                break;
        }
        return qg.o.f13926a;
    }
}
