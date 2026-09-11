package g1;

import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.RenderNode;
import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class m {
    public static /* synthetic */ BlendModeColorFilter a(int i10, BlendMode blendMode) {
        return new BlendModeColorFilter(i10, blendMode);
    }

    public static /* synthetic */ RenderNode b() {
        return new RenderNode("Compose");
    }

    public static /* synthetic */ WindowInsets.Builder c() {
        return new WindowInsets.Builder();
    }

    public static /* synthetic */ WindowInsets.Builder d(WindowInsets windowInsets) {
        return new WindowInsets.Builder(windowInsets);
    }

    public static /* synthetic */ void e() {
    }
}
