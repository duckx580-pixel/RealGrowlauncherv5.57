package g5;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public class b0 extends a0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static boolean f6982m = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static boolean f6983n = true;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static boolean f6984o = true;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static boolean f6985p = true;

    @Override // w9.a
    public void A(View view, int i10) {
        if (Build.VERSION.SDK_INT == 28) {
            super.A(view, i10);
        } else if (f6985p) {
            try {
                view.setTransitionVisibility(i10);
            } catch (NoSuchMethodError unused) {
                f6985p = false;
            }
        }
    }

    public void O(View view, int i10, int i11, int i12, int i13) {
        if (f6984o) {
            try {
                view.setLeftTopRightBottom(i10, i11, i12, i13);
            } catch (NoSuchMethodError unused) {
                f6984o = false;
            }
        }
    }

    public void P(View view, Matrix matrix) {
        if (f6982m) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f6982m = false;
            }
        }
    }

    public void Q(View view, Matrix matrix) {
        if (f6983n) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f6983n = false;
            }
        }
    }
}
