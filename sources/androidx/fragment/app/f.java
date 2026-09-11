package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w0 f1683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f1685c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f1686d;

    public f(w0 w0Var, ViewGroup viewGroup, View view, g gVar) {
        this.f1683a = w0Var;
        this.f1684b = viewGroup;
        this.f1685c = view;
        this.f1686d = gVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f1684b.post(new a8.q(8, this));
        if (j0.G(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f1683a + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        if (j0.G(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f1683a + " has reached onAnimationStart.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }
}
