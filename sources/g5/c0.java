package g5;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends b0 {
    @Override // g5.b0, w9.a
    public final void A(View view, int i10) {
        view.setTransitionVisibility(i10);
    }

    @Override // g5.a0
    public final float M(View view) {
        return view.getTransitionAlpha();
    }

    @Override // g5.a0
    public final void N(View view, float f9) {
        view.setTransitionAlpha(f9);
    }

    @Override // g5.b0
    public final void O(View view, int i10, int i11, int i12, int i13) {
        view.setLeftTopRightBottom(i10, i11, i12, i13);
    }

    @Override // g5.b0
    public final void P(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // g5.b0
    public final void Q(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
