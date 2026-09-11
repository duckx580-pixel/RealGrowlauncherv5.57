package s3;

import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o {
    public static int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getLayoutDirection();
    }

    public static int b(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getMarginEnd();
    }

    public static int c(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getMarginStart();
    }

    public static boolean d(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.isMarginRelative();
    }

    public static void e(ViewGroup.MarginLayoutParams marginLayoutParams, int i10) {
        marginLayoutParams.resolveLayoutDirection(i10);
    }

    public static void f(ViewGroup.MarginLayoutParams marginLayoutParams, int i10) {
        marginLayoutParams.setLayoutDirection(i10);
    }

    public static void g(ViewGroup.MarginLayoutParams marginLayoutParams, int i10) {
        marginLayoutParams.setMarginEnd(i10);
    }

    public static void h(ViewGroup.MarginLayoutParams marginLayoutParams, int i10) {
        marginLayoutParams.setMarginStart(i10);
    }
}
