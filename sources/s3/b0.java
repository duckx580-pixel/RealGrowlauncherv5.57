package s3;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final View f15041i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ViewTreeObserver f15042r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Runnable f15043s;

    public b0(View view, Runnable runnable) {
        this.f15041i = view;
        this.f15042r = view.getViewTreeObserver();
        this.f15043s = runnable;
    }

    public static void a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        b0 b0Var = new b0(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(b0Var);
        view.addOnAttachStateChangeListener(b0Var);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean zIsAlive = this.f15042r.isAlive();
        View view = this.f15041i;
        if (zIsAlive) {
            this.f15042r.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f15043s.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f15042r = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean zIsAlive = this.f15042r.isAlive();
        View view2 = this.f15041i;
        if (zIsAlive) {
            this.f15042r.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
