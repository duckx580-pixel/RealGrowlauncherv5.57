package androidx.appcompat.widget;

import android.view.View;
import android.widget.PopupWindow;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i2 {
    public static int a(PopupWindow popupWindow, View view, int i10, boolean z3) {
        return popupWindow.getMaxAvailableHeight(view, i10, z3);
    }
}
