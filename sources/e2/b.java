package e2;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final BoringLayout a(CharSequence charSequence, TextPaint textPaint, int i10, Layout.Alignment alignment, float f9, float f10, BoringLayout.Metrics metrics, boolean z3, boolean z10, TextUtils.TruncateAt truncateAt, int i11) {
        return a.a(charSequence, textPaint, i10, alignment, f9, f10, metrics, z3, z10, truncateAt, i11);
    }

    public static final BoringLayout.Metrics b(CharSequence charSequence, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic) {
        return BoringLayout.isBoring(charSequence, textPaint, textDirectionHeuristic, true, null);
    }

    public static boolean c(BoringLayout boringLayout) {
        return boringLayout.isFallbackLineSpacingEnabled();
    }
}
