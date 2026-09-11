package com.google.android.material.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.appcompat.widget.d;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import f3.a;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4123a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4124b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewPropertyAnimator f4125c;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // f3.a
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i10) {
        this.f4123a = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        return false;
    }

    @Override // f3.a
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int[] iArr) {
        if (i10 > 0) {
            if (this.f4124b == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.f4125c;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.f4124b = 1;
            this.f4125c = view.animate().translationY(this.f4123a).setInterpolator(x8.a.f19493c).setDuration(175L).setListener(new d(3, this));
            return;
        }
        if (i10 >= 0 || this.f4124b == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.f4125c;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            view.clearAnimation();
        }
        this.f4124b = 2;
        this.f4125c = view.animate().translationY(0).setInterpolator(x8.a.f19494d).setDuration(225L).setListener(new d(3, this));
    }

    @Override // f3.a
    public boolean o(View view, int i10, int i11) {
        return i10 == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
