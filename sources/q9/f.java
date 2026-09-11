package q9;

import android.animation.ValueAnimator;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f13814b;

    public /* synthetic */ f(g gVar, int i10) {
        this.f13813a = i10;
        this.f13814b = gVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f13813a) {
            case 0:
                this.f13814b.f13842c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar = this.f13814b;
                gVar.f13842c.setScaleX(fFloatValue);
                gVar.f13842c.setScaleY(fFloatValue);
                break;
        }
    }
}
