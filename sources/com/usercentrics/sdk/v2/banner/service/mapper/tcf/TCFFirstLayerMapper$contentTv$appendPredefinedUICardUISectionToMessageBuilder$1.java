package com.usercentrics.sdk.v2.banner.service.mapper.tcf;

import com.usercentrics.sdk.models.settings.PredefinedUICardUI;
import eh.c;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class TCFFirstLayerMapper$contentTv$appendPredefinedUICardUISectionToMessageBuilder$1 extends m implements c {
    public static final TCFFirstLayerMapper$contentTv$appendPredefinedUICardUISectionToMessageBuilder$1 INSTANCE = new TCFFirstLayerMapper$contentTv$appendPredefinedUICardUISectionToMessageBuilder$1();

    public TCFFirstLayerMapper$contentTv$appendPredefinedUICardUISectionToMessageBuilder$1() {
        super(1);
    }

    @Override // eh.c
    public final CharSequence invoke(PredefinedUICardUI predefinedUICardUI) {
        l.f("it", predefinedUICardUI);
        return predefinedUICardUI.getTitle();
    }
}
