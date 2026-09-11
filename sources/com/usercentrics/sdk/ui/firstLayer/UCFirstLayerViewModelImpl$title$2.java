package com.usercentrics.sdk.ui.firstLayer;

import android.graphics.Typeface;
import com.usercentrics.sdk.FirstLayerStyleSettings;
import com.usercentrics.sdk.SectionAlignment;
import com.usercentrics.sdk.TitleSettings;
import eh.a;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class UCFirstLayerViewModelImpl$title$2 extends m implements a {
    final FirstLayerStyleSettings $settings;
    final UCFirstLayerViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UCFirstLayerViewModelImpl$title$2(UCFirstLayerViewModelImpl uCFirstLayerViewModelImpl, FirstLayerStyleSettings firstLayerStyleSettings) {
        super(0);
        this.this$0 = uCFirstLayerViewModelImpl;
        this.$settings = firstLayerStyleSettings;
    }

    @Override // eh.a
    public final UCFirstLayerTitle invoke() {
        TitleSettings title;
        TitleSettings title2;
        TitleSettings title3;
        TitleSettings title4;
        String title5 = this.this$0.layerSettings.getHeaderSettings().getTitle();
        FirstLayerStyleSettings firstLayerStyleSettings = this.$settings;
        SectionAlignment alignment = null;
        Typeface font = (firstLayerStyleSettings == null || (title4 = firstLayerStyleSettings.getTitle()) == null) ? null : title4.getFont();
        FirstLayerStyleSettings firstLayerStyleSettings2 = this.$settings;
        Float textSizeInSp = (firstLayerStyleSettings2 == null || (title3 = firstLayerStyleSettings2.getTitle()) == null) ? null : title3.getTextSizeInSp();
        FirstLayerStyleSettings firstLayerStyleSettings3 = this.$settings;
        Integer textColor = (firstLayerStyleSettings3 == null || (title2 = firstLayerStyleSettings3.getTitle()) == null) ? null : title2.getTextColor();
        FirstLayerStyleSettings firstLayerStyleSettings4 = this.$settings;
        if (firstLayerStyleSettings4 != null && (title = firstLayerStyleSettings4.getTitle()) != null) {
            alignment = title.getAlignment();
        }
        return new UCFirstLayerTitle(title5, font, textSizeInSp, textColor, alignment);
    }
}
