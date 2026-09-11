package com.usercentrics.sdk.ui.components.cards;

import com.usercentrics.sdk.models.settings.PredefinedUIAriaLabels;
import com.usercentrics.sdk.ui.PredefinedUIDependencyManager;
import eh.a;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class UCCardSections$ariaLabels$2 extends m implements a {
    public static final UCCardSections$ariaLabels$2 INSTANCE = new UCCardSections$ariaLabels$2();

    public UCCardSections$ariaLabels$2() {
        super(0);
    }

    @Override // eh.a
    public final PredefinedUIAriaLabels invoke() {
        return PredefinedUIDependencyManager.INSTANCE.getAriaLabels();
    }
}
