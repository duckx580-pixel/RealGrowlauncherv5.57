package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import f3.a;
import f3.d;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public class ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior<T> extends a {
    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior() {
    }

    @Override // f3.a
    public final /* synthetic */ boolean a(View view) {
        throw new ClassCastException();
    }

    @Override // f3.a
    public final void c(d dVar) {
        if (dVar.f6009h == 0) {
            dVar.f6009h = 80;
        }
    }

    @Override // f3.a
    public final boolean d(View view, View view2) {
        throw new ClassCastException();
    }

    @Override // f3.a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i10) {
        throw new ClassCastException();
    }

    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w8.a.f19112f);
        typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.getBoolean(1, true);
        typedArrayObtainStyledAttributes.recycle();
    }
}
