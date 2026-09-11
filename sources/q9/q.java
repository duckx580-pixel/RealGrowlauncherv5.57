package q9;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.h1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextView f13845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f13846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TextView f13847d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s f13848e;

    public q(s sVar, int i10, TextView textView, int i11, TextView textView2) {
        this.f13848e = sVar;
        this.f13844a = i10;
        this.f13845b = textView;
        this.f13846c = i11;
        this.f13847d = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        h1 h1Var;
        int i10 = this.f13844a;
        s sVar = this.f13848e;
        sVar.f13857h = i10;
        sVar.f13855f = null;
        TextView textView = this.f13845b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.f13846c == 1 && (h1Var = sVar.f13860l) != null) {
                h1Var.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.f13847d;
        if (textView2 != null) {
            textView2.setTranslationY(0.0f);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.f13847d;
        if (textView != null) {
            textView.setVisibility(0);
        }
    }
}
