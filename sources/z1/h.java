package z1;

import android.view.ViewStructure;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    public static void a(ViewStructure viewStructure, String str) {
        viewStructure.setClassName(str);
    }

    public static void b(ViewStructure viewStructure, CharSequence charSequence) {
        viewStructure.setContentDescription(charSequence);
    }

    public static void c(ViewStructure viewStructure, int i10, int i11, int i12, int i13, int i14, int i15) {
        viewStructure.setDimens(i10, i11, i12, i13, i14, i15);
    }

    public static void d(ViewStructure viewStructure, CharSequence charSequence) {
        viewStructure.setText(charSequence);
    }

    public static void e(ViewStructure viewStructure, float f9, int i10, int i11, int i12) {
        viewStructure.setTextStyle(f9, i10, i11, i12);
    }
}
