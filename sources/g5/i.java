package g5;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends g0 {
    public i(int i10) {
        if ((i10 & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.N = i10;
    }

    @Override // g5.g0
    public final ObjectAnimator K(ViewGroup viewGroup, View view, x xVar, x xVar2) {
        Float f9;
        float fFloatValue = (xVar == null || (f9 = (Float) xVar.f7046a.get("android:fade:transitionAlpha")) == null) ? 0.0f : f9.floatValue();
        return M(view, fFloatValue != 1.0f ? fFloatValue : 0.0f, 1.0f);
    }

    @Override // g5.g0
    public final ObjectAnimator L(ViewGroup viewGroup, View view, x xVar) {
        Float f9;
        z.f7058a.getClass();
        return M(view, (xVar == null || (f9 = (Float) xVar.f7046a.get("android:fade:transitionAlpha")) == null) ? 1.0f : f9.floatValue(), 0.0f);
    }

    public final ObjectAnimator M(View view, float f9, float f10) {
        if (f9 == f10) {
            return null;
        }
        z.f7058a.N(view, f9);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, z.f7059b, f10);
        objectAnimatorOfFloat.addListener(new androidx.recyclerview.widget.m(view));
        a(new h(0, view));
        return objectAnimatorOfFloat;
    }

    @Override // g5.r
    public final void g(x xVar) {
        g0.I(xVar);
        xVar.f7046a.put("android:fade:transitionAlpha", Float.valueOf(z.f7058a.M(xVar.f7047b)));
    }
}
