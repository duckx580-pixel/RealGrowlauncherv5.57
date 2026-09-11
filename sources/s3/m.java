package s3;

import android.graphics.Rect;
import android.view.Gravity;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m {
    public static void a(int i10, int i11, int i12, Rect rect, int i13, int i14, Rect rect2, int i15) {
        Gravity.apply(i10, i11, i12, rect, i13, i14, rect2, i15);
    }

    public static void b(int i10, int i11, int i12, Rect rect, Rect rect2, int i13) {
        Gravity.apply(i10, i11, i12, rect, rect2, i13);
    }

    public static void c(int i10, Rect rect, Rect rect2, int i11) {
        Gravity.applyDisplay(i10, rect, rect2, i11);
    }
}
