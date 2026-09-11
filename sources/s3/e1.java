package s3;

import android.view.View;
import android.view.ViewParent;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e1 {
    public static boolean a(ViewParent viewParent, View view, float f9, float f10, boolean z3) {
        return viewParent.onNestedFling(view, f9, f10, z3);
    }

    public static boolean b(ViewParent viewParent, View view, float f9, float f10) {
        return viewParent.onNestedPreFling(view, f9, f10);
    }

    public static void c(ViewParent viewParent, View view, int i10, int i11, int[] iArr) {
        viewParent.onNestedPreScroll(view, i10, i11, iArr);
    }

    public static void d(ViewParent viewParent, View view, int i10, int i11, int i12, int i13) {
        viewParent.onNestedScroll(view, i10, i11, i12, i13);
    }

    public static void e(ViewParent viewParent, View view, View view2, int i10) {
        viewParent.onNestedScrollAccepted(view, view2, i10);
    }

    public static boolean f(ViewParent viewParent, View view, View view2, int i10) {
        return viewParent.onStartNestedScroll(view, view2, i10);
    }

    public static void g(ViewParent viewParent, View view) {
        viewParent.onStopNestedScroll(view);
    }
}
