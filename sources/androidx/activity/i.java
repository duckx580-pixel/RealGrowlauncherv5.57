package androidx.activity;

import android.view.View;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements androidx.lifecycle.t {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f693i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ n f694r;

    public /* synthetic */ i(n nVar, int i10) {
        this.f693i = i10;
        this.f694r = nVar;
    }

    @Override // androidx.lifecycle.t
    public final void c(androidx.lifecycle.v vVar, androidx.lifecycle.n nVar) {
        switch (this.f693i) {
            case 0:
                if (nVar == androidx.lifecycle.n.ON_DESTROY) {
                    this.f694r.mContextAwareHelper.f5178b = null;
                    if (!this.f694r.isChangingConfigurations()) {
                        this.f694r.getViewModelStore().a();
                    }
                    m mVar = (m) this.f694r.mReportFullyDrawnExecutor;
                    n nVar2 = mVar.f700t;
                    nVar2.getWindow().getDecorView().removeCallbacks(mVar);
                    nVar2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(mVar);
                }
                break;
            case 1:
                if (nVar == androidx.lifecycle.n.ON_STOP) {
                    Window window = this.f694r.getWindow();
                    View viewPeekDecorView = window != null ? window.peekDecorView() : null;
                    if (viewPeekDecorView != null) {
                        viewPeekDecorView.cancelPendingInputEvents();
                    }
                }
                break;
            default:
                n nVar3 = this.f694r;
                nVar3.ensureViewModelStore();
                nVar3.getLifecycle().c(this);
                break;
        }
    }
}
