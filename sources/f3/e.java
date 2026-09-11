package f3;

import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout f6016i;

    public e(CoordinatorLayout coordinatorLayout) {
        this.f6016i = coordinatorLayout;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.f6016i.p(0);
        return true;
    }
}
