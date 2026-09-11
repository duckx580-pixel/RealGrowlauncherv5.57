package com.usercentrics.sdk.models.settings;

import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class PredefinedUICustomization {
    private final ButtonAlignment buttonAlignment;
    private final PredefinedUICustomizationColor color;
    private final int cornerRadius;
    private final PredefinedUICustomizationFont font;
    private final String logoUrl;

    public PredefinedUICustomization(PredefinedUICustomizationColor predefinedUICustomizationColor, PredefinedUICustomizationFont predefinedUICustomizationFont, String str, int i10, ButtonAlignment buttonAlignment) {
        l.f("color", predefinedUICustomizationColor);
        l.f("font", predefinedUICustomizationFont);
        l.f("buttonAlignment", buttonAlignment);
        this.color = predefinedUICustomizationColor;
        this.font = predefinedUICustomizationFont;
        this.logoUrl = str;
        this.cornerRadius = i10;
        this.buttonAlignment = buttonAlignment;
    }

    public final ButtonAlignment getButtonAlignment() {
        return this.buttonAlignment;
    }

    public final PredefinedUICustomizationColor getColor() {
        return this.color;
    }

    public final int getCornerRadius() {
        return this.cornerRadius;
    }

    public final PredefinedUICustomizationFont getFont() {
        return this.font;
    }

    public final String getLogoUrl() {
        return this.logoUrl;
    }

    public /* synthetic */ PredefinedUICustomization(PredefinedUICustomizationColor predefinedUICustomizationColor, PredefinedUICustomizationFont predefinedUICustomizationFont, String str, int i10, ButtonAlignment buttonAlignment, int i11, g gVar) {
        this(predefinedUICustomizationColor, predefinedUICustomizationFont, str, i10, (i11 & 16) != 0 ? ButtonAlignment.DEFAULT : buttonAlignment);
    }
}
