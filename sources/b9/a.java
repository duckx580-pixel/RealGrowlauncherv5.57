package b9;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import n9.f;
import n9.g;
import q9.o;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2877b;

    public /* synthetic */ a(int i10, Object obj) {
        this.f2876a = i10;
        this.f2877b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f2876a) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar = ((BottomSheetBehavior) this.f2877b).f4140h;
                if (gVar != null) {
                    f fVar = gVar.f12200i;
                    if (fVar.f12193i != fFloatValue) {
                        fVar.f12193i = fFloatValue;
                        gVar.f12204u = true;
                        gVar.invalidateSelf();
                    }
                }
                break;
            case 1:
                ((o) this.f2877b).f13842c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                ((TextInputLayout) this.f2877b).S0.l(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
