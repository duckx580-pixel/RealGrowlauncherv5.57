package wi;

import o0.o;
import o0.p;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f19292i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ zd.h f19293r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ eh.a f19294s;

    public /* synthetic */ c(zd.h hVar, eh.a aVar, int i10, int i11) {
        this.f19292i = i11;
        this.f19293r = hVar;
        this.f19294s = aVar;
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f19292i;
        o oVar = (o) obj;
        ((Integer) obj2).getClass();
        switch (i10) {
            case 0:
                this.f19293r.d(this.f19294s, oVar, p.S(49));
                break;
            default:
                this.f19293r.b(this.f19294s, oVar, p.S(49));
                break;
        }
        return qg.o.f13926a;
    }
}
