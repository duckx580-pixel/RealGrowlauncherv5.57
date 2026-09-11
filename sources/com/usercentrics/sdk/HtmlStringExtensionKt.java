package com.usercentrics.sdk;

import android.text.Spanned;
import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;
import com.usercentrics.sdk.v2.settings.data.UsercentricsLabels;
import com.usercentrics.sdk.v2.settings.data.UsercentricsSettings;
import kotlin.jvm.internal.l;
import q3.c;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class HtmlStringExtensionKt {
    public static final Spanned getFirstLayerDescription(UsercentricsSettings usercentricsSettings) {
        l.f("<this>", usercentricsSettings);
        return spannedString(usercentricsSettings.getFirstLayerDescriptionHtml());
    }

    public static final Spanned getFirstLayerMobileDescription(UsercentricsSettings usercentricsSettings) {
        l.f("<this>", usercentricsSettings);
        return spannedString(usercentricsSettings.getFirstLayerMobileDescriptionHtml());
    }

    public static final Spanned getSecondLayerDescription(UsercentricsLabels usercentricsLabels) {
        l.f("<this>", usercentricsLabels);
        return spannedString(usercentricsLabels.getSecondLayerDescriptionHtml());
    }

    private static final Spanned spannedString(String str) {
        if (str == null) {
            str = PredefinedUICustomizationFont.defaultFamily;
        }
        Spanned spannedA = c.a(str, 0);
        l.e("fromHtml(...)", spannedA);
        return spannedA;
    }
}
