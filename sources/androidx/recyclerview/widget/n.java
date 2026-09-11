package androidx.recyclerview.widget;

import android.animation.ValueAnimator;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f2151a;

    public n(o oVar) {
        this.f2151a = oVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
        o oVar = this.f2151a;
        oVar.f2161c.setAlpha(iFloatValue);
        oVar.f2162d.setAlpha(iFloatValue);
        oVar.f2176s.invalidate();
    }
}
