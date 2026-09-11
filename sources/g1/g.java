package g1;

import android.graphics.Bitmap;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public static final Bitmap a(f fVar) {
        if (fVar instanceof f) {
            return fVar.f6867a;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    public static final Bitmap.Config b(int i10) {
        if (i10 == 0) {
            return Bitmap.Config.ARGB_8888;
        }
        if (i10 == 1) {
            return Bitmap.Config.ALPHA_8;
        }
        if (i10 == 2) {
            return Bitmap.Config.RGB_565;
        }
        int i11 = Build.VERSION.SDK_INT;
        return (i11 < 26 || i10 != 3) ? (i11 < 26 || i10 != 4) ? Bitmap.Config.ARGB_8888 : Bitmap.Config.HARDWARE : Bitmap.Config.RGBA_F16;
    }

    public static final int c(Bitmap.Config config) {
        if (config == Bitmap.Config.ALPHA_8) {
            return 1;
        }
        if (config == Bitmap.Config.RGB_565) {
            return 2;
        }
        if (config == Bitmap.Config.ARGB_4444) {
            return 0;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 26 || config != Bitmap.Config.RGBA_F16) {
            return (i10 < 26 || config != Bitmap.Config.HARDWARE) ? 0 : 4;
        }
        return 3;
    }
}
