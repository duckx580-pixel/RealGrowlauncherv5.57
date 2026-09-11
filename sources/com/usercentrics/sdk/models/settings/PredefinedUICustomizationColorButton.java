package com.usercentrics.sdk.models.settings;

import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class PredefinedUICustomizationColorButton {
    private final String background;
    private final int cornerRadius;
    private final String text;

    public PredefinedUICustomizationColorButton(String str, String str2, int i10) {
        l.f("text", str);
        l.f("background", str2);
        this.text = str;
        this.background = str2;
        this.cornerRadius = i10;
    }

    public final String getBackground() {
        return this.background;
    }

    public final int getCornerRadius() {
        return this.cornerRadius;
    }

    public final String getText() {
        return this.text;
    }
}
