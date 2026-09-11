package q9;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f13812b;

    public /* synthetic */ e(g gVar, int i10) {
        this.f13811a = i10;
        this.f13812b = gVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f13811a) {
            case 1:
                this.f13812b.f13840a.setEndIconVisible(false);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f13811a) {
            case 0:
                this.f13812b.f13840a.setEndIconVisible(true);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
