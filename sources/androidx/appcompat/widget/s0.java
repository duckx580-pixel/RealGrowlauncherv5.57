package androidx.appcompat.widget;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 implements PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ l0 f998i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ t0 f999r;

    public s0(t0 t0Var, l0 l0Var) {
        this.f999r = t0Var;
        this.f998i = l0Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f999r.V.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f998i);
        }
    }
}
