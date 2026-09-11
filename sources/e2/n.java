package e2;

import android.graphics.text.LineBreakConfig;
import android.text.StaticLayout;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n {
    public static final boolean a(StaticLayout staticLayout) {
        return staticLayout.isFallbackLineSpacingEnabled();
    }

    public static final void b(StaticLayout.Builder builder, int i10, int i11) {
        builder.setLineBreakConfig(new LineBreakConfig.Builder().setLineBreakStyle(i10).setLineBreakWordStyle(i11).build());
    }
}
