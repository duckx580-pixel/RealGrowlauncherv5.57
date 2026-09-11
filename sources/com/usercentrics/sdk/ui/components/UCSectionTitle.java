package com.usercentrics.sdk.ui.components;

import android.content.Context;
import android.util.AttributeSet;
import com.usercentrics.sdk.ui.R;
import com.usercentrics.sdk.ui.components.cards.UCSectionTitlePM;
import com.usercentrics.sdk.ui.theme.UCThemeData;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class UCSectionTitle extends UCTextView {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UCSectionTitle(Context context) {
        this(context, null);
        l.f("context", context);
    }

    public final void bind(UCSectionTitlePM uCSectionTitlePM) {
        l.f("model", uCSectionTitlePM);
        setText(uCSectionTitlePM.getTitle());
    }

    public final void style(UCThemeData uCThemeData) {
        l.f("theme", uCThemeData);
        styleSectionTitle(uCThemeData);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UCSectionTitle(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        l.f("context", context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UCSectionTitle(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        l.f("context", context);
        setPaddingRelative((int) context.getResources().getDimension(R.dimen.ucCardHorizontalMargin), (int) context.getResources().getDimension(R.dimen.ucCardVerticalMargin), 0, 0);
    }
}
