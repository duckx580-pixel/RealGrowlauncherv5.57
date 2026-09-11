package com.usercentrics.sdk.ui.extensions;

import android.content.Context;
import eh.a;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class PredefinedUIContextExtensions {
    public static final PredefinedUIContextExtensions INSTANCE = new PredefinedUIContextExtensions();

    private PredefinedUIContextExtensions() {
    }

    public final void safeShowBanner(Context context, a aVar) {
        l.f("context", context);
        l.f("showBannerHandler", aVar);
        ContextExtensionsKt.safeShowBanner(context, aVar);
    }

    public final Context themed(Context context) {
        l.f("context", context);
        return ContextExtensionsKt.themed(context);
    }
}
