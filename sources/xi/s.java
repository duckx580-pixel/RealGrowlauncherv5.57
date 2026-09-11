package xi;

import launcher.powerkuy.growlauncher.api.model.Creator;
import launcher.powerkuy.growlauncher.api.model.Script;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements eh.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f19859i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ eh.c f19860r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Script f19861s;

    public /* synthetic */ s(eh.c cVar, Script script, int i10) {
        this.f19859i = i10;
        this.f19860r = cVar;
        this.f19861s = script;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f19859i) {
            case 0:
                this.f19860r.invoke(this.f19861s);
                break;
            case 1:
                this.f19860r.invoke(this.f19861s);
                break;
            case 2:
                this.f19860r.invoke(this.f19861s);
                break;
            case 3:
                Creator creator = this.f19861s.getCreator();
                if (creator != null) {
                    this.f19860r.invoke(creator);
                }
                break;
            default:
                this.f19860r.invoke(this.f19861s);
                break;
        }
        return qg.o.f13926a;
    }

    public s(Script script, eh.c cVar) {
        this.f19859i = 3;
        this.f19861s = script;
        this.f19860r = cVar;
    }
}
