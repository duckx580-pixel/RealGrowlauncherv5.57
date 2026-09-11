package wi;

import android.view.Window;
import g1.f0;
import g1.t;
import kotlin.jvm.internal.l;
import launcher.powerkuy.growlauncher.script.ScriptMain;
import li.s;
import qg.o;
import t6.u;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements eh.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f19314i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f19315r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f19316s;

    public /* synthetic */ i(int i10, long j, Object obj) {
        this.f19314i = i10;
        this.f19316s = obj;
        this.f19315r = j;
    }

    @Override // eh.a
    public final Object invoke() {
        int i10 = this.f19314i;
        o oVar = o.f13926a;
        long j = this.f19315r;
        Object obj = this.f19316s;
        switch (i10) {
            case 0:
                c7.a aVar = (c7.a) obj;
                int i11 = ScriptMain.f9882i;
                boolean z3 = f0.m(j) > 0.5f;
                c7.b bVar = c7.c.f3408b;
                aVar.getClass();
                l.f("transformColorForLightContent", bVar);
                u uVar = aVar.f3405c;
                if (uVar != null) {
                    ((gh.a) uVar.f17063i).B(z3);
                }
                Window window = aVar.f3404b;
                if (window != null) {
                    if (z3 && (uVar == null || !((gh.a) uVar.f17063i).p())) {
                        j = ((t) bVar.invoke(new t(j))).f6918a;
                    }
                    window.setStatusBarColor(f0.p(j));
                }
                break;
            default:
                ((s) obj).h(j);
                break;
        }
        return oVar;
    }
}
