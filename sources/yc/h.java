package yc;

import android.animation.Animator;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wb.a f20307a;

    public h(wb.a aVar) {
        this.f20307a = aVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        wb.a aVar = this.f20307a;
        j jVar = (j) aVar.f19166r;
        jVar.setClickable(jVar.f20362i);
        ((j) aVar.f19166r).f20363r = false;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        wb.a aVar = this.f20307a;
        j jVar = (j) aVar.f19166r;
        jVar.setClickable(jVar.f20362i);
        ((j) aVar.f19166r).f20363r = false;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
