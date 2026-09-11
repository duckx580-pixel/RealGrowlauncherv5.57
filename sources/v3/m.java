package v3;

import android.widget.PopupWindow;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m {
    public static boolean a(PopupWindow popupWindow) {
        return popupWindow.getOverlapAnchor();
    }

    public static int b(PopupWindow popupWindow) {
        return popupWindow.getWindowLayoutType();
    }

    public static void c(PopupWindow popupWindow, boolean z3) {
        popupWindow.setOverlapAnchor(z3);
    }

    public static void d(PopupWindow popupWindow, int i10) {
        popupWindow.setWindowLayoutType(i10);
    }
}
