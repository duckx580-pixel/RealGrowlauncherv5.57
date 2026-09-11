package com.usercentrics.sdk.ui.extensions;

import android.content.Context;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class NumberExtensionsKt {
    public static final int dpToPx(int i10, Context context) {
        l.f("context", context);
        return (int) dpToPx(i10, context);
    }

    public static final float dpToPx(float f9, Context context) {
        l.f("context", context);
        return f9 * context.getResources().getDisplayMetrics().density;
    }
}
