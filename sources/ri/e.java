package ri;

import java.util.ArrayList;
import kotlin.jvm.internal.l;
import launcher.powerkuy.App;
import li.g;
import qg.o;
import rh.h1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements eh.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f14878i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g f14879r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f14880s;

    public /* synthetic */ e(g gVar, String str, int i10) {
        this.f14878i = i10;
        this.f14879r = gVar;
        this.f14880s = str;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f14878i) {
            case 0:
                g gVar = this.f14879r;
                gVar.getClass();
                String str = this.f14880s;
                l.f("mac", str);
                gVar.g(str);
                break;
            default:
                String str2 = this.f14880s;
                l.f("mac", str2);
                h1 h1Var = this.f14879r.f9969f;
                ArrayList arrayListN0 = rg.l.n0((Iterable) h1Var.getValue(), str2);
                h1Var.k(null, arrayListN0);
                App app = App.f9849i;
                l.e("ctx", app);
                jj.d.K(app, arrayListN0);
                break;
        }
        return o.f13926a;
    }
}
