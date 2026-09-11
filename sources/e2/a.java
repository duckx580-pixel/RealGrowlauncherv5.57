package e2;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.inputmethod.SurroundingText;
import android.view.inputmethod.TextSnapshot;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ BoringLayout a(CharSequence charSequence, TextPaint textPaint, int i10, Layout.Alignment alignment, float f9, float f10, BoringLayout.Metrics metrics, boolean z3, boolean z10, TextUtils.TruncateAt truncateAt, int i11) {
        return new BoringLayout(charSequence, textPaint, i10, alignment, f9, f10, metrics, z3, truncateAt, i11, z10);
    }

    public static /* synthetic */ TextSnapshot b(SurroundingText surroundingText, int i10, int i11, int i12) {
        return new TextSnapshot(surroundingText, i10, i11, i12);
    }
}
