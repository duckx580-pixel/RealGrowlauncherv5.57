package com.usercentrics.sdk.models.settings;

import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class PredefinedUIToggleLocalizations {
    private final String offText;
    private final String onText;

    public PredefinedUIToggleLocalizations(String str, String str2) {
        l.f("onText", str);
        l.f("offText", str2);
        this.onText = str;
        this.offText = str2;
    }

    public final String getTextForState(boolean z3) {
        return z3 ? this.onText : this.offText;
    }
}
