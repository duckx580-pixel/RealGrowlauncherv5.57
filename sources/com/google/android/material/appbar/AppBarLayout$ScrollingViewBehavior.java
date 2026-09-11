package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import f3.d;
import java.util.ArrayList;
import java.util.WeakHashMap;
import s3.z0;
import w8.a;
import y8.b;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public class AppBarLayout$ScrollingViewBehavior extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4116b;

    public AppBarLayout$ScrollingViewBehavior() {
        new Rect();
        new Rect();
    }

    public static void s(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
        }
    }

    @Override // f3.a
    public final boolean d(View view, View view2) {
        int i10;
        if (((d) view2.getLayoutParams()).f6002a instanceof AppBarLayout$BaseBehavior) {
            int bottom = view2.getBottom() - view.getTop();
            int i11 = this.f4116b;
            if (i11 == 0 || (i10 = (int) (0.0f * i11)) < 0) {
                i11 = 0;
            } else if (i10 <= i11) {
                i11 = i10;
            }
            int i12 = bottom - i11;
            WeakHashMap weakHashMap = z0.f15140a;
            view.offsetTopAndBottom(i12);
        }
        return false;
    }

    @Override // f3.a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
        int i13 = view.getLayoutParams().height;
        if (i13 != -1 && i13 != -2) {
            return false;
        }
        s(coordinatorLayout.j(view));
        return false;
    }

    @Override // f3.a
    public final void l(CoordinatorLayout coordinatorLayout, View view) {
        s(coordinatorLayout.j(view));
    }

    @Override // y8.b
    public final void r(CoordinatorLayout coordinatorLayout, View view, int i10) {
        s(coordinatorLayout.j(view));
        coordinatorLayout.q(view, i10);
    }

    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        new Rect();
        new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f19127v);
        this.f4116b = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
    }
}
