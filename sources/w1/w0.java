package w1;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 implements v0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Matrix f18987i = new Matrix();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int[] f18988r = new int[2];

    @Override // w1.v0
    public void a(View view, float[] fArr) {
        Matrix matrix = this.f18987i;
        matrix.reset();
        view.transformMatrixToGlobal(matrix);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        int[] iArr = this.f18988r;
        view.getLocationOnScreen(iArr);
        int i10 = iArr[0];
        int i11 = iArr[1];
        view.getLocationInWindow(iArr);
        matrix.postTranslate(iArr[0] - i10, iArr[1] - i11);
        g1.f0.o(matrix, fArr);
    }
}
