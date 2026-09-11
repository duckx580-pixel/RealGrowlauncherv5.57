package s3;

import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f15072a;

    public h1(View view) {
        this.f15072a = new WeakReference(view);
    }

    public final void a(float f9) {
        View view = (View) this.f15072a.get();
        if (view != null) {
            view.animate().alpha(f9);
        }
    }

    public final void b() {
        View view = (View) this.f15072a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j) {
        View view = (View) this.f15072a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    public final void d(i1 i1Var) {
        View view = (View) this.f15072a.get();
        if (view != null) {
            if (i1Var != null) {
                view.animate().setListener(new g5.o(view, 1, i1Var));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(float f9) {
        View view = (View) this.f15072a.get();
        if (view != null) {
            view.animate().translationY(f9);
        }
    }
}
