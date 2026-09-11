package f3;

import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public boolean a(View view) {
        return false;
    }

    public boolean d(View view, View view2) {
        return false;
    }

    public boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    public abstract boolean g(CoordinatorLayout coordinatorLayout, View view, int i10);

    public boolean h(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
        return false;
    }

    public boolean i(View view) {
        return false;
    }

    public void k(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int[] iArr) {
        iArr[0] = iArr[0] + i11;
        iArr[1] = iArr[1] + i12;
    }

    public Parcelable n(View view) {
        return View.BaseSavedState.EMPTY_STATE;
    }

    public boolean o(View view, int i10, int i11) {
        return false;
    }

    public boolean q(View view, MotionEvent motionEvent) {
        return false;
    }

    public void e() {
    }

    public void b(View view) {
    }

    public void c(d dVar) {
    }

    public void l(CoordinatorLayout coordinatorLayout, View view) {
    }

    public void m(View view, Parcelable parcelable) {
    }

    public void p(View view, View view2, int i10) {
    }

    public void j(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int[] iArr, int i12) {
    }
}
