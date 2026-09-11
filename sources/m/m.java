package m;

import android.view.ActionProvider;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements ActionProvider.VisibilityListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ActionProvider f10321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public u5.l f10322b;

    public m(q qVar, ActionProvider actionProvider) {
        this.f10321a = actionProvider;
    }

    public final View a(l lVar) {
        return this.f10321a.onCreateActionView(lVar);
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z3) {
        u5.l lVar = this.f10322b;
        if (lVar != null) {
            j jVar = ((l) lVar.f17672i).f10309n;
            jVar.f10279h = true;
            jVar.p(true);
        }
    }
}
