package j3;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    public static Drawable a(Resources resources, int i10, Resources.Theme theme) {
        return resources.getDrawable(i10, theme);
    }

    public static Drawable b(Resources resources, int i10, int i11, Resources.Theme theme) {
        return resources.getDrawableForDensity(i10, i11, theme);
    }
}
