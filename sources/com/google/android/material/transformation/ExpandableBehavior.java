package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import f3.a;
import java.util.ArrayList;
import java.util.WeakHashMap;
import s3.l0;
import s3.z0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class ExpandableBehavior extends a {
    public ExpandableBehavior() {
    }

    @Override // f3.a
    public abstract void b(View view);

    @Override // f3.a
    public final boolean d(View view, View view2) {
        view2.getClass();
        throw new ClassCastException();
    }

    @Override // f3.a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i10) {
        WeakHashMap weakHashMap = z0.f15140a;
        if (!l0.c(view)) {
            ArrayList arrayListJ = coordinatorLayout.j(view);
            int size = arrayListJ.size();
            for (int i11 = 0; i11 < size; i11++) {
                b(view);
            }
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }
}
