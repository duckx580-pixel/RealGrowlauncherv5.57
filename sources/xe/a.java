package xe;

import android.graphics.Matrix;
import android.graphics.Path;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Matrix f19616a = new Matrix();

    public static void a(Path path, float f9, float f10, float f11, float f12, float f13) {
        path.arcTo(f9 - f11, f10 - f11, f9 + f11, f10 + f11, f12, f13, false);
    }
}
