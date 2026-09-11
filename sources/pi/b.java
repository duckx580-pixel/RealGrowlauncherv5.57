package pi;

import launcher.powerkuy.growlauncher.api.model.Configuration;
import o0.p;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f13464i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Configuration f13465r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f13466s;

    public /* synthetic */ b(Configuration configuration, int i10, int i11) {
        this.f13464i = i11;
        this.f13465r = configuration;
        this.f13466s = i10;
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f13464i;
        o0.o oVar = (o0.o) obj;
        ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                c.a(this.f13465r, oVar, p.S(this.f13466s | 1));
                break;
            case 1:
                c.k(this.f13465r, oVar, p.S(this.f13466s | 1));
                break;
            case 2:
                c.l(this.f13465r, oVar, p.S(this.f13466s | 1));
                break;
            default:
                c.m(this.f13465r, oVar, p.S(this.f13466s | 1));
                break;
        }
        return qg.o.f13926a;
    }
}
