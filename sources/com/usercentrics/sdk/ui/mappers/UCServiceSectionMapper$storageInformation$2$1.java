package com.usercentrics.sdk.ui.mappers;

import com.usercentrics.sdk.models.settings.PredefinedUISDKButtonInfo;
import eh.a;
import kotlin.jvm.internal.m;
import qg.o;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class UCServiceSectionMapper$storageInformation$2$1 extends m implements a {
    final PredefinedUISDKButtonInfo $it;
    final UCServiceSectionMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UCServiceSectionMapper$storageInformation$2$1(UCServiceSectionMapper uCServiceSectionMapper, PredefinedUISDKButtonInfo predefinedUISDKButtonInfo) {
        super(0);
        this.this$0 = uCServiceSectionMapper;
        this.$it = predefinedUISDKButtonInfo;
    }

    @Override // eh.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m88invoke();
        return o.f13926a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m88invoke() {
        this.this$0.onShowSDKDialog.invoke(this.$it);
    }
}
