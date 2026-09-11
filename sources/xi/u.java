package xi;

import java.io.File;
import launcher.powerkuy.growlauncher.api.model.Script;
import o0.s0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class u implements eh.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f19863i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f19864r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ s0 f19865s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ s0 f19866t;

    public /* synthetic */ u(Object obj, s0 s0Var, s0 s0Var2, int i10) {
        this.f19863i = i10;
        this.f19864r = obj;
        this.f19865s = s0Var;
        this.f19866t = s0Var2;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f19863i) {
            case 0:
                this.f19865s.setValue(Long.valueOf(((Script) this.f19864r).getId()));
                this.f19866t.setValue(Boolean.TRUE);
                break;
            case 1:
                this.f19865s.setValue(Long.valueOf(((Script) this.f19864r).getId()));
                this.f19866t.setValue(Boolean.TRUE);
                break;
            default:
                this.f19865s.setValue((File) this.f19864r);
                this.f19866t.setValue(Boolean.TRUE);
                break;
        }
        return qg.o.f13926a;
    }
}
